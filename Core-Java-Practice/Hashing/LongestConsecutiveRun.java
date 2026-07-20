import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveRun {

    public static int longestRun(int[] ids) {

        HashSet<Integer> set = new HashSet<>();

        for (int id : ids)
            set.add(id);

        int longest = 0;

        for (int id : set) {

            if (!set.contains(id - 1)) {

                int current = id;
                int length = 1;

                while (set.contains(current + 1)) {

                    current++;

                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(longestRun(arr));
    }
}