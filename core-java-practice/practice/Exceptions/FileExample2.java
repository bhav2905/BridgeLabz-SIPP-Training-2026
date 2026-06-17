package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExample2 {
    public static void demo() throws  FileNotFoundException{
        FileReader r =new FileReader("abc.txt");
    }
    public static void main(String[] args) {
        FileExample2 example = new FileExample2();

    }
        
    
}

