package org.example;


import org.example.patterns.creational.signleton.multitone.Book;
import org.example.patterns.creational.signleton.multitone.BookShelfMultitone;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        BookShelfMultitone bookShelfMultitone = BookShelfMultitone.getInstance("Business");

        Book book = new Book(1990, "bla bla");
        Book book1 = new Book(1995, "cola");
        Book book2 = new Book(2000, "drizel");
        Book book3 = new Book(0, "Bible");

        bookShelfMultitone.addBook(book);
        bookShelfMultitone.addBook(book1);
        bookShelfMultitone.addBook(book2);
        bookShelfMultitone.addBook(book3);

        System.out.println("bookShelfMultitone = " + bookShelfMultitone);
    }

}