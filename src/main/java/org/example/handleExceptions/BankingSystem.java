package org.example.handleExceptions;

import java.util.HashMap;
import java.util.Map;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}

public class BankingSystem {

    // Map to hold accounts and their balances
    private static Map<String, Double> accounts = new HashMap<>();

    // Method to create a new account
    public static void createAccount(String accountId) throws IllegalArgumentException {
        if (accounts.containsKey(accountId)) {
            throw new IllegalArgumentException("Account already exists: " + accountId);
        }
        accounts.put(accountId, 0.0);
        System.out.println("Account created successfully: " + accountId);
    }

    // Method to deposit money into an account
    public static void deposit(String accountId, double amount) throws InvalidAccountException {
        if (!accounts.containsKey(accountId)) {
            throw new InvalidAccountException("Account not found: " + accountId);
        }
        accounts.put(accountId, accounts.get(accountId) + amount);
        System.out.println("Successfully deposited " + amount + " to account: " + accountId);
    }

    // Method to withdraw money from an account
    public static void withdraw(String accountId, double amount)
            throws InvalidAccountException, InsufficientFundsException {
        if (!accounts.containsKey(accountId)) {
            throw new InvalidAccountException("Account not found: " + accountId);
        }
        if (accounts.get(accountId) < amount) {
            throw new InsufficientFundsException("Insufficient funds in account: " + accountId);
        }
        accounts.put(accountId, accounts.get(accountId) - amount);
        System.out.println("Successfully withdrew " + amount + " from account: " + accountId);
    }

    // Method to transfer money between accounts
    public static void transfer(String fromAccountId, String toAccountId, double amount)
            throws InvalidAccountException, InsufficientFundsException {
        try {
            withdraw(fromAccountId, amount);
            deposit(toAccountId, amount);
            System.out.println("Successfully transferred " + amount +
                    " from " + fromAccountId + " to " + toAccountId);
        } catch (InvalidAccountException | InsufficientFundsException e) {
            throw e; // Re-throw exception to caller
        }
    }

    // Main program to demonstrate exception handling
    public static void main(String[] args) {
        try {
            // Step 1: Create accounts
            createAccount("12345");
            createAccount("67890");

            // Step 2: Deposit funds
            deposit("12345", 1000.0);

            // Step 3: Attempt a transfer with insufficient funds
            try {
                transfer("12345", "67890", 2000.0);
            } catch (InsufficientFundsException e) {
                System.out.println("Transfer failed: " + e.getMessage());
            }

            // Step 4: Deposit and retry transfer
            deposit("12345", 1500.0);
            transfer("12345", "67890", 2000.0);

            // Step 5: Handle invalid account operations
            try {
                deposit("11111", 500.0);
            } catch (InvalidAccountException e) {
                System.out.println("Error during deposit: " + e.getMessage());
            }

            // Step 6: Withdraw more than balance
            try {
                withdraw("67890", 5000.0);
            } catch (InsufficientFundsException e) {
                System.out.println("Error during withdrawal: " + e.getMessage());
            }

            // Step 7: Print account balances
            System.out.println("Final Balances:");
            accounts.forEach((account, balance) -> System.out.println(account + ": " + balance));

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Banking operations completed.");
        }
    }
}
