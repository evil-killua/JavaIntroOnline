package task3.bean;

public class City {//город
    private String name;
    private boolean capital;
    private boolean regionalCenter;

    {
        capital = false;
        regionalCenter = false;
    }

    public City() {

    }

    public City(String name) {
        this.name = name;
    }

    public City(String name, boolean capital, boolean regionalCenter) {
        this.name = name;
        this.capital = capital;
        this.regionalCenter = regionalCenter;
    }

    public boolean isCapital() {
        return capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public boolean isRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", capital=" + capital +
                ", regionalCenter=" + regionalCenter +
                '}';
    }
}
