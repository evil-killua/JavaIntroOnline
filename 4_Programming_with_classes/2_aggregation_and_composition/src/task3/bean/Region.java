package task3.bean;

import task3.bean.District;

import java.util.ArrayList;
import java.util.List;

public class Region {//область
    private String name;
    private List<District> districts;
    private double area;

    {
        districts = new ArrayList<District>();
    }

    public Region() {
    }

    public Region(String name, double area) {
        this.area = area;
        this.name = name;
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    public List<District> getDistricts() {
        return districts;
    }

    public int getNumberDistrict() {
        return districts.size();
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", districts=" + districts +
                ", area=" + area +
                '}';
    }
}
