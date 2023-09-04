package object_oriented_programming.week_02.chapter_03.task_06;

import java.util.ArrayList;

public class Book {
    private String author;
    private String title;
    private int publicationYear;
    private double rating = 0;
    private User borrowedBy;
    private ArrayList<String> reviews = new ArrayList<>();

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        this.reviews.add(review);
    }

    public double getRating() {
        return this.rating;
    }

    public ArrayList<String> getReviews() {
        return this.reviews;
    }

    public void setBorrowedBy(User user) {
        this.borrowedBy = user;
    }
}
