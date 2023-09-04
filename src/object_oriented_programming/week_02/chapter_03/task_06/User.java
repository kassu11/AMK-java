package object_oriented_programming.week_02.chapter_03.task_06;

import java.util.ArrayList;

public class User {
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void addToBorrowed(Book book) {
        this.borrowedBooks.add(book);
        book.setBorrowedBy(this);
    }

    public void removeBorrowedBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    public ArrayList<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }
}
