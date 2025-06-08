package za.co.wethinkcode.accounts;

import za.co.wethinkcode.exception.InsufficientFundsException;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void deposit(int amountInCents) {
        if (amountInCents <= 0) throw new IllegalArgumentException("Deposit cannot be less zero or zero");

        balance += amountInCents;
    }

    @Override
    public void withdraw(int amountInCents) {

        if (amountInCents <= 0) throw new IllegalArgumentException("Withdrawal amount cannot be zero or negative");

        if (balance - amountInCents < 0) throw new InsufficientFundsException("Insufficient funds");

        balance-= amountInCents;
    }


    @Override
    public void displayInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account balance: " + balance);

    }
}
