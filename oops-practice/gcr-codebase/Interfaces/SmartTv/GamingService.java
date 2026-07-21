package SmartTV;

public interface GamingService {

    void playGame(String game);

    default void showSubscriptionDetails() {

        System.out.println("Gaming Subscription : Gold");
    }
}