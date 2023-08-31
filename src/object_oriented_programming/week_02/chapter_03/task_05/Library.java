package object_oriented_programming.week_02.chapter_03.task_05;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowBook = new ArrayList<>();

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void displayBooks() {
		for (Book book : this.books) {
			System.out.printf("Title: \"%s\", Publication year: \"%s\", Author: \"%s\"\n", book.getTitle(), book.getPublicationYear(), book.getAuthor());
		}
	}

	public void findBooksByAuthor(String author) {
		System.out.printf("Books by author \"%s\":\n", author);
		for (Book book : this.books) {
			if (book.getAuthor().equals(author)) {
				System.out.printf("Title: \"%s\", Publication year: \"%s\", Author: \"%s\"\n", book.getTitle(), book.getPublicationYear(), book.getAuthor());
			}
		}
	}

	public void borrowBook(String title) {
		for(int i = 0; i < this.books.size(); i++) {
			if (this.books.get(i).getTitle().equals(title)) {
				this.borrowBook.add(this.books.get(i));
				this.books.remove(i);
				return;
			}
		}
	}

	public void returnBook(Book book) {
		this.books.add(book);
		this.borrowBook.remove(book);
	}

	public boolean isBookAvailable(String title) {
		for (Book book : this.books) {
			if (book.getTitle().equals(title)) {
				return true;
			}
		}
		return false;
	}

	public double getAverageBookRating() {
        double sum = 0;
        int count = 0;
        for (Book book : this.books) {
            if (book.getRating() != 0) {
                sum += book.getRating();
                count++;
            }
        }

        return sum / count;
    }

    public Book getMostReviewedBook() {
        Book mostReviewedBook = this.books.get(0);
        for (Book book : this.books) {
            if (book.getReviews().size() > mostReviewedBook.getReviews().size()) {
                mostReviewedBook = book;
            }
        }

        return mostReviewedBook;
    }
}
