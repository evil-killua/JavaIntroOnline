package Task1.Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadBooks {
    Book book;

    String name;
    String author;
    String typeBook;


    public ReadBooks() throws IOException {

        File file = new File(AddBook.path0);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        while (line != null) {
            author = line;
            name = reader.readLine();
            typeBook = reader.readLine();

            book = new Book(name, author, typeBook);
            ArrayBook.books.add(book);

            line = reader.readLine();

            if (line.equals("///")) {
                line = reader.readLine();
            }

        }
    }
}
