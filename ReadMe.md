# 💸 Java OOP Practice - Simple Banking System

This is a Java practice project that simulates a **basic banking system** using core Object-Oriented Programming (OOP) principles. It was designed to be completed in **120 minutes**, focusing on class design, inheritance, encapsulation, polymorphism, and abstraction.

---

## To start the assessment create a branch or clone the repo...Don't push to main##

## ⏱ Duration

**Estimated Time:** 120 minutes  
**Skill Level:** Beginner to Intermediate Java

---

## ✅ Goal

Build a console-based banking system that allows:

- Creating customers
- Creating checking/savings accounts
- Depositing and withdrawing (with balance stored in **cents**)
- Transferring money between accounts
- Displaying account info and transaction summaries

---

## 💡 Requirements

- Use **`int` for money** (cents instead of rand) to avoid floating point errors.
- Use **OOP concepts** throughout the project.
- All functionality must be **accessible via a CLI menu** in the `za.co.wethinkcode.Main.java`.

---

## 🔨 Features to Implement

### 📄 Abstract Class: `Account`
- `protected String accountNumber`
- `protected int balance` (in cents)
- `abstract void displayInfo()`
- Methods:
    - `deposit(int amountInCents)`
    - `withdraw(int amountInCents)`
    - `getBalance()`
    - `getAccountNumber()`

---

### 🏦 Subclasses: `SavingsAccount` and `CheckingAccount`
- Inherit from `Account`
- Override `displayInfo()`
- (Optional) Add withdrawal restrictions in `SavingsAccount`

---

### 👤 Class: `Customer`
- Fields:
    - `String name`
    - `String customerId`
    - `ArrayList<Account> accounts`
- Methods:
    - `addAccount(Account account)`
    - `getAccounts()`
    - `getName()`, `getCustomerId()`

---

### 🔁 Class: `BankingService`
Handles the business logic:

- `createCustomer(name)`
- `createAccount(customerId, type)`
- `deposit(customerId, accountNumber, amountInCents)`
- `withdraw(customerId, accountNumber, amountInCents)`
- `transfer(customerIdFrom, accFrom, customerIdTo, accTo, amountInCents)`
- `printCustomerAccounts(customerId)`

Use an `ArrayList<Customer>` for storing data in memory.

---

### 🖥️ Class: `za.co.wethinkcode.Main`
Console-based interface:

```text
===== Banking Menu =====
1. Create Customer
2. Create Account
3. Deposit
4. Withdraw
5. Transfer
6. View Account Info
7. Exit
