import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SchoolResult {
    public static void main(String[] args) {
        try {
            File file = new File("students.txt");
            Scanner sc = new Scanner(file);
            FileWriter writer = new FileWriter("report.txt", true);
            while (sc.hasNextLine()) {
                String name = sc.next();
                int mark1 = sc.nextInt();
                int mark2 = sc.nextInt();
                int mark3 = sc.nextInt();
                double average = (mark1 + mark2 + mark3) / 3.0;
                writer.write("Name: " + name + "\n");
                writer.write("Marks: " + mark1 + " " + mark2 + " " + mark3 + "\n");
                writer.write("Average: " + average + "\n");
                writer.write("-------------------------\n");
            }
            sc.close();
            writer.close();
            System.out.println("Report created successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }
    }
}