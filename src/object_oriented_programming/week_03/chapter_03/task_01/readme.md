# Task 1: Creating a Simple Bank Account Management System

In this exercise, you'll create a simple bank account management system using static variables and methods. You'll define a `BankAccount` class with static methods to manage accounts, along with a static variable to keep track of the total number of accounts.

```java
public class BankAccount {
    // Your variable declarations and code here

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}
```

In this exercise, you'll create a `BankAccount` class with instance variables for the account number and balance. The `totalAccounts` static variable keeps track of the total number of accounts. You'll also implement instance methods for depositing and withdrawing funds, as well as a static method to retrieve the total number of accounts. The `main` method demonstrates how to use the class by creating accounts, performing transactions, and checking the total number of accounts.
