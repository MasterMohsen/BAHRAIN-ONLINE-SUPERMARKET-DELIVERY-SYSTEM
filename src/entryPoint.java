/**
 * Main class used to start the program.
 * It creates objects for each layer and connects them together.
 */

public class entryPoint {
    public static void main(String[] args) {

        // Create data layer
        CartData dataLayer = new CartData();

        // Create business layer
        CartService businessLayer = new CartService(dataLayer);

        // Create presentation layer
        CartUI ui = new CartUI(businessLayer);

        // Start the application
        ui.start();
    }
}
