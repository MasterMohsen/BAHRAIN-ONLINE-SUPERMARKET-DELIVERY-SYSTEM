package example.service;

import com.stripe.model.Customer;
import com.stripe.param.CustomerCreateParams;
import example.model.CustomerRequest;

public class CustomerService {

    public static Customer createCustomer(CustomerRequest request) throws Exception {
        CustomerCreateParams params = CustomerCreateParams.builder()
                .setName(request.getName())
                .setEmail(request.getEmail())
                .build();

        Customer customer = Customer.create(params);
        System.out.println("✅ Customer created: " + customer.getId());
        return customer;
    }

    public static Customer getCustomer(String customerId) throws Exception {
        Customer customer = Customer.retrieve(customerId);
        System.out.println("✅ Customer retrieved: " + customer.getEmail());
        return customer;
    }

    public static void deleteCustomer(String customerId) throws Exception {
        Customer customer = Customer.retrieve(customerId);
        customer.delete();
        System.out.println("✅ Customer deleted: " + customerId);
    }
}