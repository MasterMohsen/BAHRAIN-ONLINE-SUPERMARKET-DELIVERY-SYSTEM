package example;

import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.*;

public class MainTest {

    // Helper: simulate user typing input
    private Scanner simulateInput(String input) {
        return new Scanner(new java.io.ByteArrayInputStream(input.getBytes()));
    }


    // Test 1: valid email should be accepted
    @Test
    public void testValidEmail() {
        Scanner scanner = simulateInput("john@example.com\n");
        String result = Main.ValidateEmailFormat(scanner);
        assertEquals("john@example.com", result);
    }

    // Test 2: valid email with dots should be accepted
    @Test
    public void testValidEmailWithDots() {
        Scanner scanner = simulateInput("john.doe@example.com\n");
        String result = Main.ValidateEmailFormat(scanner);
        assertEquals("john.doe@example.com", result);
    }

    // Test 3: valid email with plus should be accepted
    @Test
    public void testValidEmailWithPlus() {
        Scanner scanner = simulateInput("john+filter@example.com\n");
        String result = Main.ValidateEmailFormat(scanner);
        assertEquals("john+filter@example.com", result);
    }

    // Test 4: invalid email then valid email — should re-prompt and accept valid
    @Test
    public void testInvalidThenValidEmail() {
        // First input is invalid, second is valid
        Scanner scanner = simulateInput("notanemail\njohn@example.com\n");
        String result = Main.ValidateEmailFormat(scanner);
        assertEquals("john@example.com", result);
    }

    // Test 5: email without @ should be rejected then valid accepted
    @Test
    public void testEmailWithoutAt() {
        Scanner scanner = simulateInput("johnexample.com\njohn@example.com\n");
        String result = Main.ValidateEmailFormat(scanner);
        assertEquals("john@example.com", result);
    }

    // Test 6: email without domain extension should be rejected
    @Test
    public void testEmailWithoutDomainExtension() {
        Scanner scanner = simulateInput("john@example\njohn@example.com\n");
        String result = Main.ValidateEmailFormat(scanner);
        assertEquals("john@example.com", result);
    }

    // Test 7: email with spaces should be rejected
    @Test
    public void testEmailWithSpaces() {
        Scanner scanner = simulateInput("john @example.com\njohn@example.com\n");
        String result = Main.ValidateEmailFormat(scanner);
        assertEquals("john@example.com", result);
    }

    // Test 8: empty input should be rejected
    @Test
    public void testEmptyEmail() {
        Scanner scanner = simulateInput("\njohn@example.com\n");
        String result = Main.ValidateEmailFormat(scanner);
        assertEquals("john@example.com", result);
    }
}