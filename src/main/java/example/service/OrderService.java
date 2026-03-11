package example.service;

import example.model.CartItem;
import example.model.Order;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OrderService {

    private static final String ORDER_FILE = "orders.txt";

    public static Order createOrder(String email, example.model.Address address,
                                    List<CartItem> items, double total,
                                    String paymentIntentId) {
        Order order = new Order(email, address, items, total, paymentIntentId);
        saveToFile(order);
        return order;
    }

    private static void saveToFile(Order order) {
        try (FileWriter fw = new FileWriter(ORDER_FILE, true)) {
            fw.write("========================================\n");
            fw.write("Order ID:    " + order.getOrderId()           + "\n");
            fw.write("Date:        " + order.getCreatedAt()         + "\n");
            fw.write("Email:       " + order.getCustomerEmail()     + "\n");
            fw.write("Payment ID:  " + order.getPaymentIntentId()   + "\n");
            fw.write("Status:      " + order.getStatus()            + "\n");
            fw.write("----------------------------------------\n");
            fw.write("📦 SHIPPING ADDRESS\n");
            fw.write("  Name:      " + order.getAddress().getFullName() + "\n");
            fw.write("  Street:    " + order.getAddress().getStreet()   + "\n");
            fw.write("  City:      " + order.getAddress().getCity()     + "\n");
            fw.write("  Country:   " + order.getAddress().getCountry()  + "\n");
            fw.write("  Phone:     " + order.getAddress().getPhone()    + "\n");
            fw.write("----------------------------------------\n");
            fw.write("🛒 ITEMS\n");
            for (CartItem item : order.getItems()) {
                fw.write("  " + item + "\n");
            }
            fw.write("----------------------------------------\n");
            fw.write(String.format("TOTAL:       $%.2f%n", order.getTotalAmount()));
            fw.write("========================================\n\n");
            System.out.println("✅ Order saved to " + ORDER_FILE);
        } catch (IOException e) {
            System.out.println("❌ Failed to save order: " + e.getMessage());
        }
    }

    public static void printReceipt(Order order) {
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║                  🧾 PAYMENT RECEIPT                  ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  Order ID:   " + order.getOrderId());
        System.out.println("║  Date:       " + order.getCreatedAt());
        System.out.println("║  Email:      " + order.getCustomerEmail());
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  📦 SHIPPING ADDRESS");
        System.out.println("║  Name:     " + order.getAddress().getFullName());
        System.out.println("║  Street:   " + order.getAddress().getStreet());
        System.out.println("║  City:     " + order.getAddress().getCity());
        System.out.println("║  Country:  " + order.getAddress().getCountry());
        System.out.println("║  Phone:    " + order.getAddress().getPhone());
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  🛒 ITEMS");
        for (CartItem item : order.getItems()) {
            System.out.println("║  " + item);
        }
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.printf ("║  %-30s        $%.2f  ║%n", "TOTAL PAID:", order.getTotalAmount());
        System.out.println("║  Status:   " + order.getStatus());
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }
}