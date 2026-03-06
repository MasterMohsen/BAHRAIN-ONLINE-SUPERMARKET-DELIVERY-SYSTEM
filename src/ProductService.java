/**
 * Business Layer Class.
 * This class contains business logic and validation rules.
 * It communicates between Presentation layer and Data layer.
 */
public class ProductService {

    // Reference to Data Layer
    private ProductRepository repository;

    /**
     * Constructor to inject repository dependency.
     */
    public ProductService(ProductRepository repository) {
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

        Product product = new Product(id, name, price);
        repository.addProduct(product);
        System.out.println("Product added successfully.");
    }

    /**
     * Deletes a product after checking existence.
     */
    public void deleteProduct(int id) {
        boolean deleted = repository.deleteProduct(id);

        if (deleted) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
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

        Product updatedProduct = new Product(id, name, price);
        boolean updated = repository.updateProduct(updatedProduct);

        if (updated) {
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    /**
     * Displays all products.
     */
    public void displayProducts() {
        for (Product p : repository.getAllProducts()) {
            System.out.println(p);
        }
    }
}