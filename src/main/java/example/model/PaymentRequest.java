package example.model;

public class PaymentRequest {
    private long amountInCents;
    private String currency;
    private String customerId;

    public PaymentRequest(long amountInCents, String currency, String customerId) {
        this.amountInCents = amountInCents;
        this.currency = currency;
        this.customerId = customerId;
    }

    public long getAmountInCents() { return amountInCents; }
    public String getCurrency() { return currency; }
    public String getCustomerId() { return customerId; }
}