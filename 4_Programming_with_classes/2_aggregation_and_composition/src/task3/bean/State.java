package task3.bean;

import task3.bean.District;
import task3.bean.Region;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class State {

    private String name;
    private List<Region> regions;
//     private double areaState;

    {
        regions = new ArrayList<Region>();
    }

    public State() {
    }

    public State(String name) {
        this.name = name;
//        this.areaState = areaState;
//        Collections.addAll(regions,region);
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                '}';
    }
}
