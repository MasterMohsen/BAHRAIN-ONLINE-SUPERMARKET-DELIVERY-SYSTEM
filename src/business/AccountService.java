package business;

import data.AccountRepository;
import model.Account;

/**
 * Business layer responsible for account management logic.
 */
public class AccountService {

    private AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    /**
     * Registers a new user account.
     */
    public void registerAccount(int id, String username, String password) {
        Account account = new Account(id, username, password);
        repository.addAccount(account);
    }

    /**
     * Validates login credentials.
     */
    public boolean login(String username, String password) {
        Account account = repository.findByUsername(username);

        if (account != null && account.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}