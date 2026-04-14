package companyAccountsB;

import java.util.ArrayList;

public class CompanyExpenseMain {
    
    private ArrayList<Account> accounts = new ArrayList<>();

    void handleDeposit(String accountId, double amount) {
        Account a = findOrCreate(accountId);
        a.deposit(amount);
    }

    void handleWithdrawal(String accountId, double amount) {
        Account a = findOrCreate(accountId);
        a.withdraw(amount);
    }

    void handleGetCurrentBalance(String accountId) {
        Account a = findOrCreate(accountId);
        a.getCurrentBalance();
    }

    void handleGetHistoricalBalance(String accountId, String dateTime) {
        Account a = findOrCreate(accountId);
        a.getHistoricalBalance(dateTime);
    }

    private Account findOrCreate(String id) {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            if (a.id != null && a.id.equals(id)) {
                return a;
            }
        }
        Account created = new Account(id);
        accounts.add(created);
        return created;
    }
}
