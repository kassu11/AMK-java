package object_oriented_programming.week_02.chapter_03.task_01;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void displayBooks() {
		for (Book book : this.books) {
			System.out.printf("Title: \"%s\", Publication year: \"%d\", Author: \"%s\"\n", book.getTitle(), book.getPublicationYear(), book.getAuthor());
		}
	}

	public void findBooksByAuthor(String author) {
		System.out.printf("Books by author \"%s\":\n", author);
		for (Book book : this.books) {
			if (book.getAuthor().equals(author)) {
				System.out.printf("Title: \"%s\", Publication year: \"%d\", Author: \"%s\"\n", book.getTitle(), book.getPublicationYear(), book.getAuthor());
			}
		}
	}
}
