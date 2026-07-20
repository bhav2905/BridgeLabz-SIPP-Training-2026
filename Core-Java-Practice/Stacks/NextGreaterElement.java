import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreater(int[] arr) {

        int n = arr.length;

        int[] answer = new int[n];

        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    arr[i] > arr[stack.peek()]) {

                answer[stack.pop()] = arr[i];
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] ans = nextGreater(arr);

        System.out.println(Arrays.toString(ans));
    }
}