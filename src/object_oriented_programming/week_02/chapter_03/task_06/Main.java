package object_oriented_programming.week_02.chapter_03.task_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();
        library.addUser(new User("User 1", 19));
        library.addUser(new User("User 2", 35));

        int answer;

        main: do {
            System.out.println("Context menu");
            System.out.println("1. Add book");
            System.out.println("2. Display books");
            System.out.println("3. Find books by author");
            System.out.println("4. Borrow book");
            System.out.println("0. Exit\n");

            System.out.print("Enter your answer: ");
            answer = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            if (answer == 1) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();
                System.out.print("Enter book publication year: ");
                int publicationYear = scanner.nextInt();

                library.addBook(new Book(author, title, publicationYear));
                System.out.println("Book added successfully!\n");
            } else if (answer == 2) {
                System.out.println("Books in library:");
                library.displayBooks();
                System.out.println();
            } else if (answer == 3) {
                System.out.print("Enter author name: ");
                String author = scanner.nextLine();
                library.findBooksByAuthor(author);
                System.out.println();
            } else if (answer == 4) {
                System.out.println("Users:");
                for(User user : library.getUsers()) {
                    System.out.printf("User name: \"%s\", User age: \"%d\"\n", user.getName(), user.getAge());
                }

                System.out.print("Enter user name: ");
                String userName = scanner.nextLine();
                System.out.print("Enter book title: ");
                String bookTitle = scanner.nextLine();

                for(User user : library.getUsers()) {
                    if(user.getName().equals(userName)) {
                        library.borrowBook(bookTitle, user);
                        System.out.printf("Book \"%s\" borrowed successfully!\n\n", bookTitle);
                        continue main;
                    }
                }

                System.out.println("User not found!\n");
            }
        } while(answer != 0);
    }
}
