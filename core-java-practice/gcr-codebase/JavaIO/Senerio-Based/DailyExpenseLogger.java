import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("expenses.txt", true);
            System.out.print("Enter expense name: ");
            String expense = sc.nextLine();
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            writer.write(expense + " - " + amount + "\n");
            writer.close();
            System.out.println("Expense saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
        sc.close();
    }
}