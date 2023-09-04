package object_oriented_programming.week_02.chapter_03.task_05;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

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

	public void borrowBook(String title) {
		for(int i = 0; i < this.books.size(); i++) {
			if (this.books.get(i).getTitle().equals(title)) {
				this.borrowedBooks.add(this.books.get(i));
				this.books.remove(i);
				System.out.println("Book borrowed successfully!\n");
				return;
			}
		}
	}

	public void displayBorrowedBooks() {
		for (Book book : this.borrowedBooks) {
			System.out.printf("Title: \"%s\", Publication year: \"%d\", Author: \"%s\"\n", book.getTitle(), book.getPublicationYear(), book.getAuthor());
		}
	}

	public ArrayList<Book> getBorrowedBooks() {
		return this.borrowedBooks;
	}

	public void returnBook(Book book) {
		this.books.add(book);
		this.borrowedBooks.remove(book);
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
			System.out.println(book.getRating());
            if (book.getRating() > 0) {
                sum += book.getRating();
                count++;
            }
        }

		if (count == 0) return 0.0;
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
