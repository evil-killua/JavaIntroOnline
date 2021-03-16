package Task1.bean.Book;

import Task1.bean.Book.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
private List<Book> books;

    {
        books= new ArrayList<Book>();
    }

    public Library(){

    }

    public Library(List<Book> bookList){
        this.books=bookList;
    }

    public void addBook(List<Book> book){

        books.addAll(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
