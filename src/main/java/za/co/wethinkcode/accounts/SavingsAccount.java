package za.co.wethinkcode.accounts;

import za.co.wethinkcode.exception.InsufficientFundsException;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void deposit(int amountInCents) {

        if (amountInCents <= 0) throw new IllegalArgumentException("Deposit amount cannot be negative or zero");

        balance =+ amountInCents;
    }

    @Override
    public void withdraw(int amountInCents) {

        if (amountInCents <= 0) throw new IllegalArgumentException("Withdrawal amount cannot be negative or zero");

        if (balance - amountInCents < 0) throw new InsufficientFundsException("Insufficient funds");

        balance -= amountInCents;

    }

    @Override
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account balance: " + balance);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
