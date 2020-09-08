package task9;

public class Book {
    static int count = 1;
    int id = 0;

    String name;
    String author;
    String publishing;
    int year;
    int number_of_pages;
    double price;
    String type_of_binding;

    public Book(String name,String author,String publishing, int year,int number_of_pages,double price,String type_of_binding){
        this.name=name;
        this.author=author;
        this.publishing=publishing;
        this.year=year;
        this.number_of_pages=number_of_pages;
        this.price=price;
        this.type_of_binding=type_of_binding;
        id=count++;
    }

    public String toString(){
        return "название " + name + " автор " + author + " издательство " + publishing + " год " + year + " кол-во страниц " + number_of_pages +
                " цена " + price + " тип переплёта " + type_of_binding;
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


}
