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
            System.out.println("5. Display borrowed books");
            System.out.println("6. Return book");
            System.out.println("7. Is book available");
            System.out.println("8. Rate book");
            System.out.println("9. Add review");
            System.out.println("10. Get average rating");
            System.out.println("11. Get most reviewed book");
            System.out.println("12. Display user borrowed books");
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
                System.out.println("List of users:");
                library.displayUsers();

                System.out.print("Enter user name: ");
                String userName = scanner.nextLine();
                for(User user : library.getUsers()) {
                    if (user.getName().equals(userName)) {
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        library.borrowBook(title, user);
                        continue main;
                    }
                }

                System.out.println("User not found!\n");
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
            } else if (answer == 8) {
                System.out.print("Enter a borrowed book title: ");
                String title = scanner.nextLine();

                for(Book book : library.getBorrowedBooks()) {
                    if (book.getTitle().equals(title)) {
                        System.out.print("Enter book rating: ");
                        double rating = scanner.nextDouble();
                        System.out.println(rating);
                        book.setRating(rating);
                        System.out.println("Book rated successfully!\n");
                        continue main;
                    }
                }

                System.out.println("Book not found!\n");
            } else if (answer == 9) {
                System.out.print("Enter a borrowed book title: ");
                String title = scanner.nextLine();

                for(Book book : library.getBorrowedBooks()) {
                    if (book.getTitle().equals(title)) {
                        System.out.print("Enter book review: ");
                        String review = scanner.nextLine();
                        book.addReview(review);
                        System.out.println("Review added successfully!\n");
                        continue main;
                    }
                }

                System.out.println("Book not found!\n");
            } else if (answer == 10) {
                System.out.println("Average rating: " + library.getAverageBookRating());
            } else if (answer == 11) {
                Book book = library.getMostReviewedBook();
                System.out.printf("Most reviewed book: \"%s\"\n", book.getTitle());
                for(String review : book.getReviews()) {
                    System.out.println(review);
                }
            } else if(answer == 12) {
                System.out.println("List of users:");
                library.displayUsers();

                System.out.print("Enter user name: ");
                String userName = scanner.nextLine();
                for(User user : library.getUsers()) {
                    if (user.getName().equals(userName)) {
                        System.out.println("Borrowed books:");
                        for(Book book : user.getBorrowedBooks()) {
                            System.out.printf("Title: \"%s\", Publication year: \"%d\", Author: \"%s\"\n", book.getTitle(), book.getPublicationYear(), book.getAuthor());
                        }
                        System.out.println();
                        continue main;
                    }
                }

                System.out.println("User not found!\n");
            } else if (answer == 0) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid answer!\n");
            }
        } while(answer != 0);
    }
}
