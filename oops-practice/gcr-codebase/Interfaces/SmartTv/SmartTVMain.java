package SmartTV;

public class SmartTVMain {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        String[] movies = {
                "Avengers",
                "Interstellar",
                "Inception"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "PUBG"
        };

        System.out.println("===== Subscription Details =====");
        tv.showSubscriptionDetails();

        System.out.println("\n===== Movies =====");

        for (String movie : movies) {

            tv.streamMovie(movie);
        }

        System.out.println("\n===== Games =====");

        for (String game : games) {

            tv.playGame(game);
        }
    }
}