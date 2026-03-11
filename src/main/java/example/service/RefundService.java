package example.service;

import com.stripe.model.Refund;
import com.stripe.param.RefundCreateParams;

public class RefundService {

    public static Refund refundFull(String paymentIntentId) throws Exception {
        RefundCreateParams params = RefundCreateParams.builder()
                .setPaymentIntent(paymentIntentId)
                .build();

        Refund refund = Refund.create(params);
        System.out.println("✅ Full refund issued!");
        System.out.println("   Refund ID: " + refund.getId());
        System.out.println("   Status:    " + refund.getStatus());
        return refund;
    }

    public static Refund refundPartial(String paymentIntentId, long amountInCents) throws Exception {
        RefundCreateParams params = RefundCreateParams.builder()
                .setPaymentIntent(paymentIntentId)
                .setAmount(amountInCents)
                .build();

        Refund refund = Refund.create(params);
        System.out.println("✅ Partial refund issued!");
        System.out.println("   Refund ID: " + refund.getId());
        System.out.println("   Amount:    " + amountInCents + " cents");
        System.out.println("   Status:    " + refund.getStatus());
        return refund;
    }
}