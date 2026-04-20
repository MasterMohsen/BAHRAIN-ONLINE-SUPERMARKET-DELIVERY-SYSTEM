package main.java;

/**
 * Main class used to start the program.
 * It creates objects for each layer and connects them together.
 */

public class entryPoint {
    public static void main(String[] args) {
        // tt
        // Create data layer
        main.java.CartData dataLayer = new main.java.CartData();

        // Create business layer
        main.java.CartService businessLayer = new main.java.CartService(dataLayer);

        // Create presentation layer
        main.java.CartUI ui = new main.java.CartUI(businessLayer);

        // Start the application
        ui.start();
    }
}
