public class PractiseSet {

    public static void main(String[] args) {

        String str = "I love Coding";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {

                if (ch == str.charAt(k)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                System.out.println(ch + " -> " + count);
            }
        }
    }
}