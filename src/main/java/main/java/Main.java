package main.java;

import java.util.Scanner;

/**
 * Presentation Layer Class.
 * This class interacts with the user.
 * It receives input and calls business layer methods.
 */
public class Main {

    public static void main(String[] args) {

        // Initialize layers
        main.java.ProductRepository repository = new main.java.ProductRepository();
        main.java.ProductService service = new main.java.ProductService(repository);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== main.java.Product Management System ===");
            System.out.println("1. Add main.java.Product");
            System.out.println("2. Update main.java.Product");
            System.out.println("3. Delete main.java.Product");
            System.out.println("4. Display Products");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {


                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();

                    service.addProduct(id, name, price);
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter New Price: ");
                    double newPrice = scanner.nextDouble();

                    service.updateProduct(updateId, newName, newPrice);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    service.deleteProduct(deleteId);
                    break;

                case 4:
                    service.displayProducts();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
