public interface ITrackable {
    void logActivity();
    default void resetData(){
        System.out.println("-------------------------------------");
        System.out.println("Your data has been reset");
        System.out.println("-------------------------------------");

    }
}