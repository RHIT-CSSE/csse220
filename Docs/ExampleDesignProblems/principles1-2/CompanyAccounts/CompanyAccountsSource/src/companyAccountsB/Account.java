package companyAccountsB;

import java.util.ArrayList;

class Account {

    String id;
    double currentBalance;
    ArrayList<Double> oldBalances;

    Account(String id) {
        this.id = id;
        this.currentBalance = 0.0;
        this.oldBalances = new ArrayList<Double>();
    }

    void deposit(double amount) {
        currentBalance = currentBalance + amount;
        oldBalances.add(currentBalance);
    }

    void withdraw(double amount) {
        currentBalance = currentBalance - amount;
        oldBalances.add(currentBalance);
    }

    double getCurrentBalance() {
        return currentBalance;
    }

    double getHistoricalBalance(String dateTime) {
        // old balances doesn't store dateTime, so we can't implement this properly
        return currentBalance;
    }
}
