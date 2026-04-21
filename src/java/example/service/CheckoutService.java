package example.service;

import com.stripe.model.checkout.Session;//we need this to use a stripe library and specific Session class
import com.stripe.param.checkout.SessionCreateParams;//we need this to use a stripe library and specific SessionCreate class
import example.model.CartItem;

import java.util.List;

public class CheckoutService {

    public static String createCheckoutSession(String customerEmail, List<CartItem> cartItems) throws Exception {
        SessionCreateParams.Builder builder = SessionCreateParams.builder()//Create a builder object by constructor
                .setMode(SessionCreateParams.Mode.PAYMENT)// This tells Stripe the checkout is for a one-time payment
                .setCustomerEmail(customerEmail)
                .setSuccessUrl("https://example.com/success?session_id={CHECKOUT_SESSION_ID}")
                .setCancelUrl("https://example.com/cancel");

        // Add each cart item as a line item
        for (CartItem item : cartItems) {
            builder.addLineItem(
                    SessionCreateParams.LineItem.builder()//for return builder
                            .setQuantity((long) item.getQuantity())
                            .setPriceData(
                                    SessionCreateParams.LineItem.PriceData.builder()// for use setCurrency and other sets
                                            .setCurrency("usd")
                                            .setUnitAmount((long)(item.getProduct().getPrice() * 100))//*100 because the price is in cents
                                            .setProductData(
                                                    SessionCreateParams.LineItem.PriceData.ProductData.builder()// for use setName and other sets
                                                            .setName(item.getProduct().getName())
                                                            .setDescription(item.getProduct().getDescription())
                                                            .build()//return name and description of product
                                            )
                                            .build()//return currency, UnitAmount, and ProductData
                            )
                            .build()//return quantity and PriceData of product
            );
        }

        Session session = Session.create(builder.build());//return quantity and PriceData of product
        System.out.println("✅ Checkout session created!");
        return session.getUrl();
    }

    public static String checkSessionStatus(String sessionId) throws Exception {
        Session session = Session.retrieve(sessionId);//get the session
        System.out.println("✅ Session status:  " + session.getStatus());
        System.out.println("   Payment status: " + session.getPaymentStatus());
        return session.getPaymentStatus();
    }
}