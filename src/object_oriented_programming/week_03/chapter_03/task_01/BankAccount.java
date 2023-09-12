package object_oriented_programming.week_03.chapter_03.task_01;

public class BankAccount {
    static private int totalAccounts = 0;
    private int accountNumber;
    private int balance;


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }

    public BankAccount(int balance) {
        this.balance = balance;
        this.accountNumber = ++totalAccounts;
    }

    public void deposit(int amount) {
        if (this.balance > 0) {
            this.balance += amount;
        }
    }

    static int getTotalAccounts() {
        return totalAccounts;
    }

    public void withdraw(int amount) {
        if (this.balance < amount) {
            System.out.println("Not enough money!");
        } else if(amount > 0) {
            this.balance -= amount;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}