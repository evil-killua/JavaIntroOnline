
import java.util.*;

public class Main {

    public static double Z(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    public static double F(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static double F2(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }

    public static void Task1(Scanner in){
        double a = 0, b = 0, c = 0,z=0;
        System.out.print("введите a: ");
        a = in.nextDouble();
        System.out.print("введите b: ");
        b = in.nextDouble();
        System.out.print("введите c: ");
        c = in.nextDouble();

        z = Z(a, b, c);
        System.out.println("z= " + z);
    }

    public static void Task2(Scanner in){
        double a = 0, b = 0, c = 0,f1=0;
        System.out.print("введите a: ");
        a = in.nextDouble();
        System.out.print("введите b: ");
        b = in.nextDouble();
        System.out.print("введите c: ");
        c = in.nextDouble();

        f1 = F(a, b, c);
        System.out.printf("f1= %.2f", f1);

    }

    public static void Task3(Scanner in){
        double x = 0, y = 0,f2=0;

        System.out.print("введите x: ");
        x = in.nextDouble();
        System.out.print("введите y: ");
        y = in.nextDouble();

        f2 = F2(x, y);
        System.out.printf("\nf2= %.2f", f2);

    }

    public static void Task4(){
        double r = 111.222;
        double rez = (r * 1000) % 1000 + (int) r / 1000.0;
        System.out.println("\nполученое число: " + rez);
    }

    public static void Task5(Scanner in){
        System.out.print("введите время: ");
        int T = 0;
        int min = 0, sec = 0;
        T = in.nextInt();

        int hour = (int) (T / 3600);
        min = (int) (T - hour * 3600) / 60;
        sec = T - hour * 3600 - min * 60;

        System.out.println("данное время " + hour + ":" + min + ":" + sec);
    }

    public static void Task6(Scanner in){
        double x = 0, y = 0;

        System.out.print("введите x: ");
        x = in.nextDouble();
        System.out.print("введите y: ");
        y = in.nextDouble();

        boolean flag = false;
        if ((x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y <= 4 && y >= 0)) flag = true;
        else flag = false;

        System.out.println(flag);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //задание 1
        /*
          Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
         */
        Task1(in);

        //задание 2
        /*
          Вычислить значение выражения по формуле (все переменные принимают действительные значения)
          z=(b+√(b²+4ac))/2a - a³с + b⁻ ²
         */
        Task2(in);

        //задание 3
        /*
          Вычислить значение выражения по формуле (все переменные принимают действительные значения)
          z=(b+√(b²+4ac))/2a - a³с + b⁻ ²
         */
        Task3(in);

        //задание 4
        /*
          Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
          Поменять местами дробную и целую части числа и вывести полученное значение числа.
         */
        Task4();

        //задание 5
        /*
          Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
          данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
         */
        Task5(in);

        //задание 6
        /*
          Для данной области составить линейную программу, которая печатает true, если точка с координатами
          (х, у) принадлежит закрашенной области, и false — в противном случае:
         */
        Task6(in);
    }


}

