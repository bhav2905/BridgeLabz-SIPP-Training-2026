import java.util.Scanner;

public class MetroFare {
    public static void main(String[] args) {
        double balance = 600.00;
        while(balance>0){
            System.err.println("----------------------------------------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println(("Enter Distance in KM or TYPE -1 to exit"));
            double distance = scanner.nextDouble();
            System.out.println("Enter no of passangers");
            int passenger = scanner.nextInt();
            if(distance==-1){
                break;
            }

            //fare Calculation
            double fare = (distance<=5)?10:(distance<=10)?20:(distance<=20)?30:50;
            //Balance calculation
            if(balance>fare){
                fare=fare*passenger;
                balance-=fare;
                System.err.println("Available Balance in your card is:-"+balance);
            }else{
                System.err.println("Insufficient Balance Please check your card balance");
            }
            System.err.println("Thank you for using Delhi metro");
            System.err.println("----------------------------------------------------------------------------");
        }
        System.err.println("Card time exceeded or balance is zero!!!!");
    }
}