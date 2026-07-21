import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> group(String[] words) {

        HashMap<String, List<String>> map =
                new HashMap<>();

        for (String word : words) {

            char[] ch = word.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            map.computeIfAbsent(key,
                    k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++)
            words[i] = sc.nextLine();

        System.out.println(group(words));
    }
}