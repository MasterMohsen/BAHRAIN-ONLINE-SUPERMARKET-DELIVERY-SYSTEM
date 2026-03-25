package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Data Layer Class.
 * This class simulates database operations.
 * It stores products in memory using ArrayList.
 */
public class ProductRepository {

    // List that acts as an in-memory database
    private List<main.java.Product> productList = new ArrayList<>();

    /**
     * Adds a new product to the repository.
     */
    public void addProduct(main.java.Product product) {
        productList.add(product);
    }

    /**
     * Deletes a product by its ID.
     * Returns true if deletion is successful.
     */
    public boolean deleteProduct(int productId) {
        return productList.removeIf(p -> p.getId() == productId);
    }

    /**
     * Updates an existing product.
     * Returns true if product is found and updated.
     */
    public boolean updateProduct(main.java.Product updatedProduct) {
        for (main.java.Product p : productList) {
            if (p.getId() == updatedProduct.getId()) {
                p.setName(updatedProduct.getName());
                p.setPrice(updatedProduct.getPrice());
                return true;
            }
        }
        return false;
    }

    /**
     * Returns all products.
     */
    public List<main.java.Product> getAllProducts() {
        return productList;
    }
}
