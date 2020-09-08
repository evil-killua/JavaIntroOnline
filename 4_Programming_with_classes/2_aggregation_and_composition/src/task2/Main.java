package task2;

public class Main {

    public static void main(String[] args) {
        /*
          Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
          Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
         */

        Car car = new Car(new Engine("1"), new Wheel("белшина"), 4, "Lexus");

        car.move();
        car.stop();
        car.fillUp();
        car.changeWheel();
        car.print();
    }
}
