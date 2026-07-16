import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SmartClassroomAttendance {

    HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    // Mark Attendance
    public void markAttendance() {

        System.out.print("Enter Subject Name: ");
        String subject = sc.nextLine();

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        if (!attendance.containsKey(subject)) {

            attendance.put(subject, new ArrayList<>());
        }

        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student)) {

            System.out.println("Attendance Already Marked.");

        } else {

            students.add(student);

            System.out.println("Attendance Marked Successfully.");
        }
    }

    // Display Attendance
    public void displayAttendance() {

        System.out.println("\n===== ATTENDANCE REPORT =====");

        if (attendance.isEmpty()) {

            System.out.println("No Attendance Found.");
            return;
        }

        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject : " + subject);

            ArrayList<String> students = attendance.get(subject);

            for (String student : students) {

                System.out.println(student);
            }

            System.out.println("Total Students Present : "
                    + students.size());
        }
    }

    public static void main(String[] args) {

        SmartClassroomAttendance classroom =
                new SmartClassroomAttendance();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SMART CLASSROOM ATTENDANCE =====");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    classroom.markAttendance();
                    break;

                case 2:

                    classroom.displayAttendance();
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