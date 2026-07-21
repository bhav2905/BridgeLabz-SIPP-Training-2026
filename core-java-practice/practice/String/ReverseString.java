package String;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello";
        String reversed = reverseString(original);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}