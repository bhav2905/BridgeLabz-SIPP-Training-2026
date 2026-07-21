import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentErrorCode {

    public static int mostFrequent(int[] codes) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int answer = codes[0];
        int maxCount = 0;

        for (int code : codes) {

            int count = map.getOrDefault(code, 0) + 1;

            map.put(code, count);

            if (count > maxCount) {
                maxCount = count;
                answer = code;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(mostFrequent(arr));
    }
}