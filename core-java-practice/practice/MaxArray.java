public class MaxArray {

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 89, 45, 12};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element = " + max);
    }
}