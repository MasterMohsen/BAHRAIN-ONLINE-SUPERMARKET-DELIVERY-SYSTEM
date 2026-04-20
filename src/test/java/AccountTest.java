package test.java;

import model.Account;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Tests the Account model class.
 */
public class AccountTest {


    @Test
    public void testAccountCreation() {
        Account account = new Account(1, "testUser", "password123");

        assertEquals(1, account.getId());
        assertEquals("testUser", account.getUsername());
        assertEquals("password123", account.getPassword());
    }
}