import java.util.Scanner;

public class ElectricityBill {
    double Units;

    // Bill Calculation
    public double electricityBil(double units) {

        double amount = (units <= 50) ? 5 :
                (units <= 100) ? 10 :
                (units <= 200) ? 15 :
                (units <= 300) ? 20 : 30;

        return amount;
    }

    // Generate Bill
    public void generateBil(double units, double amount) {

        System.out.println("------------------------------------------------------");
        System.out.println("WELCOME TO ELECTRICITY BOARD");
        System.out.println("TOTAL UNITS CONSUMED -> " + units);
        System.out.println("Total Bill Amount To be paid -> " + amount);
        System.out.println("------------------------------------------------------");

    }

    public static void main(String[] args) {

        ElectricityBill elec = new ElectricityBill();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Units Consumed:");
        double amount = elec.electricityBil(elec.Units = scanner.nextDouble());

        double totalAmount = elec.Units * amount;

        elec.generateBil(elec.Units, totalAmount);

        scanner.close();
    }
}