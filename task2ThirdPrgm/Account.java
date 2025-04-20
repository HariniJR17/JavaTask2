package task2ThirdPrgm;

public class Account {
	private double balance;

    // No-argument constructor: initializes balance to 0
    public Account() {
        this.balance = 0.0;
    }

    // Parameterized constructor: initializes balance to given value
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method - deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    // Method - withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }

    // Method - display current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}
