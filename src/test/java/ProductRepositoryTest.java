import main.java.Product;
import main.java.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/**
 * Test class for ProductRepository (Data Layer).
 * This class tests CRUD operations on the repository.
 */
public class ProductRepositoryTest {

    private ProductRepository repository;

    /**
     * This method runs before each test.
     * It initializes a fresh repository.
     */
    @BeforeEach
    void setUp() {
        repository = new ProductRepository();
    }

    /**
     * Test adding a product.
     */
    @Test
    void testAddProduct() {
        Product p = new Product(1, "Laptop", 1000);

        repository.addProduct(p);

        List<Product> products = repository.getAllProducts();
        assertEquals(1, products.size());
        assertEquals("Laptop", products.get(0).getName());
    }

    /**
     * Test deleting a product.
     */
    @Test
    void testDeleteProduct() {
        Product p = new Product(1, "Phone", 500);
        repository.addProduct(p);

        boolean result = repository.deleteProduct(1);

        assertTrue(result);
        assertEquals(0, repository.getAllProducts().size());
    }

    /**
     * Test updating a product.
     */
    @Test
    void testUpdateProduct() {
        Product p = new Product(1, "Tablet", 300);
        repository.addProduct(p);

        Product updated = new Product(1, "Tablet Pro", 600);
        boolean result = repository.updateProduct(updated);

        assertTrue(result);
        assertEquals("Tablet Pro", repository.getAllProducts().get(0).getName());
    }
}