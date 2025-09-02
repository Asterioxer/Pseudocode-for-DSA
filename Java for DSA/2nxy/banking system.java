import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Class representing a bank account
class BankAccount {
  private String accountNumber;
  private double balance;
public BankAccount(String accountNumber) {
  this.accountNumber = accountNumber;
  this.balance = 0.0;
}
public void deposit(double amount) {
if (amount > 0) {
  balance += amount;
  System.out.println("Deposited: $" + amount);
} else {
  System.out.println("Deposit amount must be positive.");
 }
}
public void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
  balance -= amount;
  System.out.println("Withdrawn: $" + amount);
} else if (amount > balance) {
  System.out.println("Insufficient funds.");
} else {
  System.out.println("Withdrawal amount must be positive.");
 }
}
public double getBalance() {
return balance;
}
public String getAccountNumber() {
return accountNumber;
}
}
// Class representing a customer
class Customer {
private String name;
private BankAccount account;
public Customer(String name, String accountNumber) {
this.name = name;
this.account = new BankAccount(accountNumber);
}
public void deposit(double amount) {
account.deposit(amount);
}
public void withdraw(double amount) {
account.withdraw(amount);
}
public void viewBalance() {
System.out.println("Account Balance: $" + account.getBalance());
}
public String getName() {
return name;
}
public BankAccount getAccount() {
return account;
}
}
// Class representing a transaction (not fully implemented, just a placeholder)
class Transaction {
private double amount;
private String type; // "deposit" or "withdraw"
public Transaction(double amount, String type) {
this.amount = amount;
this.type = type;
}
public double getAmount() {
return amount;
}
public String getType() {
return type;
}
}
// Main class to run the banking system
public class BankingSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter customer name: ");
String name = scanner.nextLine();
System.out.print("Enter account number: ");
String accountNumber = scanner.nextLine();
Customer customer = new Customer(name, accountNumber);
boolean running = true;
while (running) {
System.out.println("\nChoose an option:");
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. View Balance");
System.out.println("4. Exit");
System.out.print("Your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.print("Enter amount to deposit: ");
double depositAmount = scanner.nextDouble();
customer.deposit(depositAmount);
break;
case 2:
System.out.print("Enter amount to withdraw: ");
double withdrawAmount = scanner.nextDouble();
customer.withdraw(withdrawAmount);
break;
case 3:
customer.viewBalance();
break;
case 4:
running = false;
System.out.println("Exiting the banking system. Goodbye!");
break;
default:
System.out.println("Invalid choice. Please try again.");
}
}
scanner.close();
}
}