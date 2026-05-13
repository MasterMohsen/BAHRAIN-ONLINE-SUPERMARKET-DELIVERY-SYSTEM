import main.java.CartData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for the CartData class
 */
public class CartDataTest {

    private CartData cartData;

    @BeforeEach
    public void setUp() {
        cartData = new CartData();
    }

    @Test
    public void testAddItem() {
        cartData.addItem("Apple");
        List<String> items = cartData.getItems();
        assertEquals(1, items.size(), "Cart should contain 1 item");
        assertTrue(items.contains("Apple"), "Cart should contain 'Apple'");
    }

    @Test
    public void testGetItemsEmptyCart() {
        List<String> items = cartData.getItems();
        assertTrue(items.isEmpty(), "Cart should initially be empty");
    }
}