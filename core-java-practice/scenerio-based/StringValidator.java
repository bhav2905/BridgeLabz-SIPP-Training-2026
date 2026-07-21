public class StringValidator {

    public boolean validator(String username, int index) {

        if (index == username.length()) {
            return true;
        }

        char ch = username.charAt(index);

        if (!Character.isLetterOrDigit(ch)) {
            return false;
        }

        return validator(username, index + 1);
    }

    public static void main(String[] args) {
        StringValidator sv = new StringValidator();

        System.out.println(sv.validator("Shiv123", 0));   // true
        System.out.println(sv.validator("Shiv@123", 0));  // false
    }
}