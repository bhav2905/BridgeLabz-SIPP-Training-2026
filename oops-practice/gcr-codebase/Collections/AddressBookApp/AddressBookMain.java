import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== ADDRESS BOOK =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    book.addContact();
                    break;
                case 2:
                    book.searchContact();
                    break;
                case 3:
                    book.deleteContact();
                    break;
                case 4:
                    book.displayContacts();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    return;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}