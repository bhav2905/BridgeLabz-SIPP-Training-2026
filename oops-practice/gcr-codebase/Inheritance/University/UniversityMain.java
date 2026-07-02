package University;

public class UniversityMain {

    public static void main(String[] args) {

        GradStudent studentOne =
                new GradStudent(
                        101,
                        "Shivam",
                        123456,
                        8.0,
                        "CSE"
                );

        System.out.println(studentOne);
    }
}