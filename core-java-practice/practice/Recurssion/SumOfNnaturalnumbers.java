package Recurssion;

public class SumOfNnaturalnumbers {

    public int sum(int n) {

        // Base Case
        if (n == 1) {
            return 1;
        }

        // Recursive Call
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        SumOfNnaturalnumbers obj = new SumOfNnaturalnumbers();

        int n = 5;

        System.out.println("Sum = " + obj.sum(n));
    }
}