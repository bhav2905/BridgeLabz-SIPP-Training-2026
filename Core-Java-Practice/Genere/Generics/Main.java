package Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Generic Pair
        Pair<String, Integer> pair =
                new Pair<>("Shivam", 21);

        System.out.println("Pair");

        System.out.println(pair);

        System.out.println();


        // Generic Stack
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack");

        System.out.println("Peek : " + stack.peek());

        System.out.println("Pop : " + stack.pop());

        System.out.println("Peek : " + stack.peek());

        System.out.println();


        // Generic Method
        Integer[] numbers = {10, 5, 60, 40, 25};

        System.out.println("Maximum = "
                + GenericUtility.findMax(numbers));

        System.out.println();


        // Generic Repository
        Repository<Student> repository =
                new Repository<>();

        repository.add(new Student(101, "Shivam"));
        repository.add(new Student(102, "Rahul"));
        repository.add(new Student(103, "Neha"));

        System.out.println("Repository");

        repository.display();

        System.out.println();


        // Wildcard
        ArrayList<String> subjects =
                new ArrayList<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DSA");

        System.out.println("Wildcard");

        GenericUtility.printList(subjects);
    }
}