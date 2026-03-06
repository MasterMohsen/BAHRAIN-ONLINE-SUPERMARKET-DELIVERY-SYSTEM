/**
 * Product entity class.
 * This class represents the Product object in the system.
 * It contains product attributes and their getters/setters.
 */
public class Product {

    // Unique identifier of the product
    private int id;

    // Name of the product
    private String name;

    // Price of the product
    private double price;

    /**
     * Constructor to initialize product details.
     */
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Override toString method to display product information.
     */
    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}