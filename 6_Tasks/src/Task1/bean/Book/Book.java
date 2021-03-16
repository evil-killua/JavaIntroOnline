package Task1.bean.Book;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private String bookType;

    public Book(){

    }

    public Book(String name, String author, String bookType) {
        this.name = name;
        this.author = author;
        this.bookType = bookType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookType='" + bookType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) &&
                author.equals(book.author) &&
                bookType.equals(book.bookType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, bookType);
    }
}
