package example.service;

import com.stripe.model.Customer;
import com.stripe.param.CustomerCreateParams;
import example.model.CustomerRequest;
import java.util.Scanner;

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