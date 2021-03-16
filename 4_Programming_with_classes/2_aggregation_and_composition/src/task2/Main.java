package task2;

import task2.bean.Car;
import task2.bean.Engine;
import task2.bean.Wheel;
import task2.logic.CarLogic;
import task2.view.CarView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
          Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
          Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
         */
        CarLogic carLogic = new CarLogic();
        CarView carView = new CarView();

        Engine engine = new Engine(100);
        List<Wheel> wheels = new ArrayList<Wheel>();
        wheels.add(new Wheel("белшина", "правое переднее"));
        wheels.add(new Wheel("белшина", "левое переднее"));
        wheels.add(new Wheel("белшина", "правое заднее"));
        wheels.add(new Wheel("белшина", "левое заднее"));

        Car car = new Car("Lexus", 0, engine, wheels);

        int volume_of_the_tank;


        carLogic.move(car);

        volume_of_the_tank = carLogic.fillUpTank(car.getVolume_of_the_tank(), car.getMax_volume_of_the_tank(), 20);
        car.setVolume_of_the_tank(volume_of_the_tank);

        carLogic.move(car);
        carLogic.stop();

        List<Wheel> wheelList;
        wheelList = carLogic.changeWheel(car.getWheels(), "правое переднее", "белшина2");
        car.setWheels(wheelList);

        carView.printCarWheel(car.getWheels());
        carView.printCarBrand(car);

    }
}
