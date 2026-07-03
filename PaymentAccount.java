public class PaymentAccount {
    private double balance;

    public PaymentAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Balance too low for this withdrawal");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        PaymentAccount account = new PaymentAccount(1000);
        try {
            account.withdraw(500);
            System.out.println("Withdrew 500. Balance: " + account.getBalance());

            account.withdraw(1000); // this one should fail
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }
}
