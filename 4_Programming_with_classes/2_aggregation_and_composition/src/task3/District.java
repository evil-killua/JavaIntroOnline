package task3;

public class District {//район
    String name;
    City city;

    public District(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}
