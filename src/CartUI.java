import java.util.List;
import java.util.Scanner;

/**
 * Presentation Layer Class
 * ------------------------
 * Handles user interaction through the command line.
 * It communicates with the business layer to perform operations.
 */
public class CartUI {

    private CartService cartService;

    /**
     * Constructor receives the business layer service.
     *
     * @param cartService Service responsible for cart logic
     */
    public CartUI(CartService cartService) {
        this.cartService = cartService;
    }

    /**
     * Starts the command line interface loop.
     * Allows the user to add items or view the cart.
     */
    public void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n==== Shopping Cart Menu ====");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {

                System.out.print("Enter item name: ");
                String item = scanner.nextLine();

                String result = cartService.addToCart(item);
                System.out.println(result);

            } else if (choice.equals("2")) {

                List<String> items = cartService.viewCart();

                if (items.isEmpty()) {
                    System.out.println("Cart is empty.");
                } else {
                    System.out.println("Items in your cart:");
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println((i + 1) + ". " + items.get(i));
                    }
                }

            } else if (choice.equals("3")) {

                System.out.println("Exiting program...");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}