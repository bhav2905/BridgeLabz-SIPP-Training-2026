import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomerFeedback {
    public static void main(String[] args) {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("feedback.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("good")) {
                    count++;
                }
            }
            br.close();
            System.out.println("Good Feedback Count = " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}