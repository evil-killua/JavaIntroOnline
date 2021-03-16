package task3.logic;

import task3.bean.City;
import task3.bean.District;
import task3.bean.Region;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {
    public City searchCapital(List<Region> regions) {
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                for (City city : district.getCityList()) {
                    if (city.isCapital()) {
                        return city;
                    }
                }
            }
        }
        return null;
    }

    public double areaCalculation(List<Region> regions) {
        double areaState = 0;

        for (Region region : regions) {
            areaState += region.getArea();
        }

        return areaState;
    }

    public List<City> searchRegionalCenter(List<Region> regions) {
        List<City> cityList = new ArrayList<City>();


        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                for (City city : district.getCityList()) {
                    if (city.isRegionalCenter()) {
                        cityList.add(city);
                    }
                }
            }
        }
        return cityList;
    }
}
