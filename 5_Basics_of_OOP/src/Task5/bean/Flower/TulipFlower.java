package Task5.bean.Flower;

import java.util.Objects;

public class TulipFlower implements Flower {

    private String name;
    private int size;

    {
        name = "тюльпан";
    }

    public TulipFlower() {

    }

    public TulipFlower(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TulipFlower{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TulipFlower that = (TulipFlower) o;
        return size == that.size &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
