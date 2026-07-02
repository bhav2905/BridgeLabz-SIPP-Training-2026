import java.util.Scanner;

public class PalindromeChecker {

    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {

        String reverse =
                new StringBuilder(text)
                        .reverse()
                        .toString();

        return text.equalsIgnoreCase(reverse);
    }

    public void displayResult() {

        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        PalindromeChecker checker =
                new PalindromeChecker(text);

        checker.displayResult();
    }
}