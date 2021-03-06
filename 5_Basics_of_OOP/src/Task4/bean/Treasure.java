package Task4.bean;

import java.util.Objects;

public class Treasure {

    private String name;
    private int price;

    public Treasure() {

    }

    public Treasure(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return price == treasure.price &&
                name.equals(treasure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
