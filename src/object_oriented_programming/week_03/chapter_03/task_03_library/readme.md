# Task 3: Implement Book Reservation

Extend the existing library management system to include the ability to reserve books. When a library member requests to reserve a book, the system should mark the book as reserved and associate it with the member. The member should be able to see their reserved books and cancel reservations.

**Steps to Implement the Task:**

1. Modify the `Book` class in the `model` package to include a `boolean reserved` field. This field will indicate whether the book is currently reserved.

2. Add methods to the `Library` class in the `system` package to handle book reservations. Implement methods to reserve a book, cancel a reservation, and display reserved books for a member.

3. Update the `LibraryMember` class in the `model` package to include a list of reserved books.

4. Modify the `Main` class to demonstrate the new functionality. Create instances of library members, reserve books, cancel reservations, and display reserved books.

**Example Implementation:**

```java
package model;

public class Book {
    // Existing fields: title, author, isbn
    private boolean reserved = false;

    // Getters, setters, other methods
}

package system;

import model.Book;
import model.LibraryMember;

public class Library {
    // Existing methods: addBook, addMember, borrowBook, returnBook
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}

package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    // Existing fields: name, memberId
    private List<Book> reservedBooks = new ArrayList<>();

    // Existing methods: getters, setters
    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}

public class Main {
    public static void main(String[] args) {
        // Existing code
        // Create instances of library members, reserve/cancel books, display reserved books
    }
}
```