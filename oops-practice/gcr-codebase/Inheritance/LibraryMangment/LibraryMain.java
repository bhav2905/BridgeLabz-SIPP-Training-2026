package Library;

import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title : ");
        String title = sc.nextLine();

        System.out.print("Enter Publication Year : ");
        int year = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Author Name : ");
        String authorName = sc.nextLine();

        System.out.print("Enter Author Bio : ");
        String bio = sc.nextLine();

        Author author = new Author(
                title,
                year,
                authorName,
                bio
        );

        System.out.println("\n===== Book Details =====");

        author.displayInfo();
    }
}