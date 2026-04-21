package example.service;

import example.model.Address;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;//for using Asserts methods

public class AddressServiceTest {

    // Helper: simulate user typing input
    private Scanner simulateInput(String input) {
        return new Scanner(new java.io.ByteArrayInputStream(input.getBytes()));
    }

    // Test 1: Valid input should return an Address object
    @Test
    public void testCollectAddressReturnsNotNull() {
        String input = "John Doe\n123 Main St\nManama\nBahrain\n+973 33333333\n";
        Scanner scanner = simulateInput(input);
        Address address = AddressService.collectAddress(scanner);
        assertNotNull(address);
    }

    // Test 2: Full name should be saved correctly
    @Test
    public void testCollectAddressFullName() {
        String input = "John Doe\n123 Main St\nManama\nBahrain\n+973 33333333\n";
        Scanner scanner = simulateInput(input);
        Address address = AddressService.collectAddress(scanner);
        assertEquals("John Doe", address.getFullName());
    }

    // Test 3: City should be saved correctly
    @Test
    public void testCollectAddressCity() {
        String input = "John Doe\n123 Main St\nManama\nBahrain\n+973 33333333\n";
        Scanner scanner = simulateInput(input);
        Address address = AddressService.collectAddress(scanner);
        assertEquals("Manama", address.getCity());
    }

    // Test 4: Valid phone number should be accepted
    @Test
    public void testCollectAddressPhone() {
        String input = "John Doe\n123 Main St\nManama\nBahrain\n+973 33333333\n";
        Scanner scanner = simulateInput(input);
        Address address = AddressService.collectAddress(scanner);
        assertEquals("+973 33333333", address.getPhone());
    }

    // Test 5: Empty name should be re-prompted, then valid name accepted
    @Test
    public void testEmptyNameRePrompts() {
        // First name is empty, second attempt is valid
        String input = "\nJohn Doe\n123 Main St\nManama\nBahrain\n+973 33333333\n";
        Scanner scanner = simulateInput(input);
        Address address = AddressService.collectAddress(scanner);
        assertEquals("John Doe", address.getFullName());
    }

    // Test 6: Invalid phone should be re-prompted, then valid phone accepted
    @Test
    public void testInvalidPhoneRePrompts() {
        // First phone is invalid, second is valid
        String input = "John Doe\n123 Main St\nManama\nBahrain\nabc\n+973 33333333\n";
        Scanner scanner = simulateInput(input);
        Address address = AddressService.collectAddress(scanner);
        assertEquals("+973 33333333", address.getPhone());
    }
}