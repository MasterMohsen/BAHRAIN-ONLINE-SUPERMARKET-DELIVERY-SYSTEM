package example;

import example.Config.StripeConfig;//we need this to use StripeConfig class
import example.model.Address;//we need this to use Address class
import example.model.Order;//we need this to use Order class
import example.service.*;//we need this to use all services classes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // 1. Initialize Stripe
        StripeConfig.init();

        // 2. Simulate pre-filled cart
        System.out.println("\n🛒 Loading your cart...");
        CartService.addProduct(ProductService.getProductById("P2"), 2);
        CartService.addProduct(ProductService.getProductById("P3"), 1);
        CartService.addProduct(ProductService.getProductById("P5"), 1);

        // 3. Show cart
        CartService.displayCart();

        // 4. Collect email
        String email = ValidateEmailFormat(scanner);

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


    public static String ValidateEmailFormat(Scanner scanner){
        String email ="";
        while (true) {
            System.out.print("\nEnter your email: ");
            email = scanner.nextLine().trim();
            if (email.matches("^[\\w.+\\-]+@[a-zA-Z0-9.\\-]+\\.[a-zA-Z]{2,}$")) {
                break;
            }
            System.out.println("❌ Invalid email address. Please enter a valid email (e.g. john@example.com)");
        }
        return email;

    }
}
