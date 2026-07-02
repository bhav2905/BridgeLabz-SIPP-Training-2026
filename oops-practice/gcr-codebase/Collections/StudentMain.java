import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentMain {

    public static void main(String[] args) {

        StusentData s1 = new StusentData(101, "Sahil", 27, "CSE");
        StusentData s2 = new StusentData(102, "Rahul", 22, "Civil");
        StusentData s3 = new StusentData(103, "Neha", 26, "IT");
        StusentData s4 = new StusentData(104, "Rakul", 25, "MFD");

        ArrayList<StusentData> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        TreeSet<StusentData> treeList=new TreeSet<>();
        treeList.add(s1);
        treeList.add(s2);
        treeList.add(s3);
        treeList.add(s4);
        for(StusentData s:treeList){
            System.out.println(s);
        }

        @Override
        public String to String(){
            System.out.println("-----------------------------------");

        }

        @Override

//        // Find student with age 25
//        for (StusentData s : list) {
//
//            if (s.age == 25) {
//
//                System.out.println("Student Found:");
//                System.out.println(s);
//
//                System.out.println("\nEnter New Details");
//
//                System.out.print("Enter New ID: ");
//                s.id = sc.nextInt();
//
//                sc.nextLine();
//
//                System.out.print("Enter New Name: ");
//                s.name = sc.nextLine();
//
//                System.out.print("Enter New Age: ");
//                s.age = sc.nextInt();
//
//                sc.nextLine();
//
//                System.out.print("Enter New Branch: ");
//                s.branch = sc.nextLine();
//
//                break;
//            }
//        }
//
//        System.out.println("\nUpdated Student Database");
//
//        for (StusentData s : list) {
//            System.out.println(s);
//        }
//
//        sc.close();
    }
}