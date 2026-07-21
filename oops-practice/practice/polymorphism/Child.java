package polymorphosm;

import java.util.Scanner;

public class Child extends Parent {
    @Override
    public void add(int a,int b){
        System.out.println("Addition using child is "+(a+b));
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number");
        int a = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 2 number");
        int b = sc2.nextInt();

        Parent obj = new Child();
        obj.add(a,b);

        sc.close();
    }
}