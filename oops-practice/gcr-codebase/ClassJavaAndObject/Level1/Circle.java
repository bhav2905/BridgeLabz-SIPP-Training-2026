import java.util.Scanner;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Area = " + circle.calculateArea());
        System.out.println("Circumference = " + circle.calculateCircumference());
    }
}