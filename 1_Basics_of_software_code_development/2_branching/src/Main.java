import java.util.*;

public class Main {

    public static void Task1() {

        int a = 0, b = 0;

        System.out.println("введите углы");

        a = enterToConsoleIntNumb("a= ");
        b = enterToConsoleIntNumb("b= ");

        if (a + b != 180 && a != 0 && b != 0) {
            System.out.print("треугольник сущ-т");

            if (a == 90 || b == 90 || 180 - a - b == 90) {
                System.out.println("и он прямоугольный");
            }
        } else System.out.println("треугольник не сущ-т");
    }

    public static void Task2() {

        int a = 0, b = 0, c = 0, d = 0;

        a = enterToConsoleIntNumb("a= ");
        b = enterToConsoleIntNumb("b= ");
        c = enterToConsoleIntNumb("c= ");
        d = enterToConsoleIntNumb("d= ");

        int max = ((a < b ? a : b) > (c < d ? c : d)) ? (a < b ? a : b) : (c < d ? c : d);
        System.out.print("max = " + max);
    }

    public static void Task3() {
        int x1 = 0, x2 = 0, x3 = 0, y1 = 0, y2 = 0, y3 = 0;

        x1 = enterToConsoleIntNumb("x1= ");
        y1 = enterToConsoleIntNumb("y1= ");
        x2 = enterToConsoleIntNumb("x2= ");
        y2 = enterToConsoleIntNumb("y2= ");
        x3 = enterToConsoleIntNumb("x3= ");
        y3 = enterToConsoleIntNumb("y4= ");

        if (((x1 - x3) * (y2 - y3)) == ((x2 - x3) * (y1 - y3))) {
            System.out.print("Точки лежат на одной прямой");
        } else {
            System.out.print("Точки не лежат наодной прямой");
        }
    }

    public static void Task4() {
        int A = 0, B = 0, x = 0, y = 0, z = 0;

        A = enterToConsoleIntNumb("A= ");
        B = enterToConsoleIntNumb("B= ");
        x = enterToConsoleIntNumb("x= ");
        y = enterToConsoleIntNumb("y= ");
        z = enterToConsoleIntNumb("z= ");

        if (A * B - x * y >= 0 || A * B - x * z >= 0 || A * B - y * z >= 0) {
            System.out.println("кирпич пройдёт");
        }
        else {
            System.out.println("кирпич не пройдёт");
        }
    }

    public static void Task5() {
        double x = 0, rez = 0;

        x = enterToConsoleIntNumb("x= ");
        if (x <= 3){
            rez = F1(x);
        }
        else {
            rez = F2(x);
        }

        System.out.printf("\nответ %.2f: ", rez);
    }

    public static double F1(double x) {
        return x * x - 3 * x + 9;
    }

    public static double F2(double x) {
        return 1 / (Math.pow(x, 3) + 6);
    }

    public static int enterToConsoleIntNumb(String message) {
        Scanner in = new Scanner(System.in);

        int numb;
        String str;

        System.out.println(">>" + message + ": ");
        while (!in.hasNextInt()) {
            str = in.nextLine();
            System.out.println(">>" + message + ": ");
        }
        numb = in.nextInt();

        return numb;
    }

    public static void main(String[] args) {

        //задача 1
        /*
          Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
          то будет ли он прямоугольным.
         */
        Task1();

        //задача 2
        /*
          Найти max{min(a, b), min(c, d)}.
         */
        Task2();

        //задача 3
        /*
         Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
        */
        Task3();

        //задача 4
        /*
           Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
           пройдет ли кирпич через отверстие.
         */
        Task4();

        //задача 5
        /*
          Вычислить значение функции:
         F(x) = x2 = x²-3x+9, если x<=3
         F(x) = 1/(x³ + 6), если x>3
         */
        Task5();
    }

}
