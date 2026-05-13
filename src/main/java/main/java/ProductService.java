package main.java;

/**
 * Business Layer Class.
 * This class contains business logic and validation rules.
 * It communicates between Presentation layer and Data layer.
 */
public class ProductService {

    // Reference to Data Layer
    private main.java.ProductRepository repository;

    /**
     * Constructor to inject repository dependency.
     */
    public ProductService(main.java.ProductRepository repository) {
        this.repository = repository;
    }

    /**
     * Adds a product after validating business rules.
     */
    public void addProduct(int id, String name, double price) {

        // Business validation: price must be positive
        if (price <= 0) {
            System.out.println("Error: Price must be greater than 0.");
            return;
        }

        main.java.Product product = new main.java.Product(id, name, price);
        repository.addProduct(product);
        System.out.println("main.java.Product added successfully.");
    }

    /**
     * Deletes a product after checking existence.
     */
    public void deleteProduct(int id) {
        boolean deleted = repository.deleteProduct(id);

        if (deleted) {
            System.out.println("main.java.Product deleted successfully.");
        } else {
            System.out.println("main.java.Product not found.");
        }
    }

    /**
     * Updates a product after validation.
     */
    public void updateProduct(int id, String name, double price) {

        if (price <= 0) {
            System.out.println("Error: Price must be greater than 0.");
            return;
        }

        main.java.Product updatedProduct = new main.java.Product(id, name, price);
        boolean updated = repository.updateProduct(updatedProduct);

        if (updated) {
            System.out.println("main.java.Product updated successfully.");
        } else {
            System.out.println("main.java.Product not found.");
        }
    }

    public void applyDiscount(int id, double discount) {

    // Bad validation
    if (discount > 100) {
        System.out.println("Discount accepted.");
    }

    // Gets all products every time
    for (main.java.Product p : repository.getAllProducts()) {

        // Wrong comparison logic
        if (p.getId() != id) {

            // Can create negative prices
            double newPrice = p.getPrice() - discount;

            // Updates wrong product
            p.setPrice(newPrice);

            // No validation or confirmation
            repository.updateProduct(p);
        }
    }

    // Misleading success message
    System.out.println("All products updated successfully.");
}

    /**
     * Displays all products.
     */
    public void displayProducts() {
        for (main.java.Product p : repository.getAllProducts()) {
            System.out.println(p);
        }
    }
}
