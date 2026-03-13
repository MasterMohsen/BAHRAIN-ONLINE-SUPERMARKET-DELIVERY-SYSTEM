package presentation;

import business.AccountService;
import java.util.Scanner;

/**
 * Presentation layer that interacts with the user.
 */
public class AccountUI {

    private AccountService service;

    public AccountUI(AccountService service) {
        this.service = service;
    }

    /**
     * Displays a simple menu for account operations.
     */
    public void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.println("Enter ID:");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter Username:");
                String username = scanner.nextLine();

                System.out.println("Enter Password:");
                String password = scanner.nextLine();

                service.registerAccount(id, username, password);
                System.out.println("Account created successfully");

            } else if (choice == 2) {

                System.out.println("Username:");
                String username = scanner.nextLine();

                System.out.println("Password:");
                String password = scanner.nextLine();

                if (service.login(username, password)) {
                    System.out.println("Login successful");
                } else {
                    System.out.println("Invalid credentials");
                }

            } else if (choice == 3) {
                break;
            }
        }
    }

}