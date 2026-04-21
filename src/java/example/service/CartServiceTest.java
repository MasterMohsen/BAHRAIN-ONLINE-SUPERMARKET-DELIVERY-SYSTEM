package example.service;

import example.model.CartItem;
import example.model.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CartServiceTest {

    private Product product1;
    private Product product2;

    @Before // This annotation runs before EACH test method automatically. It's used to set up a clean state before every test
    public void setUp() {
        // Clear cart before each test
        CartService.clearCart();
        product1 = new Product("P1", "Laptop", "High performance laptop", 999.99);
        product2 = new Product("P2", "Mouse", "Wireless mouse", 29.99);
    }

    // Test 1: Cart should be empty at start
    @Test //This annotation tells JUnit "this method is a test". Without it, JUnit won't know which methods to run automatically
    public void testCartIsEmptyAtStart() {
        assertTrue(CartService.isEmpty()); // if return 'true' the test pass
    }

    // Test 2: Adding a product should make cart non-empty
    @Test
    public void testAddProductToCart() {
        CartService.addProduct(product1, 1);
        assertFalse(CartService.isEmpty()); //if return 'false' the test pass
    }

    // Test 3: Adding same product twice should increase quantity
    @Test
    public void testAddSameProductIncreasesQuantity() {
        CartService.addProduct(product1, 1);//add product P1 with quantity 1
        CartService.addProduct(product1, 2);//add the same product P1 with quantity 2

        List<CartItem> cart = CartService.getCart();//return current cart
        assertEquals(1, cart.size());// checks that the cart still has only 1 item
        assertEquals(3, cart.get(0).getQuantity()); // checks that the quantity became 3
    }

    // Test 4: Removing a product should work
    @Test
    public void testRemoveProduct() {
        CartService.addProduct(product1, 1);//add product P1 with quantity 1
        CartService.removeProduct("P1");// call removeProduct with ID 'P1'
        assertTrue(CartService.isEmpty()); //checks that the cart is empty again
    }

    // Test 5: Removing a product that doesn't exist should not crash
    @Test
    public void testRemoveNonExistentProduct() {
        CartService.removeProduct("P99"); // should not throw exception
        assertTrue(CartService.isEmpty());
    }

    // Test 6: getTotal should return correct value
    @Test
    public void testGetTotal() {
        CartService.addProduct(product1, 1); // add product P1 with price 999.99 and quantity 1,
        CartService.addProduct(product2, 2); // add product P2 with price 29.99 and quantity 2
        double expected = 999.99 + 59.98;
        assertEquals(expected, CartService.getTotal(), 0.01); //delta means |expected - actual| ≤ 0.01
    }

    // Test 7: clearCart should empty the cart
    @Test
    public void testClearCart() {
        CartService.addProduct(product1, 1);
        CartService.clearCart();
        assertTrue(CartService.isEmpty());
    }

    // Test 8: getTotal on empty cart should return 0
    @Test
    public void testGetTotalEmptyCart() {
        assertEquals(0.0, CartService.getTotal(), 0.01);
    }
}