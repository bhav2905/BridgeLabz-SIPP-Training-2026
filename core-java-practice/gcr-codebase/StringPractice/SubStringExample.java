import java.util.Scanner;

public class SubStringExample {

    public static String createSubstring(String str, int start, int end) {
        String sub = "";

        for (int i = start; i < end; i++) {
            sub = sub + str.charAt(i);
        }

        return sub;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub1 = createSubstring(text, start, end);
        String sub2 = text.substring(start, end);

        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);

        if (compareStrings(sub1, sub2)) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("Both substrings are not equal.");
        }

        sc.close();
    }
}