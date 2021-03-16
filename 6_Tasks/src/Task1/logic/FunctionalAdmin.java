package Task1.logic;

import Task1.bean.Book.Book;

import static java.lang.Integer.parseInt;

import java.util.List;

public class FunctionalAdmin {

    public List<Book> changeNameBook(List<Book> books, String nameBook, String newNameBook){
        for (Book book:books) {
            if(book.getName().equals(nameBook)){
                book.setName(newNameBook);
            }
        }
        return books;
    }

    public List<Book> changeAuthorBook(List<Book> books,String authorBook,String newAuthorBook){
        for (Book book:books) {
            if(book.getAuthor().equals(authorBook)){
                book.setName(newAuthorBook);
            }
        }
        return books;
    }

    public List<Book> changeTypeBook(List<Book> books,String typeBook,String newTypeBook){
        for (Book book:books) {
            if(book.getBookType().equals(typeBook)){
                book.setName(newTypeBook);
            }
        }
        return books;
    }


}
