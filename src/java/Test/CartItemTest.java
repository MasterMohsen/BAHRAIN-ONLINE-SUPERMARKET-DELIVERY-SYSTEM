package example.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class CartItemTest {

    // Helper: create a sample cart item
    private CartItem getSampleCartItem() {
        Product p = new Product("P1", "Laptop", "High performance laptop", 999.99);
        return new CartItem(p, 2);
    }

    // Test 1: getProduct should return correct product
    @Test
    public void testGetProduct() {
        CartItem item = getSampleCartItem();
        assertEquals("P1", item.getProduct().getId());
    }

    // Test 2: getQuantity should return correct quantity
    @Test
    public void testGetQuantity() {
        CartItem item = getSampleCartItem();
        assertEquals(2, item.getQuantity());
    }

    // Test 3: setQuantity should update quantity
    @Test
    public void testSetQuantity() {
        CartItem item = getSampleCartItem();
        item.setQuantity(5);
        assertEquals(5, item.getQuantity());
    }

    // Test 4: getSubtotal should return price * quantity
    @Test
    public void testGetSubtotal() {
        CartItem item = getSampleCartItem();
        // 999.99 * 2 = 1999.98
        assertEquals(1999.98, item.getSubtotal(), 0.01);
    }

    // Test 5: getSubtotal with quantity 1 should equal product price
    @Test
    public void testGetSubtotalQuantityOne() {
        Product p = new Product("P2", "Mouse", "Wireless mouse", 29.99);
        CartItem item = new CartItem(p, 1);
        assertEquals(29.99, item.getSubtotal(), 0.01);
    }

    // Test 6: toString should contain product name, quantity, subtotal
    @Test
    public void testToString() {
        CartItem item = getSampleCartItem();
        String result = item.toString();
        assertTrue(result.contains("Laptop"));
        assertTrue(result.contains("2"));
        assertTrue(result.contains("1999.98"));
    }
}