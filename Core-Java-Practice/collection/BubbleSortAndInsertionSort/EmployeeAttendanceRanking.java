import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeAttendanceRanking {

    static class Employee {

        int id;
        int attendance;

        Employee(int id, int attendance) {
            this.id = id;
            this.attendance = attendance;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();

        int[] employeeIds = new int[n];
        int[] attendance = new int[n];

        System.out.println("Enter Employee IDs:");

        for (int i = 0; i < n; i++) {
            employeeIds[i] = sc.nextInt();
        }

        System.out.println("Enter Attendance Percentages:");

        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }

        Arrays.sort(employees, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {

                if (e1.attendance != e2.attendance) {
                    return e2.attendance - e1.attendance;
                }

                return e1.id - e2.id;
            }
        });

        System.out.println("Top " + k + " Employees:");

        for (int i = 0; i < k; i++) {
            System.out.print(employees[i].id + " ");
        }
    }
}