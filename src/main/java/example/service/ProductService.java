package example.service;

import example.model.Product;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProductService {

    private static final Map<String, Product> PRODUCTS = new LinkedHashMap<>();

    static {
        PRODUCTS.put("P1", new Product("P1", "Laptop",        "High performance laptop",    999.99));
        PRODUCTS.put("P2", new Product("P2", "Mouse",         "Wireless ergonomic mouse",    29.99));
        PRODUCTS.put("P3", new Product("P3", "Keyboard",      "Mechanical keyboard",         79.99));
        PRODUCTS.put("P4", new Product("P4", "Monitor",       "27-inch 4K monitor",         349.99));
        PRODUCTS.put("P5", new Product("P5", "Headphones",    "Noise cancelling headphones", 149.99));
        PRODUCTS.put("P6", new Product("P6", "Webcam",        "1080p HD webcam",             59.99));
        PRODUCTS.put("P7", new Product("P7", "USB Hub",       "7-port USB 3.0 hub",          39.99));
        PRODUCTS.put("P8", new Product("P8", "Desk Lamp",     "LED adjustable desk lamp",    24.99));
    }

    public static Map<String, Product> getAllProducts() {
        return PRODUCTS;
    }

    public static Product getProductById(String id) {
        return PRODUCTS.get(id.toUpperCase());
    }

    public static void displayProducts() {
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║                   🛍️  PRODUCT CATALOG                ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        for (Product p : PRODUCTS.values()) {
            System.out.println("║  " + p);
        }
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }
}