package test;

import presentation.AccountUI;
import business.AccountService;
import data.AccountRepository;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Simulates user input to test that the UI exits correctly
 * without throwing exceptions.
 */
public class AccountUITest {

    @Test
    public void testUIExit() {
        InputStream originalIn = System.in;

        try {
            AccountRepository repo = new AccountRepository();
            AccountService service = new AccountService(repo);
            AccountUI ui = new AccountUI(service);

            String input = "3\n"; // Exit option
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            assertDoesNotThrow(() -> ui.start());

        } finally {
            System.setIn(originalIn); // Restore input
        }
    }
}