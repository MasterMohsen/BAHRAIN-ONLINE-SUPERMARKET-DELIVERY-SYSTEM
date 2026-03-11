package example.service;

import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import example.model.PaymentRequest;

public class PaymentService {

    public static PaymentIntent createPayment(PaymentRequest request) throws Exception {
        PaymentIntentCreateParams.Builder paramsBuilder = PaymentIntentCreateParams.builder()
                .setAmount(request.getAmountInCents())
                .setCurrency(request.getCurrency())
                .setPaymentMethod("pm_card_visa")       // ✅ Stripe test card
                .setConfirm(true)                        // ✅ Auto-confirm payment
                .setReturnUrl("https://example.com");    // ✅ Required when confirm=true

        if (request.getCustomerId() != null && !request.getCustomerId().isEmpty()) {
            paramsBuilder.setCustomer(request.getCustomerId());
        }

        PaymentIntent intent = PaymentIntent.create(paramsBuilder.build());
        System.out.println("✅ Payment created!");
        System.out.println("   ID:            " + intent.getId());
        System.out.println("   Status:        " + intent.getStatus());
        System.out.println("   Client Secret: " + intent.getClientSecret());
        return intent;
    }

    public static PaymentIntent getPaymentStatus(String paymentIntentId) throws Exception {
        PaymentIntent intent = PaymentIntent.retrieve(paymentIntentId);
        System.out.println("✅ Payment status: " + intent.getStatus());
        return intent;
    }

    public static PaymentIntent cancelPayment(String paymentIntentId) throws Exception {
        PaymentIntent intent = PaymentIntent.retrieve(paymentIntentId);
        intent = intent.cancel();
        System.out.println("✅ Payment cancelled: " + intent.getId());
        return intent;
    }
}