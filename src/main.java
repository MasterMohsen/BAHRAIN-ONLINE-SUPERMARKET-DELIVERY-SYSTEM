import business.AccountService;
import data.AccountRepository;
import presentation.AccountUI;

public class main {

    public static void main(String[] args) {

        AccountRepository repo = new AccountRepository();
        AccountService service = new AccountService(repo);
        AccountUI ui = new AccountUI(service);

        ui.start();
    }
}