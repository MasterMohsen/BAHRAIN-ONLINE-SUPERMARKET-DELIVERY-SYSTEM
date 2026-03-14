package example.service;

import example.model.CartItem; // we need import to use cartItem class
import example.model.Product; // we need import to use Product class

import java.util.ArrayList;// we need import to use ArrayList
import java.util.List;// we need import to use List class


public class CartService {

    private static final List<CartItem> cart = new ArrayList<>();

    public static void addProduct(Product product, int quantity) {
        // If product already in cart, increase quantity
        for (CartItem item : cart) {
            if (item.getProduct().getId().equals(product.getId())) {
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println("✅ Updated quantity: " + item);
                return;
            }
        }
        cart.add(new CartItem(product, quantity));
        System.out.println("✅ Added to cart: " + product.getName() + " x" + quantity);
    }

    public static void removeProduct(String productId) {
        boolean removed = cart.removeIf(item ->
                item.getProduct().getId().equalsIgnoreCase(productId));
        if (removed) System.out.println("✅ Removed from cart.");
        else         System.out.println("❌ Product not found in cart.");
    }

    public static void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("\n🛒 Your cart is empty.");
            return;
        }
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║                     🛒 YOUR CART                     ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        for (CartItem item : cart) {
            System.out.println("║  " + item);
        }
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.printf ("║  %-30s        $%.2f  ║%n", "TOTAL:", getTotal());
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }

    public static double getTotal() {
        return cart.stream().mapToDouble(CartItem::getSubtotal).sum();
    }

    public static List<CartItem> getCart() {
        return cart;
    }

    public static boolean isEmpty() {
        return cart.isEmpty();
    }

    public static void clearCart() {
        cart.clear();
        System.out.println("🛒 Cart cleared.");
    }
}