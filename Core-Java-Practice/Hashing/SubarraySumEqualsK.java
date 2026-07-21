import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int answer = 0;

        for (int num : arr) {

            sum += num;

            answer += map.getOrDefault(sum - k, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(subarraySum(arr, k));
    }
}