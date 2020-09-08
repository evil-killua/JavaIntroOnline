package Task1.Book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import java.util.Scanner;

import static java.lang.System.*;

public class AddBook {
    Scanner in = new Scanner(System.in);
    public static final String path0 = "F:\\un\\Курсы\\6 этап\\src\\Task1\\Book\\book.txt";

    public AddBook() throws IOException {
        Book book;

        out.print("Введите имя книги: ");
        String name = in.nextLine();
        out.print("Введите автора книги: ");
        String author = in.nextLine();
        out.print("Введите тип книги: ");
        String bookType = in.nextLine();

        book = new Book(name, author, bookType);
        ArrayBook.books.add(book);

        String newBook = lineSeparator() + name + lineSeparator() + author + lineSeparator() + bookType + lineSeparator() + "///" + lineSeparator();

        writeNewBook(newBook);

    }

    public void writeNewBook(String newBook) throws IOException {
        FileWriter writer = new FileWriter(path0, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(newBook);
        bufferWriter.close();
    }
}
