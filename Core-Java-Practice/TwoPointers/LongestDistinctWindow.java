import java.util.*;

public class LongestDistinctWindow {

    public static int longestSubarray(int[] arr, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < arr.length; end++) {

            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);

            while (map.size() > n) {

                map.put(arr[start], map.get(arr[start]) - 1);

                if (map.get(arr[start]) == 0)
                    map.remove(arr[start]);

                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int n = sc.nextInt();

        System.out.println(longestSubarray(arr, n));
    }
}
