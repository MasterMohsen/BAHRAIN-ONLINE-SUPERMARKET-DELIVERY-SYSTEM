package example.service;

import example.model.Address;
import example.model.CartItem;
import example.model.Order;
import example.model.Product;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OrderServiceTest {

    // Helper method to build a sample order
    private List<CartItem> getSampleItems() {
        Product p = new Product("P1", "Laptop", "High performance laptop", 999.99);
        List<CartItem> items = new ArrayList<>();
        items.add(new CartItem(p, 1));
        return items;
    }

    private Address getSampleAddress() {
        return new Address("John Doe", "123 Main St", "Manama", "Bahrain", "+973 33333333");
    }

    // Test 1: createOrder should return a non-null Order
    @Test
    public void testCreateOrderNotNull() {
        Order order = OrderService.createOrder(
                "test@email.com",
                getSampleAddress(),
                getSampleItems(),
                999.99,
                "pi_test_123"
        );
        assertNotNull(order);
    }

    // Test 2: Order should have correct email
    @Test
    public void testCreateOrderEmail() {
        Order order = OrderService.createOrder(
                "elias@email.com",
                getSampleAddress(),
                getSampleItems(),
                999.99,
                "pi_test_123"
        );
        assertEquals("elias@email.com", order.getCustomerEmail());
    }

    // Test 3: Order should have correct total
    @Test
    public void testCreateOrderTotal() {
        Order order = OrderService.createOrder(
                "test@email.com",
                getSampleAddress(),
                getSampleItems(),
                999.99,
                "pi_test_123"
        );
        assertEquals(999.99, order.getTotalAmount(), 0.01);
    }

    // Test 4: Order should have correct payment ID
    @Test
    public void testCreateOrderPaymentId() {
        Order order = OrderService.createOrder(
                "test@email.com",
                getSampleAddress(),
                getSampleItems(),
                999.99,
                "pi_abc_456"
        );
        assertEquals("pi_abc_456", order.getPaymentIntentId());
    }

    // Test 5: Order should have correct items
    @Test
    public void testCreateOrderItems() {
        List<CartItem> items = getSampleItems();
        Order order = OrderService.createOrder(
                "test@email.com",
                getSampleAddress(),
                items,
                999.99,
                "pi_test_123"
        );
        assertEquals(1, order.getItems().size());
    }
}