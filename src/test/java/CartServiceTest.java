import main.java.CartData;
import main.java.CartService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for the Business layer
 */
public class CartServiceTest {

    private CartData cartData;
    private CartService cartService;

    @BeforeEach
    public void setUp() {
        cartData = new CartData();
        cartService = new CartService(cartData);
    }

    @Test
    public void testAddToCartValidItem() {
        String result = cartService.addToCart("Banana");
        assertEquals("Banana added to cart.", result);
        List<String> items = cartService.viewCart();
        assertTrue(items.contains("Banana"));
    }

    @Test
    public void testAddToCartEmptyItem() {
        String result = cartService.addToCart("");
        assertEquals("Item name cannot be empty.", result);
        assertTrue(cartService.viewCart().isEmpty(), "Cart should remain empty");
    }

    @Test
    public void testViewCartWithMultipleItems() {
        cartService.addToCart("Apple");
        cartService.addToCart("Orange");
        List<String> items = cartService.viewCart();
        assertEquals(2, items.size());
        assertTrue(items.contains("Apple"));
        assertTrue(items.contains("Orange"));
    }
}