package ContentModeration;

public interface TextModeration {

    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("Text Moderation Policy: Offensive language is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        String[] restricted = {"bad", "abuse", "hate"};

        post = post.toLowerCase();

        for (String word : restricted) {
            if (post.contains(word)) {
                return true;
            }
        }

        return false;
    }
}