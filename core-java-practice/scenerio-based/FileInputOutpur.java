import java.io.FileWriter;

public class FileInputOutpur {
    public static void main(String[] args){
        try {
            FileWriter file = new FileWriter("hello.txt");
            file.write("Hii my name is Shivam");    //Non static paramertizsed overloded method
            System.out.println("File edited Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}