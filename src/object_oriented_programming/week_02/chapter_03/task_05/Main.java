package object_oriented_programming.week_02.chapter_03.task_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        int answer;

        do {
            System.out.println("Context menu");
            System.out.println("1. Add book");
            System.out.println("2. Display books");
            System.out.println("3. Find books by author");
            System.out.println("0. Exit\n");

            System.out.print("Enter your answer: ");
            answer = scanner.nextInt();

            System.out.println();

            if (answer == 1) {
                System.out.print("Enter book title: ");
                String title = scanner.next();
                System.out.print("Enter book author: ");
                String author = scanner.next();
                System.out.print("Enter book publication year: ");
                String publicationYear = scanner.next();

                library.addBook(new Book(author, title, publicationYear));
                System.out.println("Book added successfully!\n");
            } else if (answer == 2) {
                System.out.println("Books in library:");
                library.displayBooks();
                System.out.println();
            } else if (answer == 3) {
                System.out.print("Enter author name: ");
                String author = scanner.next();
                library.findBooksByAuthor(author);
                System.out.println();
            }
        } while(answer != 0);
    }
}
