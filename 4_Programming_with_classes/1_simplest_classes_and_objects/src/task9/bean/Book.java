package task9.bean;

import java.util.Objects;
import java.util.UUID;

public class Book {

    private UUID id;
    private String name;
    private String author;
    private String publishing;
    private int year;
    private int number_of_pages;
    private double price;
    private String type_of_binding;

    public Book() {

    }

    public Book(String name, String author, String publishing, int year, int number_of_pages,
                double price, String type_of_binding) {
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.number_of_pages = number_of_pages;
        this.price = price;
        this.type_of_binding = type_of_binding;
        id = UUID.randomUUID();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublishing() {
        return publishing;
    }

    public String getType_of_binding() {
        return type_of_binding;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public void setType_of_binding(String type_of_binding) {
        this.type_of_binding = type_of_binding;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                number_of_pages == book.number_of_pages &&
                Double.compare(book.price, price) == 0 &&
                id.equals(book.id) &&
                name.equals(book.name) &&
                author.equals(book.author) &&
                publishing.equals(book.publishing) &&
                type_of_binding.equals(book.type_of_binding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publishing, year, number_of_pages, price, type_of_binding);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", year=" + year +
                ", number_of_pages=" + number_of_pages +
                ", price=" + price +
                ", type_of_binding='" + type_of_binding + '\'' +
                '}';
    }
}
