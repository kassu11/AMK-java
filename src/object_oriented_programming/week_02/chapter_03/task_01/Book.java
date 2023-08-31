package object_oriented_programming.week_02.chapter_03.task_01;

public class Book {
    private String author;
    private String title;
    private String publicationYear;

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
}
