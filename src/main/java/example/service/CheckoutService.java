package example.service;

import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import example.model.CartItem;

import java.util.List;

public class CheckoutService {

    public static String createCheckoutSession(String customerEmail,
                                               List<CartItem> cartItems) throws Exception {
        SessionCreateParams.Builder builder = SessionCreateParams.builder()
                .setMode(SessionCreateParams.Mode.PAYMENT)
                .setCustomerEmail(customerEmail)
                .setSuccessUrl("https://example.com/success?session_id={CHECKOUT_SESSION_ID}")
                .setCancelUrl("https://example.com/cancel");

        // Add each cart item as a line item
        for (CartItem item : cartItems) {
            builder.addLineItem(
                    SessionCreateParams.LineItem.builder()
                            .setQuantity((long) item.getQuantity())
                            .setPriceData(
                                    SessionCreateParams.LineItem.PriceData.builder()
                                            .setCurrency("usd")
                                            .setUnitAmount((long)(item.getProduct().getPrice() * 100))
                                            .setProductData(
                                                    SessionCreateParams.LineItem.PriceData.ProductData.builder()
                                                            .setName(item.getProduct().getName())
                                                            .setDescription(item.getProduct().getDescription())
                                                            .build()
                                            )
                                            .build()
                            )
                            .build()
            );
        }

        Session session = Session.create(builder.build());
        System.out.println("✅ Checkout session created!");
        System.out.println("   👉 Payment URL: " + session.getUrl());
        return session.getUrl();
    }

    public static String checkSessionStatus(String sessionId) throws Exception {
        Session session = Session.retrieve(sessionId);
        System.out.println("✅ Session status:  " + session.getStatus());
        System.out.println("   Payment status: " + session.getPaymentStatus());
        return session.getPaymentStatus();
    }
}