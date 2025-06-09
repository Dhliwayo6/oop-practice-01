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
import za.co.wethinkcode.accounts.CheckingAccount;
import za.co.wethinkcode.accounts.SavingsAccount;
import za.co.wethinkcode.customer.Customer;
import za.co.wethinkcode.exception.AccountNotFoundException;
import za.co.wethinkcode.exception.CustomerNotFoundException;
import za.co.wethinkcode.exception.InvalidAccountException;

import java.util.ArrayList;

public class BankingService {

    private int customerIdSequence = 1;
    private int accountNumber = 1;
    private ArrayList<Customer> customers;

    public BankingService() {
        this.customers = new ArrayList<>();
    }

    public void createCustomer(String name){
        customers.add(new Customer(name, "User-" + customerIdSequence++));
    }

    public Customer findCustomerById(String customerId){
        for (Customer customer: customers){
            if (customer.getCustomerId().equals(customerId)){
                return customer;
            }
        }
        throw new CustomerNotFoundException("Customer with customerId: " + customerId +" not found");
    }


    public Account findAccount(String customerId, String accountNumber) {

        for (Customer customer: customers){
            if (customer.getCustomerId().equals(customerId)){
                for(Account account: customer.getAccounts()){
                    if(account.getAccountNumber().equals(accountNumber)){
                        return account;
                    }
                }
                throw new AccountNotFoundException("Account not found");

            }
        }
        throw new CustomerNotFoundException("Customer ID not found");
    }

    public Account createAccount(String customerId, String type) {

        Customer customer = findCustomerById(customerId);
        if (customer == null){
            throw new CustomerNotFoundException("Customer with customerId: " + customerId + " not found");
        }

        Account account = switch (type.toLowerCase()) {
            case "savings" -> new SavingsAccount("ACC-" + accountNumber++);
            case "chacking" -> new CheckingAccount("ACC-" + accountNumber++);
            default -> throw new InvalidAccountException("Invalid Account type.");
        };

        customer.addAccount(account);
        return account;
    }

    public void deposit(String customerId, String accountNumber, int amountInCents){
        Account account = findAccount(customerId, accountNumber);

        account.deposit(amountInCents);

    }

    public void withdraw(String customerId, String accountNumber, int amountInCents){
        Account account = findAccount(customerId, accountNumber);
        account.withdraw(amountInCents);
    }

    public void transfer(String customerIdFrom,
                         String accountFrom,
                         String customerIdTo,
                         String accountTo,
                         int amountInCents) {
        Account src = findAccount(customerIdFrom, accountFrom);
        Account target = findAccount(customerIdTo, accountTo);

        src.withdraw(amountInCents);
        target.deposit(amountInCents);

    }

    public void printCustomerAccounts(String customerId) {
        Customer customer = findCustomerById(customerId);

//        customer.getAccounts();
        Account acc = findAccount(customerId, customer.getCustomerId());

        System.out.println(acc);
    }
}
