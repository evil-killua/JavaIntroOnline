package task2.bean;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final int max_volume_of_the_tank = 50;
    private int volume_of_the_tank;
    private String car_brand;

    private Engine engine;
    //    private Wheel wheel;
    private List<Wheel> wheels;

    {
        engine = new Engine();
        wheels = new ArrayList<Wheel>();
    }

    public Car() {

    }

    public Car(String car_brand, int volume_of_the_tank, Engine engine, List<Wheel> wheels) {
        this.car_brand = car_brand;
        this.volume_of_the_tank = volume_of_the_tank;
        this.engine = engine;
        this.wheels = wheels;
    }

    public int getMax_volume_of_the_tank() {
        return max_volume_of_the_tank;
    }

    public int getVolume_of_the_tank() {
        return volume_of_the_tank;
    }

    public void setVolume_of_the_tank(int volume_of_the_tank) {
        this.volume_of_the_tank = volume_of_the_tank;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "max_volume_of_the_tank=" + max_volume_of_the_tank +
                ", volume_of_the_tank=" + volume_of_the_tank +
                ", car_brand='" + car_brand + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
