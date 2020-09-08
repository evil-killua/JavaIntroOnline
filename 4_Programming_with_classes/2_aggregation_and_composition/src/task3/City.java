package task3;

public class City {//город
    public static int count = 0;
    int cityCount;
    String name;
    boolean capital = false;

    public City(String name) {
        this.name = name;
        cityCount = count++;
    }

    public City(String name, boolean capital) {
        this.name = name;
        this.capital = capital;
        cityCount = count++;
    }

    public boolean isCapital() {
        return capital;
    }

    public String getName() {
        return name;
    }
}
