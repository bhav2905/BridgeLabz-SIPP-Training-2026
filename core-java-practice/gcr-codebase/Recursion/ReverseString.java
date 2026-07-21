import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str) {
        if (str.length() == 0) {
            return "";
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = reverse(str);
        System.out.println(result);
        sc.close();
    }
}