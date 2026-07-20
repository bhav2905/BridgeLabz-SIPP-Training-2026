import java.util.*;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        HashMap<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);

        HashMap<Character, Integer> window = new HashMap<>();

        int formed = 0;
        int required = need.size();

        int left = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch)
                    && window.get(ch).intValue() == need.get(ch).intValue()) {

                formed++;
            }

            while (formed == required) {

                if (right - left + 1 < minLength) {

                    minLength = right - left + 1;
                    start = left;
                }

                char c = s.charAt(left);

                window.put(c, window.get(c) - 1);

                if (need.containsKey(c)
                        && window.get(c) < need.get(c))
                    formed--;

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minLength);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(minWindow(s, t));
    }
}