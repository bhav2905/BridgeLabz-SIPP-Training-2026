import java.util.Scanner;
public class FriendsDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        double amarHeight = sc.nextDouble();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        double akbarHeight = sc.nextDouble();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = sc.nextDouble();

        String youngest = "Amar";
        int minAge = amarAge;

        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }

        if (anthonyAge < minAge) {
            minAge = anthonyAge;
            youngest = "Anthony";
        }

        String tallest = "Amar";
        double maxHeight = amarHeight;

        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }

        if (anthonyHeight > maxHeight) {
            maxHeight = anthonyHeight;
            tallest = "Anthony";
        }

        System.out.println("Youngest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);

        sc.close();
    }
}