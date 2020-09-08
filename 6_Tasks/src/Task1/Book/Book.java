package Task1.Book;

public class Book {
     String name;
     String author;
     String bookType;

    public Book(String name, String author,String bookType) {
        this.name = name;
        this.author = author;
        this.bookType=bookType;
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

    public String toString(){

            return  name + "\n" +
                    author +"\n" +
                    bookType;
    }

}
