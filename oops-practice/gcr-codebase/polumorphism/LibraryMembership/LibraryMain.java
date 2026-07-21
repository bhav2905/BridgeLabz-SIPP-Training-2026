package LibraryMembership;

import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryMember[] members = new LibraryMember[3];

        System.out.println("===== STUDENT MEMBER =====");

        System.out.print("Enter Name : ");
        String studentName = sc.nextLine();

        System.out.print("Enter ID : ");
        String studentId = sc.nextLine();

        members[0] = new StudentMember(studentName, studentId);

        System.out.println("\n===== FACULTY MEMBER =====");

        System.out.print("Enter Name : ");
        String facultyName = sc.nextLine();

        System.out.print("Enter ID : ");
        String facultyId = sc.nextLine();

        members[1] = new FacultyMember(facultyName, facultyId);

        System.out.println("\n===== GUEST MEMBER =====");

        System.out.print("Enter Name : ");
        String guestName = sc.nextLine();

        System.out.print("Enter ID : ");
        String guestId = sc.nextLine();

        members[2] = new GuestMember(guestName, guestId);

        System.out.print("\nEnter Overdue Days : ");
        int overdueDays = sc.nextInt();

        sc.nextLine();

        System.out.println("\n===== MEMBER DETAILS =====");

        for (LibraryMember member : members) {

            member.displayDetails();

            System.out.println("Fine : ₹"
                    + member.calculateFine(overdueDays));

            System.out.println();
        }

        System.out.print("Enter Member ID to Search : ");
        String searchId = sc.nextLine();

        boolean found = false;

        for (LibraryMember member : members) {

            if (member.memberId.equalsIgnoreCase(searchId)) {

                System.out.println("\nMember Found");

                member.displayDetails();

                System.out.println("Fine : ₹"
                        + member.calculateFine(overdueDays));

                found = true;

                break;
            }
        }

        if (!found) {

            System.out.println("Member Not Found");
        }

        sc.close();
    }
}