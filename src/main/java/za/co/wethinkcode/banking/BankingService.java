package za.co.wethinkcode.banking;

/*
- `createCustomer(name)`
- `createAccount(customerId, type)`
- `deposit(customerId, accountNumber, amountInCents)`
- `withdraw(customerId, accountNumber, amountInCents)`
- `transfer(customerIdFrom, accFrom, customerIdTo, accTo, amountInCents)`
- `printCustomerAccounts(customerId)`

Use an `ArrayList<Customer>` for storing data in memory.
 */


import za.co.wethinkcode.accounts.Account;
import za.co.wethinkcode.accounts.SavingsAccount;
import za.co.wethinkcode.customer.Customer;

import java.util.ArrayList;

public class BankingService {

    private ArrayList<Customer> customers;

    public BankingService() {
        this.customers = new ArrayList<>();
    }

    public void createCustomer(String name, String customerId){
        customers.add(new Customer(name, customerId));
    }

//    public void createAccount(String customerId, String type) {
//        for (Customer customer: customers){
//            if (customer.getCustomerId().equals(customerId)){
//                Account account = switch (type.toLowerCase()) {
//                    case "savings" -> new SavingsAccount("")
//                }
//            }
//        }
//    }

    public void deposit(String customerId, String accountNumber, int amountInCents){

    }

    public void withdraw(String customerId, String accountNumber, int amountInCents){

    }

    public void transfer(String customerIdFrom,
                         String accountFrom,
                         String customerIdTo,
                         String accountTo,
                         int amountInCents) {

    }

    public void printCustomerAccounts() {

    }
}
