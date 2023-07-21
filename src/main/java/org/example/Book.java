package org.example;

public class Book {

    private String title;
    private String author;
    private String genre;
    private String publicationDate;
    private String isbn;

    public Book(String title, String author, String genre, String publicationDate, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationDate = publicationDate;
        this.isbn = isbn;
    }

    public void displayBook() {
        System.out.println("I am reading " + title + "by " + author + ". its genre is "
                + genre + ". The publication Date is: " + publicationDate + " and isbn: " + isbn + ".");
    }
}
