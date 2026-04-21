package example.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    // Helper: create a sample product
    private Product getSampleProduct() {
        return new Product("P1", "Laptop", "High performance laptop", 999.99);
    }

    // Test 1: getId should return correct id
    @Test
    public void testGetId() {
        Product p = getSampleProduct();
        assertEquals("P1", p.getId());
    }

    // Test 2: getName should return correct name
    @Test
    public void testGetName() {
        Product p = getSampleProduct();
        assertEquals("Laptop", p.getName());
    }

    // Test 3: getDescription should return correct description
    @Test
    public void testGetDescription() {
        Product p = getSampleProduct();
        assertEquals("High performance laptop", p.getDescription());
    }

    // Test 4: getPrice should return correct price
    @Test
    public void testGetPrice() {
        Product p = getSampleProduct();
        assertEquals(999.99, p.getPrice(), 0.01);
    }

    // Test 5: toString should contain id, name, price, description
    @Test
    public void testToString() {
        Product p = getSampleProduct();
        String result = p.toString();
        assertTrue(result.contains("P1"));
        assertTrue(result.contains("Laptop"));
        assertTrue(result.contains("999.99"));
        assertTrue(result.contains("High performance laptop"));
    }

    // Test 6: price should not be negative
    @Test
    public void testPriceNotNegative() {
        Product p = getSampleProduct();
        assertTrue(p.getPrice() >= 0);
    }
}