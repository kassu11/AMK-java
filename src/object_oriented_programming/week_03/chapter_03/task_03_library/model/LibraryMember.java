package object_oriented_programming.week_03.chapter_03.task_03_library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    static private int totalMembers = 0;
    private List<Book> borrowedBooks = new ArrayList<>();
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name) {
        this.name = name;
        this.memberId = ++totalMembers;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}
