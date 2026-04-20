package example.service;

import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import example.model.CartItem;
import example.model.Product;
import org.junit.Test;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;



public class CheckoutServiceTest {

    private List<CartItem> getSampleCart() {
        List<CartItem> items = new ArrayList<>();
        items.add(new CartItem(new Product("P1", "Laptop", "desc", 999.99), 1));
        return items;
    }


    // Test 1: createCheckoutSession with empty cart should throw Exception
    @Test(expected = Exception.class)
    public void testCreateSessionWithEmptyCartThrowsException() throws Exception {
        List<CartItem> emptyCart = new ArrayList<>();
        CheckoutService.createCheckoutSession("test@email.com", emptyCart);
    }

    // Test 2: createCheckoutSession with null email should throw Exception
    @Test(expected = Exception.class)
    public void testCreateSessionWithNullEmailThrowsException() throws Exception {
        List<CartItem> items = new ArrayList<>();
        items.add(new CartItem(new Product("P1", "Laptop", "desc", 999.99), 1));
        CheckoutService.createCheckoutSession(null, items);
    }

    // Test 3: checkSessionStatus with invalid session ID should throw Exception
    @Test(expected = Exception.class)
    public void testCheckSessionStatusInvalidId() throws Exception {
        CheckoutService.checkSessionStatus("invalid_session_id");
    }

    // Test 4: checkSessionStatus with empty session ID should throw Exception
    @Test(expected = Exception.class)
    public void testCheckSessionStatusEmptyId() throws Exception {
        CheckoutService.checkSessionStatus("");
    }

    // Test 5: createCheckoutSession should return a URL
    @Test
    public void testCreateSessionReturnsUrl() throws Exception {
        // Step 1: Create a fake Session object
        Session mockSession = mock(Session.class);

        // Step 2: Tell the fake session what to return when getUrl() is called
        when(mockSession.getUrl()).thenReturn("https://checkout.stripe.com/fake-url");

        // Step 3: Fake the static Stripe method Session.create()
        try (MockedStatic<Session> mockedStatic = mockStatic(Session.class)) {
            mockedStatic.when( //.when(...) defines which static call you want to intercept.
                            () //Mockito uses it to identify exactly which method invocation to mock.
                                    -> Session.create((SessionCreateParams) any())//any() means “accept any argument”.It’s cast to SessionCreateParams because Session.create() expects that type.
                                                                                // Any call to Session.create() regardless of the params passed
                            )
                    .thenReturn(mockSession); // return our fake session instead of calling real Stripe

            //Mockito will return mockSession (a fake/mock object you created earlier).
            // Step 4: Call the real method
            String url = CheckoutService.createCheckoutSession("test@email.com", getSampleCart());

            // Step 5: Check the result
            assertNotNull(url);                                         // URL is not null
            assertTrue(url.startsWith("https://checkout.stripe.com")); // URL looks valid
        }
    }

    // Test 6: checkSessionStatus should return "paid"
    @Test
    public void testCheckSessionStatusReturnsPaid() throws Exception {
        // Step 1: Create a fake Session object
        Session mockSession = mock(Session.class);

        // Step 2: Tell fake session what to return
        when(mockSession.getStatus()).thenReturn("complete");
        when(mockSession.getPaymentStatus()).thenReturn("paid");

        // Step 3: Fake Session.retrieve() to return our fake session
        try (MockedStatic<Session> mockedStatic = mockStatic(Session.class)) {
            mockedStatic.when(() -> Session.retrieve("sess_123"))////.when(...) defines which static call you want to intercept.
                    .thenReturn(mockSession); // when retrieve is called with "sess_123" → return fake session

            // Step 4: Call the real method
            String paymentStatus = CheckoutService.checkSessionStatus("sess_123");

            // Step 5: Check the result
            assertEquals("paid", paymentStatus); // should return "paid"

        }

    }

    // Test 7: checkSessionStatus should return "unpaid"
    @Test
    public void testCheckSessionStatusReturnsUnpaid() throws Exception {
        // Step 1: Create a fake Session object
        Session mockSession = mock(Session.class);

        // Step 2: Tell fake session to return "unpaid"
        when(mockSession.getPaymentStatus()).thenReturn("unpaid");

        // Step 3: Fake Session.retrieve() with a DIFFERENT session ID
        try (MockedStatic<Session> mockedStatic = mockStatic(Session.class)) {
            mockedStatic.when(() -> Session.retrieve("sess_456"))
                    .thenReturn(mockSession);

            // Step 4: Call the real method
            String paymentStatus = CheckoutService.checkSessionStatus("sess_456");

            // Step 5: Check the result
            assertEquals("unpaid", paymentStatus); // should return "unpaid"
        }    }

}