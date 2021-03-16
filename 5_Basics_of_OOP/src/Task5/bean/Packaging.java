package Task5.bean;

import java.util.Objects;

public class Packaging {
    private String color;

    public Packaging() {

    }

    public Packaging(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Packaging{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packaging packaging = (Packaging) o;
        return color.equals(packaging.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
