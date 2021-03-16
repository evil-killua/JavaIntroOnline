package Task1.logic;

import Task1.bean.Book.Book;

import java.util.List;

public class FunctionalClient {
    public Book searchBook(List<Book> books, String name){
        for (Book book:books) {
            if(book.getName().equals(name)){
                return book;
            }
        }
        return null;
    }

}
