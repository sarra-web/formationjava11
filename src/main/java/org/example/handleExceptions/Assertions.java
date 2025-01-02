package org.example.handleExceptions;


/***
 * Assertions are a useful tool in programming for validating logic,
 * especially during development and testing. Assertions let you check if a
 * condition in your program is true at a specific point, and if not, an error is raised,
 * signaling that there's an issue.
 * Below are some guidelines and examples of how to validate logic using assertions:
 *
 *
 * In Java:
 * The assert keyword checks conditions.
 * Assertions are disabled by default in production unless explicitly enabled with the -ea flag.
 *
 * >   java -ea <package>.<MainClass>
 *
 */


public class Assertions {

    public static void main(String[] args) {
        // Enable assertions using -ea when running the program
        Account account = new Account(1000);

        // Valid operations
        account.deposit(500);
        account.withdraw(200);

        // Uncomment to test invalid scenarios
         account.deposit(-100); // AssertionError: Deposit amount must be positive!
         account.withdraw(2000); // AssertionError: Insufficient funds for withdrawal!
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        assert initialBalance >= 0 : "Initial balance cannot be negative!";
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        assert amount > 0 : "Deposit amount must be positive!";
        balance += amount;
        assert balance >= 0 : "Balance after deposit must not be negative!";
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        assert amount > 0 : "Withdrawal amount must be positive!";
        assert amount <= balance : "Insufficient funds for withdrawal!";
        balance -= amount;
        assert balance >= 0 : "Balance after withdrawal must not be negative!";
        System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
    }
}
