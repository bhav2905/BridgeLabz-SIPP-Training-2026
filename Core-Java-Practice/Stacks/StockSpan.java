import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static int[] stockSpan(int[] price) {

        int n = price.length;

        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty()
                    && price[stack.peek()] <= price[i]) {

                stack.pop();
            }

            if (stack.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - stack.peek();

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(Arrays.toString(stockSpan(arr)));
    }
}