package task2.view;

import task2.bean.Car;
import task2.bean.Wheel;

import java.util.List;

public class CarView {
    public void printCarBrand(Car car) {
        System.out.println("марка авто: " + car.getCar_brand());
    }

    public void printCarWheel(List<Wheel> wheels) {
        System.out.println(wheels.toString());
    }
}
