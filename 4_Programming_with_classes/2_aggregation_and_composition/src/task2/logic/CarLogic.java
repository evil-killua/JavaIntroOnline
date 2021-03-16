package task2.logic;

import task2.bean.Car;
import task2.bean.Wheel;

import java.util.List;

public class CarLogic {

//TODO я знаю что методы logic должны что-то возвращать, но в этой задаче  не понимаю как сделать
// методы move и stop что бы плохо не выглядело,такой вариант считаю оптимальным

    public void move(Car car) {
        if (car.getVolume_of_the_tank() != 0) {
//            engine.setPerformance(true);
            System.out.println("Автомобиль тронулся");
        } else {
            System.out.println("бак пуст,необходима заправка!!!");
        }
    }


    public void stop() {
        System.out.println("Автомобиль остановился");
    }

    public List<Wheel> changeWheel(List<Wheel> wheels, String change_wheel, String wheel_brand) {

        for (int i = 0; i < wheels.size(); i++) {
            if (wheels.get(i).getLocation_wheel().equals(change_wheel)) {
                wheels.set(i, new Wheel(change_wheel, wheel_brand));
            }
        }
        return wheels;
    }

    public int fillUpTank(int volume_of_the_tank, int max_volume_of_the_tank, int number_of_liters) {

        if (number_of_liters + volume_of_the_tank <= max_volume_of_the_tank) {
            number_of_liters += volume_of_the_tank;
            return number_of_liters;
        } else {
//            System.out.println("в бак столько не поместится!!!!!");
            return volume_of_the_tank;
        }
    }
}
