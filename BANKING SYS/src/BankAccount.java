// File: BankAccount.java

public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void showBalance() {
        System.out.printf("Current Balance: $%.2f\n", balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.printf("✅ Successfully deposited $%.2f\n", amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.printf("✅ Successfully withdrew $%.2f\n", amount);
        }
    }
}
