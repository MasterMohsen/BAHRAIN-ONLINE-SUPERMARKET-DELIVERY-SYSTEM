package example.service;

import example.model.Address;

import java.util.Scanner;

public class AddressService {

    public static Address collectAddress(Scanner scanner) {
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║               📦 SHIPPING ADDRESS                    ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");

        String fullName = promptNonEmpty(scanner, "Full Name");
        String street   = promptNonEmpty(scanner, "Street Address");
        String city     = promptNonEmpty(scanner, "City");
        String country  = promptNonEmpty(scanner, "Country");
        String phone    = promptPhone(scanner);

        Address address = new Address(fullName, street, city, country, phone);
        System.out.println("✅ Address saved: " + address);
        return address;
    }

    private static String promptNonEmpty(Scanner scanner, String fieldName) {
        while (true) {
            System.out.print("  " + fieldName + ": ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) return input;
            System.out.println("  ❌ " + fieldName + " cannot be empty. Try again.");
        }
    }

    private static String promptPhone(Scanner scanner) {
        while (true) {
            System.out.print("  Phone Number (e.g. +1234567890): ");
            String input = scanner.nextLine().trim();
            // Allow digits, +, spaces, dashes, parentheses
            if (input.matches("[+\\d\\s\\-()]{7,20}")) return input;
            System.out.println("  ❌ Invalid phone number. Try again.");
        }
    }
}