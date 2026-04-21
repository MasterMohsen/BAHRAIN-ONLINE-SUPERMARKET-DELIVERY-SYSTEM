package example.service;

import example.model.Product;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class ProductServiceTest {

    // Test 1: getAllProducts should return 8 products
    @Test
    public void testGetAllProductsSize() {
        Map<String, Product> products = ProductService.getAllProducts();
        assertEquals(8, products.size());
    }

    // Test 2: getProductById with valid ID should return correct product
    @Test
    public void testGetProductByIdValid() {
        Product product = ProductService.getProductById("P1");
        assertNotNull(product);
        assertEquals("P1", product.getId());
    }

    // Test 3: getProductById should be case-insensitive
    @Test
    public void testGetProductByIdCaseInsensitive() {
        Product product = ProductService.getProductById("p1"); // lowercase
        assertNotNull(product);
        assertEquals("P1", product.getId());
    }

    // Test 4: getProductById with invalid ID should return null
    @Test
    public void testGetProductByIdInvalid() {
        Product product = ProductService.getProductById("P99");
        assertNull(product);
    }

    // Test 5: getAllProducts should not be null
    @Test
    public void testGetAllProductsNotNull() {
        assertNotNull(ProductService.getAllProducts());
    }

    // Test 6: Product P2 should be "Mouse"
    @Test
    public void testProductNameCorrect() {
        Product product = ProductService.getProductById("P2");
        assertEquals("Mouse", product.getName());
    }

}
