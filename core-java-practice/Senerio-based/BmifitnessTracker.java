import java.util.Scanner;

public class BmifitnessTracker {

    public double Calvulatebmi(double height, double weight) {
        return weight / (height * height);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Height (in meters)");
        double height = scanner.nextDouble();

        System.out.println("Enter Your Weight (in kg)");
        double weight = scanner.nextDouble();

        BmifitnessTracker tracker = new BmifitnessTracker();

        double bmi = tracker.Calvulatebmi(height, weight);

        System.out.println("Your BMI IS : " + bmi);

        if (bmi < 18.5) {
            System.out.println("UNDERWEIGHT");
        } else if (bmi < 25) {
            System.out.println("NORMAL");
        } else if (bmi < 30) {
            System.out.println("OVERWEIGHT");
        } else {
            System.out.println("OBESE");
        }

        scanner.close();
    }
}