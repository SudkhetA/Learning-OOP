package week02.chapter04.section05;

class BangAccount {
    // Instance variable.
    private double balance;

    // Constructor.
    public BangAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Methods.
    // - Instance method to deposit money.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // - Instance method to withdraw money.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // - Instance method to display balance.
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the BankAccount class.
        BangAccount myAccount = new BangAccount(1_000.00);

        // Calling instance method.
        myAccount.deposit(500.00);
        myAccount.displayBalance();
        myAccount.withdraw(200.00);
        myAccount.displayBalance();
    }
}
