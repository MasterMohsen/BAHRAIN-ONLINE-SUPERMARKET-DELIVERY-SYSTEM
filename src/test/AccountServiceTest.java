package test;

import business.AccountService;
import data.AccountRepository;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests the business logic for registration and login.
 */
public class AccountServiceTest {

    private AccountService service;
    private AccountRepository repository;

    @BeforeEach
    public void setUp() {
        repository = new AccountRepository();
        service = new AccountService(repository);
    }

    @Test
    public void testRegisterAndLoginSuccess() {
        service.registerAccount(101, "validUser", "secret");
        assertTrue(service.login("validUser", "secret"));
    }

    @Test
    public void testLoginFailureWrongPassword() {
        service.registerAccount(102, "userA", "pass1");
        assertFalse(service.login("userA", "wrongPass"));
    }

    @Test
    public void testLoginFailureUserNotFound() {
        assertFalse(service.login("unknown", "123"));
    }
}