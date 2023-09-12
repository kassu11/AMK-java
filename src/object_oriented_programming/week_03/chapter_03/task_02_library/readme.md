# Task 2: Creating a Simple Library Management System

In this exercise, you'll create a simple library management system using Java packages. You'll define classes within packages to represent books, library members, and the library itself.

**Step 1: Create Packages**

1. Create a new directory named `library` to serve as the root directory for your packages.

2. Inside the `library` directory, create two subdirectories: `model` and `system`.

**Step 2: Define Classes**

1. Create a `Book` class inside the `model` package. This class should have properties like title, author, and ISBN.

2. Create a `LibraryMember` class inside the `model` package. This class should represent a library member and have properties like name, member ID, and borrowed books.

3. Create a `Library` class inside the `system` package. This class should manage the library's books and members. Implement methods to add books, add members, borrow books, and return books.

**Step 3: Implement Main Application**

1. Create a `Main` class outside the packages (in the root directory). In this class, create instances of the `Library` class, add books and members, and perform borrowing and returning operations.

Here's a basic example of how the structure might look:

```
library/
|-- model/
|   |-- Book.java
|   |-- LibraryMember.java
|-- system/
|   |-- Library.java
|-- Main.java
```

**Example Implementation:**

```java
package model;

public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor, getters, setters
}

package model;

public class LibraryMember {
    private String name;
    private int memberId;
    // List<Book> borrowedBooks

    // Constructor, getters, setters
}

package system;

import model.Book;
import model.LibraryMember;

public class Library {
    // List<Book> books
    // List<LibraryMember> members

    public void addBook(Book book) {
        // Add book to the library
    }

    public void addMember(LibraryMember member) {
        // Add member to the library
    }

    public void borrowBook(LibraryMember member, Book book) {
        // Borrow book from the library
    }

    public void returnBook(LibraryMember member, Book book) {
        // Return book to the library
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Library, Book, LibraryMember
        // Add books and members to the library
        // Perform borrowing and returning operations
    }
}
```
