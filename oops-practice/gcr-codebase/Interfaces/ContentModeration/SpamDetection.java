package ContentModeration;

public interface SpamDetection {

    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam Policy: Promotional or repeated content is prohibited.");
    }

    static boolean containsRestrictedWords(String post) {

        String[] spamWords = {"buy now", "free", "click here"};

        post = post.toLowerCase();

        for (String word : spamWords) {
            if (post.contains(word)) {
                return true;
            }
        }

        return false;
    }
}