package object_oriented_programming.week_02.chapter_03.task_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        int answer;

        main: do {
            System.out.println("Context menu");
            System.out.println("1. Add book");
            System.out.println("2. Display books");
            System.out.println("3. Find books by author");
            System.out.println("4. Borrow book");
            System.out.println("5. Display borrowed books");
            System.out.println("6. Return book");
            System.out.println("7. Is book available");
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
            } else if (answer == 3) {
                System.out.print("Enter author name: ");
                String author = scanner.nextLine();
                library.findBooksByAuthor(author);
            } else if (answer == 4) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                library.borrowBook(title);
            } else if (answer == 5) {
                System.out.println("Borrowed books:");
                library.displayBorrowedBooks();
            } else if (answer == 6) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                for(Book book : library.getBorrowedBooks()) {
                    if (book.getTitle().equals(title)) {
                        library.returnBook(book);
                        System.out.println("Book returned successfully!\n");
                        continue main;
                    }
                }

                System.out.println("Book not found!\n");
            } else if (answer == 7) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.println(library.isBookAvailable(title) ? "Book is available" : "Book is not available");
            }

            System.out.println();
        } while(answer != 0);
    }
}
