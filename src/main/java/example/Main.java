package example;

import example.Config.StripeConfig;
import example.model.Address;
import example.model.Order;
import example.service.AddressService;
import example.service.CartService;
import example.service.CheckoutService;
import example.service.OrderService;
import example.service.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1. Initialize Stripe
        StripeConfig.init();

        // 2. Simulate pre-filled cart
        System.out.println("\n🛒 Loading your cart...");
        CartService.addProduct(ProductService.getProductById("P2"), 2);
        CartService.addProduct(ProductService.getProductById("P3"), 1);
        CartService.addProduct(ProductService.getProductById("P5"), 1);

        // 3. Show cart
        CartService.displayCart();

        Scanner scanner = new Scanner(System.in);

        // 4. Collect email
        System.out.print("\nEnter your email: ");
        String email = scanner.nextLine().trim();

        // 5. Collect shipping address
        Address address = AddressService.collectAddress(scanner);

        // 6. Generate Stripe checkout URL
        String url = CheckoutService.createCheckoutSession(email, CartService.getCart());

        System.out.println("\n🔗 Open this link in your browser to complete payment:");
        System.out.println("   " + url);

        System.out.println("\nPress ENTER after completing payment...");
        scanner.nextLine();

        // 7. Check payment status
        String sessionId = url.split("/c/pay/")[1].split("#")[0];
        String paymentStatus = CheckoutService.checkSessionStatus(sessionId);

        // 8. If paid → save order with address, print receipt, clear cart
        if (paymentStatus.equals("paid")) {
            Order order = OrderService.createOrder(
                    email,
                    address,
                    CartService.getCart(),
                    CartService.getTotal(),
                    sessionId
            );
            OrderService.printReceipt(order);
            CartService.clearCart();
        } else {
            System.out.println("⚠️ Payment not completed. Cart has been kept.");
        }

        scanner.close();
    }
}
