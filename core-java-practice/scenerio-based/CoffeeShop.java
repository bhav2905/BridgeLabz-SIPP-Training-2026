import java.util.Scanner;

public class CoffeShop {
    String CoffeTypes;
    int Qunatity;

    public double calculatePrice(String type, double price) {
        double bill = price * Qunatity;
        double gst = bill * 0.18;
        double finalBill = bill + gst;
        return finalBill;
    }

    public void generateBill(double bill) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("COFFEE TYPE -> " + CoffeTypes);
        System.out.println("QUANTITY -> " + Qunatity);
        System.out.println("BILL AMOUNT -> " + bill);
        System.out.println("THANK YOU FOR YOUR VISIT");
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Coffee type");
        System.out.println("1.Cappaccio :- 150");
        System.out.println("2.Latte :- 250");
        System.out.println("3.Esspresso :- 270");
        System.out.println("4.Americano :- 370");
        System.out.println("5.Black Coffee :- 600");

        int choice = scanner.nextInt();

        CoffeShop coffee = new CoffeShop();

        System.out.println("Enter Quantity");
        coffee.Qunatity = scanner.nextInt();

        switch (choice) {

            case 1:
                coffee.CoffeTypes = "Cappaccio";
                coffee.generateBill(
                        coffee.calculatePrice(coffee.CoffeTypes, 150));
                break;

            case 2:
                coffee.CoffeTypes = "Latte";
                coffee.generateBill(
                        coffee.calculatePrice(coffee.CoffeTypes, 250));
                break;

            case 3:
                coffee.CoffeTypes = "Esspresso";
                coffee.generateBill(
                        coffee.calculatePrice(coffee.CoffeTypes, 270));
                break;

            case 4:
                coffee.CoffeTypes = "Americano";
                coffee.generateBill(
                        coffee.calculatePrice(coffee.CoffeTypes, 370));
                break;

            case 5:
                coffee.CoffeTypes = "Black Coffee";
                coffee.generateBill(
                        coffee.calculatePrice(coffee.CoffeTypes, 600));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        scanner.close();
    }
}