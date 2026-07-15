import java.util.*;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> contactMap = new HashMap<>();
    HashSet<String> phoneNumbers = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Phone : ");
        String phone = sc.nextLine();
        if (phoneNumbers.contains(phone)) {
            System.out.println("Phone Number Already Exists!");
            return;
        }

        System.out.print("Enter Email : ");
        String email = sc.nextLine();
        Contact contact = new Contact(name, phone, email);
        contacts.add(contact);
        contactMap.put(name, contact);
        phoneNumbers.add(phone);
        System.out.println("Contact Added Successfully.");
    }

    public void searchContact() {
        System.out.print("Enter Name to Search : ");
        String name = sc.nextLine();
        Contact contact = contactMap.get(name);
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public void deleteContact() {
        System.out.print("Enter Name to Delete : ");
        String name = sc.nextLine();
        Contact contact = contactMap.remove(name);
        if (contact != null) {
            contacts.remove(contact);
            phoneNumbers.remove(contact.phone);
            System.out.println("Contact Deleted Successfully.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public void displayContacts() {
        Collections.sort(contacts, (c1, c2) ->
                c1.name.compareToIgnoreCase(c2.name));
        System.out.println("\n===== CONTACT LIST =====");
        for (Contact contact : contacts) {
            System.out.println(contact);
            System.out.println("------------------------");
        }
    }
}