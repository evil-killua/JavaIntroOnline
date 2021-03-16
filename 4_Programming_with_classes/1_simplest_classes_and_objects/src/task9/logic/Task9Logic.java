package task9.logic;

import task9.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class Task9Logic {

    public List<Book> searchAuthor(List<Book> books, String name) {
        List<Book> books1 = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getAuthor().equals(name)) {
                books1.add(book);
            }
        }
        return books1;
    }

    public List<Book> searchPublishing(List<Book> books, String publishing) {
        List<Book> books1 = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getPublishing().equals(publishing)) {
                books1.add(book);
            }
        }
        return books1;
    }

    public List<Book> searchYear(List<Book> books, int year) {
        List<Book> books1 = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getYear() >= year)
                books1.add(book);
        }
        return books1;
    }
}
