import java.util.HashSet;
import java.util.Scanner;

public class EventEntryVerification {

    HashSet<String> participants = new HashSet<>();

    Scanner sc = new Scanner(System.in);

    // Register Participant
    public void registerParticipant() {

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        if (participants.add(email)) {

            System.out.println("Registration Successful.");

        } else {

            System.out.println("Duplicate Registration Not Allowed.");
        }
    }

    // Display Participants
    public void displayParticipants() {

        System.out.println("\n===== REGISTERED PARTICIPANTS =====");

        if (participants.isEmpty()) {

            System.out.println("No Participants Registered.");

        } else {

            for (String email : participants) {

                System.out.println(email);
            }
        }

        System.out.println("\nTotal Eligible Participants : " + participants.size());
    }

    public static void main(String[] args) {

        EventEntryVerification event = new EventEntryVerification();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== EVENT ENTRY VERIFICATION SYSTEM =====");
            System.out.println("1. Register Participant");
            System.out.println("2. Display Participants");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    event.registerParticipant();
                    break;

                case 2:

                    event.displayParticipants();
                    break;

                case 3:

                    System.out.println("Thank You!");
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}