package org.example.patterns.creational.signleton.enumeration;

import java.util.HashSet;
import java.util.Set;

public enum BookShelf {
    FIRST_BOOK_SHELF("Business"),
    SECOND_BOOK_SHELF("War")
    ;

    private final Set<Book> bookSet;
    private int counter;
    private String genre;

    BookShelf(String genre) {
        this.bookSet = new HashSet<>();
        this.genre = genre;
    }

    public int getCounter() {
        return counter;
    }

    public void addBook(Book book) {
        counter++;
        bookSet.add(book);
    }

    public Set<Book> getBookSet() {
        counter++;
        return bookSet;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "bookSet=" + bookSet +
                ", counter=" + counter +
                ", genre='" + genre + '\'' +
                '}';
    }
}
