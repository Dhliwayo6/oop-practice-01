package za.co.wethinkcode.accounts;

public abstract class Account {

    protected String accountNumber;
    protected int balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public abstract void deposit(int amountInCents);

    public abstract void withdraw(int amountInCents);

    public abstract void displayInfo();


}
