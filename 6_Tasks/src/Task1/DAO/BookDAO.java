package Task1.DAO;

import Task1.bean.Book.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class BookDAO {
    public static final String path0 = "F:\\un\\Курсы\\6 этап\\src\\Task1\\Book\\book.txt";

    public void writeNewBook(Book book) throws IOException {
        FileWriter writer = new FileWriter(path0, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        try {
            bufferWriter.write(book.getAuthor() + "\n" + book.getName() + "\n" + book.getBookType() + "\n" + "///");
        } finally {
            bufferWriter.close();
        }

    }

    public List<Book> ReadBooks() {
        List<Book> books = new ArrayList<Book>();
        Book book;

        String name;
        String author;
        String typeBook;

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path0));
            String line = reader.readLine();
            while (line != null) {
                author = line;
                name = reader.readLine();
                typeBook = reader.readLine();

                book = new Book(name, author, typeBook);
                books.add(book);

                line = reader.readLine();

                if (line.equals("///")) {
                    line = reader.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return books;
    }
}
