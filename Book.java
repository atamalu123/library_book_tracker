/*
 * A Book class (with fields like title, genre, or ISBN) 
 * 
 * Implement methods that let users add new books, remove books from the collection, 
and search for books by attributes such as title or author.
 */

public class Book {
    private String title;
    private Author author;
    private String genre;
    private String isbn;

    // Constructor
    public Book(String title, Author author, String genre, String isbn) {
        this.title = title;
        this.genre = genre;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public Author getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    @Override 
    public String toString() {
        return title + " by " + author.getName() + " (ISBN: " + isbn + ")";
    }

}
