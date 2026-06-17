import java.util.*;

public class isprime {

    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    static int fact(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int fib(int n) {
        if(n <= 1) return n;
        int a = 0, b = 1;
        for(int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1:Check Prime 2:Factorial  3:Fibonnaci");
        int choice = s.nextInt();
        System.out.println("Enter Desired Number");
        int n = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println(isPrime(n));
                break;
            case 2:
                System.out.println(fact(n));
                break;

            case 3:
                System.out.println(fib(n));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}