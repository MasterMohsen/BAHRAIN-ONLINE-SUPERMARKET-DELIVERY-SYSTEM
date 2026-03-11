import java.util.ArrayList;
import java.util.List;

/**
 * Data Layer Class
 * ----------------
 * This class represents the data storage for the cart.
 * It acts like a very simple in-memory database that stores cart items.
 */
public class CartData {

    // List used to store cart items
    private List<String> cartItems;

    /**
     * Constructor initializes the cart item list.
     */
    public CartData() {
        cartItems = new ArrayList<>();
    }

    /**
     * Adds an item to the cart storage.
     *
     * @param item Name of the item to add
     */
    public void addItem(String item) {
        cartItems.add(item);
    }

    /**
     * Returns all items currently stored in the cart.
     *
     * @return List of cart items
     */
    public List<String> getItems() {
        return cartItems;
    }
}