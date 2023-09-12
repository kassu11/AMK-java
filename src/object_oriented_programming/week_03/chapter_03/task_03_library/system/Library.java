package object_oriented_programming.week_03.chapter_03.task_03_library.system;

import object_oriented_programming.week_03.chapter_03.task_03_library.model.Book;
import object_oriented_programming.week_03.chapter_03.task_03_library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        this.members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void borrowBook(LibraryMember member, Book book) {
        member.getBorrowedBooks().add(book);
        this.books.remove(book);
        System.out.println("Book borrowed: " + book.getTitle());
    }

    public void returnBook(LibraryMember member, Book book) {
        member.getBorrowedBooks().remove(book);
        this.books.add(book);
        System.out.println("Book returned: " + book.getTitle());
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (book.isReserved()) return;

        book.setReserved(true);
        member.getReservedBooks().add(book);
        System.out.println("Book reserved: " + book.getTitle());
    }

    public void cancelReserve(LibraryMember member, Book book) {
        if (!book.isReserved() || !member.getReservedBooks().contains(book)) return;

        book.setReserved(false);
        member.getReservedBooks().remove(book);
        System.out.println("Reservation cancelled: " + book.getTitle());
    }

    public void displayReservedBooks() {
        System.out.println("Reserved books:");
        for (Book book : books) {
            if (book.isReserved()) {
                System.out.println(book.getTitle());
            }
        }
    }
}
