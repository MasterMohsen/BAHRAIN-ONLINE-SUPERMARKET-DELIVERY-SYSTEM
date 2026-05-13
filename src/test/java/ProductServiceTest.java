import main.java.ProductRepository;
import main.java.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for ProductService (Business Layer).
 * This class tests business logic and validation.
 */
public class ProductServiceTest {

    private ProductService service;
    private ProductRepository repository;

    /**
     * Initialize service and repository before each test.
     */
    @BeforeEach
    void setUp() {
        repository = new ProductRepository();
        service = new ProductService(repository);
    }

    /**
     * Test adding a valid product.
     */
    @Test
    void testAddValidProduct() {
        service.addProduct(1, "Laptop", 1000);

        assertEquals(1, repository.getAllProducts().size());
    }

    /**
     * Test adding a product with invalid price.
     */
    @Test
    void testAddInvalidProduct() {
        service.addProduct(1, "Laptop", -100);

        // Should not be added
        assertEquals(0, repository.getAllProducts().size());
    }

    /**
     * Test deleting an existing product.
     */
    @Test
    void testDeleteProduct() {
        service.addProduct(1, "Phone", 500);

        service.deleteProduct(1);

        assertEquals(0, repository.getAllProducts().size());
    }

    /**
     * Test updating an existing product.
     */
    @Test
    void testUpdateProduct() {
        service.addProduct(1, "Mouse", 50);

        service.updateProduct(1, "Gaming Mouse", 80);

        assertEquals("Gaming Mouse",
                repository.getAllProducts().get(0).getName());
    }

    /**
     * Test updating non-existing product.
     */
    @Test
    void testUpdateNonExistingProduct() {
        service.updateProduct(99, "Test", 100);

        // Still empty
        assertEquals(0, repository.getAllProducts().size());
    }
}