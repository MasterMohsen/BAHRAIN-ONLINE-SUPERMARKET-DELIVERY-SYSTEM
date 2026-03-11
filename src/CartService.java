import java.util.List;

/**
 * Business Layer Class
 * --------------------
 * This class contains the business logic for the cart system.
 * It communicates with the data layer to store and retrieve items.
 */
public class CartService {

    private CartData cartData;

    /**
     * Constructor receives the data layer dependency.
     *
     * @param cartData The data layer used to store cart items
     */
    public CartService(CartData cartData) {
        this.cartData = cartData;
    }

    /**
     * Adds an item to the cart after performing basic validation.
     *
     * @param item Item name
     * @return Message describing the result of the operation
     */
    public String addToCart(String item) {

        // Validate that the item name is not empty
        if (item == null || item.trim().isEmpty()) {
            return "Item name cannot be empty.";
        }

        // Call data layer to store item
        cartData.addItem(item);

        return item + " added to cart.";
    }

    /**
     * Retrieves all items from the cart.
     *
     * @return List of cart items
     */
    public List<String> viewCart() {
        return cartData.getItems();
    }
}