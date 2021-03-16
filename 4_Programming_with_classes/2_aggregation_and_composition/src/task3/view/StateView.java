package task3.view;

import task3.bean.City;
import task3.bean.District;
import task3.bean.Region;
import task3.bean.State;

import java.util.List;

public class StateView {
    public void printCapital(City city) {
        System.out.println("Столица: " + city.toString());
    }

    public void printNumberRegion(List<Region> regions) {
        System.out.println("Количество областей: " + (regions.size()));
    }

    public void printStateArea(double areaState) {
        System.out.println("Площадь страны: " + areaState);
    }

    public void printRegionalCenter(List<City> cities) {
        System.out.println("Областные центры:");
        for (City city : cities) {
            System.out.println(city.toString());
        }
    }
}
