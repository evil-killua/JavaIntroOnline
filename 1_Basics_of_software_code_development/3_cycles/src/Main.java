
import java.util.*;

public class Main {

    public static void Task1() {
        int x = 0;
        int sum = 0;

        x = enterToConsoleIntNumb("введите х: ");

        for (int i = 1; i <= x; i++)
            sum += i;

        System.out.print("результат суммированияя: " + sum);
    }

    public static void Task2() {

        double a, b, h;

        a = enterToConsoleDoubleNumb("a= ");
        b = enterToConsoleDoubleNumb("b= ");
        h = enterToConsoleDoubleNumb("h= ");

        for (double x = a; x <= b; x += h) {
            if (x > 2 || x == 0) {
                System.out.printf("f(%f) = %f\n", x, x);
            } else {
                System.out.printf("f(%f) = %f\n", x, -x);
            }
        }
    }

    public static void Task3() {

        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }

        System.out.print("сумма: " + sum);
    }

    public static void Task4() {

        int sum = 1;

        for (int i = 1; i <= 200; i++) {
            sum *= Math.pow(i, 2);
        }

        System.out.print("произведение: " + sum);
    }

    public static void Task5() {
        double e = 0.001;
        double sum = 0;

        for (int n = 1; ; n++) {

            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));

            if (Math.abs(a) <= e)

                break;

            sum += a;
        }

        System.out.print("сумма: " + sum);
    }

    public static void Task6() {
        int x = 10000;

        for (int i = 0; x >= i; i++) {
            char c = (char) i;
            System.out.println(i + " и его символ " + c);
        }
    }

    public static void Task7() {

        int m = enterToConsoleIntNumb("Начало промежутка: ");
        int n = enterToConsoleIntNumb("Конец промежутка: ");

        System.out.println("\n" + "Согласно условию");
        for (int k = m; n >= k; k++) {
            System.out.print("Делители числа " + k + ": ");
            check(k);
            System.out.println("");
        }
    }

    public static void check(int numb) {

        for (int i = 1; numb >= i; i++) {

            if (i == 1 || i == numb) {
                continue;
            } else if (numb % i == 0) {
                System.out.print(i + " ");
            } else {
                continue;
            }
        }
    }

    public static void Task8() {

        int a = enterToConsoleIntNumb("a = ");
        int b = enterToConsoleIntNumb("b = ");

        System.out.println("цифры 1го числа ");
        for (int i = 10; a != 0; ) {
            System.out.println(a % i);
            a /= i;
        }

        System.out.println("цифры 2го числа");
        for (int i = 10; b != 0; ) {
            System.out.println(b % i);
            b /= i;
        }
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

    public static double enterToConsoleDoubleNumb(String message) {
        Scanner in = new Scanner(System.in);

        double numb;
        String str;

        System.out.println(">>" + message + ": ");
        while (!in.hasNextDouble()) {
            str = in.nextLine();
            System.out.println(">>" + message + ": ");
        }
        numb = in.nextDouble();

        return numb;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //задание 1
        /*
          Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
          все числа от 1 до введенного пользователем числа.
         */
        Task1();

        //задание 2
        /*
          Вычислить значения функции на отрезке [а,b] c шагом h:
          y=x,x>2  y=-x,x>=2
         */
        Task2();

        //задание 3
        /*
          Найти сумму квадратов первых ста чисел.
         */
        Task3();

        //задание 4
        /*
          Составить программу нахождения произведения квадратов первых двухсот чисел.
         */

        Task4();

        //задание 5
        /*
          Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
          заданному е. Общий член ряда имеет вид:
          aₙ = 1/2ₙ + 1/3ₙ
         */
        Task5();

        //задание 6
        /*
          Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
         */
        Task6();

        //задание 7
        /*
          Для каждого натурального числа в промежутке от m до n вывести все делители,
          кроме единицы и самого числа. m и n вводятся с клавиатуры.
         */
        Task7();

        //задание 8
        /*
          Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
         */
        Task8();
    }
}
