package example.Config;

import com.stripe.Stripe;

public class StripeConfig {

    private static final String API_KEY = System.getenv("STRIPE_SECRET_KEY");

    public static void init() {
        if (API_KEY == null || API_KEY.isEmpty()) {
            throw new RuntimeException("❌ STRIPE_SECRET_KEY environment variable not set!");
        }
        Stripe.apiKey = API_KEY;
        System.out.println("✅ Stripe initialized successfully.");
    }
}