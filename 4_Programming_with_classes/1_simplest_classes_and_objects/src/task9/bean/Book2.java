package task9.bean;

import task9.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class Book2 {
    private List<Book> books;

    {
        books = new ArrayList<Book>();
    }

    public Book2() {

    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "books=" + books +
                '}';
    }
}
