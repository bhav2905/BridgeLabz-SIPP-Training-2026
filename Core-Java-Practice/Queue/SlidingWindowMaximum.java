import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindowMaximum {

    public static int[] maxWindow(int[] arr, int k) {

        int n = arr.length;

        int[] ans = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty()
                    && deque.peekFirst() <= i - k) {

                deque.pollFirst();
            }

            while (!deque.isEmpty()
                    && arr[deque.peekLast()] <= arr[i]) {

                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {

                ans[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(Arrays.toString(maxWindow(arr, k)));
    }
}