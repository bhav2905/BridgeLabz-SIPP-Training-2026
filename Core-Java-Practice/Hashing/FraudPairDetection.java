import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FraudPairDetection {

    public static int[] twoSum(int[] amounts, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < amounts.length; i++) {

            int complement = target - amounts[i];

            if (map.containsKey(complement)) {

                return new int[]{
                        map.get(complement),
                        i
                };
            }

            map.put(amounts[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}