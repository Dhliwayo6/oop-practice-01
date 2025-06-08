package za.co.wethinkcode.customer;

import za.co.wethinkcode.accounts.Account;

import java.util.ArrayList;

public class Customer {

    private String name;
    private String customerId;
    private ArrayList<Account> accounts;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

}
