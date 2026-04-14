import java.util.ArrayList;
import java.time.LocalDateTime;

class Account {
    String id;
    double currentBalance;

    ArrayList<Transaction> transactions;

    Account(String id) {
        this.id = id;
        this.currentBalance = 0.0;
        this.transactions = new ArrayList<Transaction>();
    }

    void deposit(double amount) {
        currentBalance = currentBalance + amount;
        addTransaction(amount);
    }

    void withdraw(double amount) {
        currentBalance = currentBalance - amount;
        addTransaction(-amount);
    }

    double getCurrentBalance() {
        return currentBalance;
    }

    double getHistoricalBalance(String dateTime) {
        LocalDateTime target = LocalDateTime.parse(dateTime);
        double bal = 0.0;
        for (int i = 0; i < transactions.size(); i++) {
            Transaction t = transactions.get(i);
            LocalDateTime ts = LocalDateTime.parse(t.transactionDateTime);
            if (!ts.isAfter(target)) {
                bal = bal + t.balanceAdjustment;
            }
        }
        return bal;
    }

    private void addTransaction(double adjustment) {
        Transaction t = new Transaction();
        t.balanceAdjustment = adjustment;
        t.transactionDateTime = LocalDateTime.now().toString();
        transactions.add(t);
    }
}
