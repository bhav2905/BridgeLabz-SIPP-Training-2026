package String;

public class Demo {
    {
        System.out.println("Hii non static");
    }
    static{
        System.out.println("Hii static block");
    }
    public Demo(){
        System.out.println("Hii i am constructor");
    }
    public static void main(String[] args){
        System.out.println("Hii main method");
    }
    

}