public class SensorReading {

    public boolean increasing(int[] arr, int index) {
        //Base
        if (index >= arr.length - 1) {
            return true;
        }

        return arr[index] <= arr[index + 1]
                && increasing(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        SensorReading r = new SensorReading();

        System.out.println(r.increasing(arr, 0));
    }
}