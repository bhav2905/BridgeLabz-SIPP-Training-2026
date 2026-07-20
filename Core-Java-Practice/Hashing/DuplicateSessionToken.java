import java.util.HashSet;
import java.util.Scanner;

public class DuplicateSessionToken {

    public static boolean hasDuplicateToken(String[] tokens) {

        HashSet<String> set = new HashSet<>();

        for (String token : tokens) {

            if (!set.add(token)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Tokens: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] tokens = new String[n];

        System.out.println("Enter Tokens:");

        for (int i = 0; i < n; i++) {
            tokens[i] = sc.nextLine();
        }

        System.out.println(hasDuplicateToken(tokens));
    }
}