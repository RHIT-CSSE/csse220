class CompanyExpenseMain {
    Account only;

    CompanyExpenseMain() {
        only = new Account("only");
    }

    void handleDeposit(String accountId, double amount) {
        // there's only one account stored...
        only.deposit(amount);
        System.out.println("Deposited " + amount + " into " + accountId);
    }

    void handleWithdrawal(String accountId, double amount) {
        only.withdraw(amount);
        System.out.println("Withdrew " + amount + " from " + accountId);
    }

    void handleGetCurrentBalance(String accountId) {
        System.out.println("Current balance for " + accountId + ": " + only.getCurrentBalance());
    }

    void handleGetHistoricalBalance(String accountId, String dateTime) {
        double v = only.getHistoricalBalance(dateTime);
        System.out.println("Historical balance for " + accountId + " at " + dateTime + ": " + v);
    }
}
