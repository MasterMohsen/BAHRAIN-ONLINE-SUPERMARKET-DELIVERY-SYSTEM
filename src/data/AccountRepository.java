package data;

import model.Account;
import java.util.ArrayList;
import java.util.List;

/**
 * Data layer responsible for storing and retrieving accounts.
 */
public class AccountRepository {

    private List<Account> accounts = new ArrayList<>();

    /**
     * Adds a new account to the system.
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }

    /**
     * Finds an account by username.
     */
    public Account findByUsername(String username) {
        for (Account acc : accounts) {
            if (acc.getUsername().equals(username)) {
                return acc;
            }
        }
        return null;
    }
}