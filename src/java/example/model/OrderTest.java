package example.model;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class OrderTest {

    // Helper: create a sample order
    private Order getSampleOrder() {
        Address address = new Address("John Doe", "123 Main St", "Manama", "Bahrain", "+973 33333333");
        List<CartItem> items = new ArrayList<>();
        items.add(new CartItem(new Product("P1", "Laptop", "desc", 999.99), 1));
        return new Order("test@email.com", address, items, 999.99, "pi_123");
    }

    // Test 1: getOrderId should start with "ORD-"
    @Test
    public void testOrderIdStartsWithORD() {
        Order order = getSampleOrder();
        assertTrue(order.getOrderId().startsWith("ORD-"));
    }

    // Test 2: getCustomerEmail should return correct email
    @Test
    public void testGetCustomerEmail() {
        Order order = getSampleOrder();
        assertEquals("test@email.com", order.getCustomerEmail());
    }

    // Test 3: getAddress should not be null
    @Test
    public void testGetAddressNotNull() {
        Order order = getSampleOrder();
        assertNotNull(order.getAddress());
    }

    // Test 4: getItems should not be empty
    @Test
    public void testGetItemsNotEmpty() {
        Order order = getSampleOrder();
        assertFalse(order.getItems().isEmpty());
    }

    // Test 5: getTotalAmount should return correct total
    @Test
    public void testGetTotalAmount() {
        Order order = getSampleOrder();
        assertEquals(999.99, order.getTotalAmount(), 0.01);
    }

    // Test 6: getPaymentIntentId should return correct ID
    @Test
    public void testGetPaymentIntentId() {
        Order order = getSampleOrder();
        assertEquals("pi_123", order.getPaymentIntentId());
    }

    // Test 7: status should be "PAID" by default
    @Test
    public void testDefaultStatusIsPaid() {
        Order order = getSampleOrder();
        assertEquals("PAID", order.getStatus());
    }

    // Test 8: getCreatedAt should not be null
    @Test
    public void testGetCreatedAtNotNull() {
        Order order = getSampleOrder();
        assertNotNull(order.getCreatedAt());
    }

    // Test 9: two orders should have different IDs
    @Test
    public void testTwoOrdersHaveDifferentIds() throws InterruptedException {
        Order order1 = getSampleOrder();
        Thread.sleep(1); // wait 1ms so timestamp is different
        Order order2 = getSampleOrder();
        assertNotEquals(order1.getOrderId(), order2.getOrderId());
    }
}