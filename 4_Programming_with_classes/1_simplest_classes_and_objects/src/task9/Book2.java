package task9;

import java.util.Scanner;

public class Book2 {

    Book[] books = {
            new Book("A", "A", "A", 1900, 400, 1241, "твёрдый"),
            new Book("B", "B", "D", 2000, 200, 533, "мягкий"),
            new Book("C", "A", "C", 1950, 700, 5333, "твёрдый"),
            new Book("D", "C", "D", 2020, 40, 120, "мягкий"),
            new Book("E", "C", "B", 1949, 1000, 1500, "твёрдый")
    };

    public void searchAuthor(String name) {
        System.out.println("поиск по автору " + name);
        for (Book book : books) {
            if (book.getAuthor() == name)
                System.out.println(book);
        }

    }

    public void searchPublishing(String publishing) {
        System.out.println("поиск по издательству " + publishing);
        for (Book book : books) {
            if (book.getPublishing() == publishing)
                System.out.println(book);
        }

    }

    public void searchYear(int year) {
        System.out.println("поиск по году " + year);
        for (Book book : books) {
            if (book.getYear() >= year)
                System.out.println(book);
        }

    }

}
