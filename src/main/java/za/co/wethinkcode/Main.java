package za.co.wethinkcode;

import za.co.wethinkcode.accounts.Account;
import za.co.wethinkcode.accounts.SavingsAccount;
import za.co.wethinkcode.customer.Customer;

public class Main {
    public static void main(String[] args) {

        SavingsAccount acc = new SavingsAccount("12345");

        acc.deposit(10);
//        acc.withdraw(25);
        acc.displayInfo();

        Customer customer = new Customer("Mandisi", "1");

        System.out.println(customer.getCustomerId());
        customer.addAccount(acc);
//        System.out.println(customer.getAccounts().toString());

        for (Account account: customer.getAccounts()) {
            System.out.println(account.getAccountNumber());
        }
    }
}
