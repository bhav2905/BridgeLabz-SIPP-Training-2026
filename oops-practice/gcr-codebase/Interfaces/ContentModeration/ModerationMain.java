package ContentModeration;

public class ModerationMain {

    public static void main(String[] args) {

        String[] posts = {

                "Hello everyone!",
                "Buy Now and get FREE gifts",
                "I hate this game",
                "Click here to earn money",
                "Java is awesome"
        };

        ContentModerator moderator = new ContentModerator();

        System.out.println("===== MODERATION POLICIES =====");

        moderator.displayModerationPolicy();

        System.out.println("\n===== POST ANALYSIS =====");

        for (String post : posts) {

            System.out.println("\nPost : " + post);

            if (moderator.isSpam(post)) {

                System.out.println("Status : Spam Post");

            } else if (moderator.isOffensive(post)) {

                System.out.println("Status : Offensive Post");

            } else {

                System.out.println("Status : Valid Post");
            }
        }
    }
}