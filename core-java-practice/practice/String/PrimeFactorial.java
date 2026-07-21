package String;
public class PrimeFactorial {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 7; // Change this to test other numbers

        if (isPrime(number)) {
            long result = factorial(number);
            System.out.println(number + " is prime. Factorial: " + result);
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}