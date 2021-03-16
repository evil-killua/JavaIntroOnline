package task3.bean;

import task3.bean.City;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class District {//район
    private String name;

    private List<City> cityList;

    {
        cityList = new ArrayList<City>();
    }

    public District() {
    }

    public District(String name, City... cities) {
        this.name = name;
        Collections.addAll(cityList, cities);
    }

    public void addCity(City city) {
        cityList.add(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", cityList=" + cityList +
                '}';
    }
}
