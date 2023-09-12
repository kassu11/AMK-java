package object_oriented_programming.week_03.chapter_03.task_03_library;

import object_oriented_programming.week_03.chapter_03.task_03_library.model.Book;
import object_oriented_programming.week_03.chapter_03.task_03_library.model.LibraryMember;
import object_oriented_programming.week_03.chapter_03.task_03_library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryMember member1 = new LibraryMember("Kassu");
        Book book1 = new Book("Epic story", "Mr.Book", "123-234-123");
        library.addMember(member1);
        library.addBook(book1);
        library.borrowBook(member1, book1);
        library.returnBook(member1, book1);

        library.reserveBook(member1, book1);
        library.displayReservedBooks();
        System.out.println();

        library.cancelReserve(member1, book1);
        library.displayReservedBooks();
    }
}
