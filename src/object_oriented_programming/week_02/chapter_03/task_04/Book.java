package object_oriented_programming.week_02.chapter_03.task_04;

import java.util.ArrayList;

public class Book {
    private String author;
    private String title;
    private String publicationYear;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();

    public Book(String author, String title, String publicationYear) {
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

    public String getPublicationYear() {
        return this.publicationYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        this.reviews.add(review);
    }
}
