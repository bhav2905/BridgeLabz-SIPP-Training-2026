package ContentModeration;

public class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean isOffensive(String post) {

        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {

        return SpamDetection.containsRestrictedWords(post);
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}