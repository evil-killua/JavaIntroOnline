package task3;

public class Region {//область
     String name;
     District[] districts;
     double area;
     static int count = 0;
     int RegionCount = 0;

    public Region(String name, double area, District... districts) {
        this.area = area;
        this.name = name;
        this.districts = districts;
        RegionCount = count++;
    }

    public District[] getDistricts() {
        return districts;
    }

    public int getNumberDistrict() {
        return districts.length;
    }

    public double getArea() {
        return area;
    }
}
