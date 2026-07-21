import java.util.Scanner;

public class AtmWithdrawal {

    private double balance = 10000;

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;

        System.out.println("Withdrawal Successful");
        System.out.println("Withdraw Amount : " + amount);
        System.out.println("Remaining Balance : " + balance);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AtmWithdrawal atm = new AtmWithdrawal();

        System.out.println("Enter Amount To Withdraw : ");
        double amount = scanner.nextDouble();

        try {

            atm.withdraw(amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        }

        scanner.close();
    }
}