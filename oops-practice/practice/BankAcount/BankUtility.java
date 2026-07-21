package BankAccount;

import java.util.Scanner;

public class BankUtility {

    BankCustomer bankCustomer;
    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        int accountNumber = (int) (Math.random() * 90000) + 10000;
        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();
        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        bankCustomer = new BankCustomer(accountNumber,name,balance
        );

        BankCustomer.Bank_TotalAccountNumber++;

        System.out.println("Account Created Successfully");
        System.out.println(bankCustomer);
    }

    public void deposit(double amount) {

        if (bankCustomer == null) {
            System.out.println("Create Account First");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else {

            bankCustomer.Bank_Balance += amount;

            System.out.println("Amount Deposited Successfully");
            System.out.println("Updated Balance : "
                    + bankCustomer.Bank_Balance);
        }
    }

    public void withdraw(double amount) {

        if (bankCustomer == null) {
            System.out.println("Create Account First");
            return;
        }

        if (amount > bankCustomer.Bank_Balance) {
            System.out.println("Insufficient Balance");
        } else {

            bankCustomer.Bank_Balance -= amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance : "
                    + bankCustomer.Bank_Balance);
        }
    }

    public void displayAccount() {

        if (bankCustomer == null) {
            System.out.println("No Account Found");
        } else {
            System.out.println(bankCustomer);
        }
    }

    public static void main(String[] args) {

        BankUtility bank = new BankUtility();

        bank.createAccount();

        bank.deposit(5000);

        bank.withdraw(2000);

        bank.displayAccount();

        System.out.println(
                "Total Accounts : "
                        + BankCustomer.Bank_TotalAccountNumber
        );
    }
}