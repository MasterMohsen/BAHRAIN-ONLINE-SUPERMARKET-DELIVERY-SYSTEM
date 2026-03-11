package example.service;

import com.stripe.model.Event;
import com.stripe.model.StripeObject;
import com.stripe.model.PaymentIntent;
import com.stripe.net.Webhook;

import java.util.Optional;

public class WebhookService {

    public static void handleWebhook(String payload, String sigHeader) {
        String endpointSecret = System.getenv("STRIPE_WEBHOOK_SECRET");

        try {
            Event event = Webhook.constructEvent(payload, sigHeader, endpointSecret);

            Optional<StripeObject> stripeObject = event.getDataObjectDeserializer().getObject();

            switch (event.getType()) {

                case "payment_intent.succeeded":
                    stripeObject.ifPresent(obj -> {
                        PaymentIntent intent = (PaymentIntent) obj;
                        System.out.println("✅ Payment succeeded: " + intent.getId());
                    });
                    break;

                case "payment_intent.payment_failed":
                    stripeObject.ifPresent(obj -> {
                        PaymentIntent intent = (PaymentIntent) obj;
                        System.out.println("❌ Payment failed: " + intent.getId());
                    });
                    break;

                case "payment_intent.canceled":
                    System.out.println("⚠️ Payment canceled.");
                    break;

                case "customer.created":
                    System.out.println("👤 New customer created.");
                    break;

                default:
                    System.out.println("ℹ️ Unhandled event type: " + event.getType());
            }

        } catch (Exception e) {
            System.out.println("❌ Webhook error: " + e.getMessage());
        }
    }
}