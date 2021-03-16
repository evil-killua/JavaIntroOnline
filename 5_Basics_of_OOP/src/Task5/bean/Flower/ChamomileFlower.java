package Task5.bean.Flower;

import java.util.Objects;

public class ChamomileFlower implements Flower {

    private String name;
    private int size;

    {
        name = "ромашка";
    }

    public ChamomileFlower() {

    }

    public ChamomileFlower(int size) {
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
        return "ChamomileFlower{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChamomileFlower that = (ChamomileFlower) o;
        return size == that.size &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
