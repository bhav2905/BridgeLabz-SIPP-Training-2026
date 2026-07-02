import java.util.Scanner;

public class StudentsData {

    int id;
    String name;
    int marks;

    public StudentsData(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentsData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void addStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Marks:");
        marks = sc.nextInt();
    }

    public static void main(String[] args) {

        StudentsData student = new StudentsData(0, "", 0);

        student.addStudents();

        System.out.println(student);
    }
}