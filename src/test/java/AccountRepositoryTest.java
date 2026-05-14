package test.java;

import data.AccountRepository;
import model.Account;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests the data layer's ability to store and find accounts.
 */
public class AccountRepositoryTest {

    private AccountRepository repository;

    @BeforeEach
    public void setUp() {
        repository = new AccountRepository();
    }

    @Test
    public void testAddAndFindByUsername() {
        Account account = new Account(1, "tester", "pass");
        repository.addAccount(account);

        Account found = repository.findByUsername("tester");
        assertNotNull(found);
        assertEquals("tester", found.getUsername());
    }

    @Test
    public void testFindNonExistentUser() {
        assertNull(repository.findByUsername("unknown"));
    }
} //hadi check
