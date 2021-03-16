package Task1.logic;

import Task1.DAO.BookDAO;
import Task1.bean.Book.Book;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {

    public List<Book> getBook(){
        List<Book> books= new ArrayList<>();
        BookDAO bookDAO = new BookDAO();

        books.addAll(bookDAO.ReadBooks());

        return books;
    }


}
