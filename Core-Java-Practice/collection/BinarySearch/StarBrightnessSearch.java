import java.util.Scanner;

public class StarBrightnessSearch {

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Sorted Brightness Values:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        int ans = binarySearch(arr, target);

        if (ans == -1)
            System.out.println("Not Found");
        else
            System.out.println("Found at Index " + ans);
    }
}