package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
    }
}