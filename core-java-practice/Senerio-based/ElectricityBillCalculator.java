import java.util.Scanner;

public class ElectricityBillCalculator {

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
        System.out.println("TOTAL BILL AMOUNT TO BE PAID -> " + amount);
        System.out.println("------------------------------------------------------");

    }

    public static void main(String[] args) {

        ElectricityBillCalculator elec = new ElectricityBillCalculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Units Consumed:");
        elec.Units = scanner.nextDouble();

        double rate = elec.electricityBil(elec.Units);
        double totalAmount = elec.Units * rate;

        elec.generateBil(elec.Units, totalAmount);

        scanner.close();
    }
}