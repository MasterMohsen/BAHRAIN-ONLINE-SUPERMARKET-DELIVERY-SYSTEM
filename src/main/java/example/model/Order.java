package example.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Order {
    private String orderId;
    private String customerEmail;
    private Address address;
    private List<CartItem> items;
    private double totalAmount;
    private String paymentIntentId;
    private String status;
    private String createdAt;

    public Order(String customerEmail, Address address, List<CartItem> items,
                 double totalAmount, String paymentIntentId) {
        this.orderId          = "ORD-" + System.currentTimeMillis();
        this.customerEmail    = customerEmail;
        this.address          = address;
        this.items            = items;
        this.totalAmount      = totalAmount;
        this.paymentIntentId  = paymentIntentId;
        this.status           = "PAID";
        this.createdAt        = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String getOrderId()         { return orderId; }
    public String getCustomerEmail()   { return customerEmail; }
    public Address getAddress()        { return address; }
    public List<CartItem> getItems()   { return items; }
    public double getTotalAmount()     { return totalAmount; }
    public String getPaymentIntentId() { return paymentIntentId; }
    public String getStatus()          { return status; }
    public String getCreatedAt()       { return createdAt; }
}