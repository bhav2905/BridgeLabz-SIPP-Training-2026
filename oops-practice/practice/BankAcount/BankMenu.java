package BankAccount;
import java.util.Scanner;

public class BankMenu {

    public void bankDisplay() {
        BankUtility bankUtility = new BankUtility();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("WELCOME TO SBI BANK");
            System.out.println("----------------------------------");
            System.out.println("1.CREATE ACCOUNT");
            System.out.println("2.DEPOSIT");
            System.out.println("3.WITHDRAW");
            System.out.println("4.GET STATEMENT");
            System.out.println("5.NO OF ACCOUNTS CREATED");
            System.out.println("6.EXIT");

            int choice = sc.nextInt();
            switch (choice) {

                case 1:

                    bankUtility.createAccount();
                    break;

                case 2:

                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();

                    bankUtility.deposit(depositAmount);
                    break;

                case 3:

                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();

                    bankUtility.withdraw(withdrawAmount);
                    break;

                case 4:

                    bankUtility.displayAccount();
                    break;

                case 5:

                    System.out.println("Thank You For Banking With SBI");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void main(String[] args) {
        BankMenu menu = new BankMenu();
        menu.bankDisplay();
    }
}