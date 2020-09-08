
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    public static void Task_4_1(Scanner in) {
        System.out.println("нок " + nok(2, 4));
        System.out.println("нод " + nod(2, 4));
    }

    public static void Task_4_2(Scanner in) {
        System.out.print("введите a: ");
        int a = in.nextInt();
        System.out.print("\nвведите b: ");
        int b = in.nextInt();
        System.out.print("\nвведите c: ");
        int c = in.nextInt();
        System.out.print("\nвведите d: ");
        int d = in.nextInt();
        System.out.print("\nвведите: " + nod(nod(a, b), nod(c, d)));
    }

    public static double eare(double a) {
        return (Math.sqrt(3) * a * a) / 4;
    }

    public static void Task_4_3(Scanner in) {
        double a = 0;
        System.out.print("введите сторону: ");
        a = in.nextInt();
        double S = 6 * eare(a);
        System.out.printf("\nплощадь шестиугольника= %.2f", S);
    }

    public static double coordinates(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void Task_4_4(Scanner in) {
        int n = 0;
        System.out.print("введите кол-во точек: ");
        n = in.nextInt();

        double x[] = new double[n];
        double y[] = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = (double) (Math.random() * (9 + 1)) + 1;
            y[i] = (double) (Math.random() * (9 + 1)) + 1;
        }
        System.out.println("точки");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " : " + y[i] + "\n");
        }

        double maxL = 0;
        double length;
        int[] rooms = new int[2];

        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < y.length; j++) {
                length = coordinates(x[i], x[j], y[i], y[j]);
                if (length > maxL) {
                    maxL = length;
                    rooms[0] = i;
                    rooms[1] = j;
                }
            }
        }

        System.out.println("\nНаибольшая дистанция между " + rooms[0] + " и "
                + rooms[1]);

    }

    public static int max(int[] mas) {
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            max = max < mas[i] ? mas[i] : max;
        }
        return max;
    }


    public static void Task_4_5(Scanner in) {
        int n = 0;
        System.out.print("введите размер массива: ");
        n = in.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * (9 + 1)) + 1;
        }

        System.out.println("данный массив " + Arrays.toString(a));

        int max = max(a);
        int beforeMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > beforeMax && a[i] != max) {
                beforeMax = a[i];
            }
        }

        System.out.println("\nискомое число: " + beforeMax);

    }

    public static void Task_4_6(Scanner in) {
        System.out.print("введите a ");
        int a = in.nextInt();
        System.out.print("введите b ");
        int b = in.nextInt();
        System.out.print("введите c ");
        int c = in.nextInt();
        if (nod(a, b) == 1 && nod(a, c) == 1 && nod(b, c) == 1)
            System.out.print("\nчисла простые");
        else
            System.out.print("\nчисла не простые");
    }

    public static int fact(int a) {
        int value = 1;

        for (int i = 1; i <= a; i++) {
            value *= i;
        }
        return value;
    }

    public static void Task_4_7(Scanner in) {
        int value = 0;

        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                value += fact(i);
                System.out.println("факт-л " + i + " = " + fact(i));
            }
        }
        System.out.println("сумма всех нечётных факт-л " + value);

    }

    public static void Sum(int mas[], int a, int b) {
        int sum = 0;
        for (int i = a; i <= b - 2; i++) {
            sum = mas[i] + mas[i + 1] + mas[i + 2];
        }
        System.out.println("Сумма от " + a + " до " + b + " = " + sum);
    }

    public static void Task_4_8(Scanner in) {
        int n = 0;
        System.out.print("введите размер массива: ");
        n = in.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * (9 + 1)) + 1;
        }

        System.out.println("данный массив " + Arrays.toString(a));

        for (int i = 0; i < n - 2; i++) {
            Sum(a, i, i + 2);
        }

    }

    public static void Task_4_9(Scanner in) {
        System.out.print("введите X ");
        int x = in.nextInt();
        System.out.print("введите Y ");
        int y = in.nextInt();
        System.out.print("введите Z ");
        int z = in.nextInt();
        System.out.print("введите T ");
        int t = in.nextInt();
        int p = (x + y + z + t) / 2;
        System.out.print("Площадь равна: " + Math.sqrt((p - x) * (p - y) * (p - z) * (p - t)));
    }

    public static int[] formArray(int n) {

        int[] mas = new int[String.valueOf(n).length()];

        for (int i = mas.length - 1; i > -1; i--) {
            mas[i] = n % 10;
            n /= 10;
        }
        return mas;
    }

    public static void Task_4_10(Scanner in) {
        int N = 0;
        System.out.print("введите число: ");
        N = in.nextInt();

        System.out.println(Arrays.toString(formArray(N)));

    }

    public static void comparison(int a, int b) {

        int size_a = String.valueOf(a).length();
        int size_b = String.valueOf(b).length();

        if (size_a > size_b) System.out.println("В первом числе цифр больше");
        else if (size_a < size_b) System.out.println("Во втором числе цифр больше");
        else System.out.print("Равное количество");

    }

    public static void Task_4_11(Scanner in) {
        int a = 0, b = 0;
        System.out.print("введите 2 числа для сравнения: ");
        a = in.nextInt();
        b = in.nextInt();
        comparison(a, b);
    }

    public static int array_sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void Task_4_12(Scanner in) {
        System.out.print("введите k: ");
        int k = in.nextInt();

        int tmp = k;

        System.out.print("введите n: ");
        int n = in.nextInt();

        int sum = 0;
        for (int i = 0; k > 0; i++, k /= 10) {
            sum += k % 10;
        }

        int[] a = new int[tmp / n + 1];

        for (int i = 0; i < a.length; i++) {
            a[i] = n;
        }

        for (int i = 0; array_sum(a) != sum; i++) {
            a[i]--;
            if (i == a.length - 1)
                i = 0;
        }

        System.out.print("рез-т: ");
        for (int x : a)
            if (x != 0)
                System.out.printf(x + " ");
    }

    public static void Twins(int n) {
        System.out.print("пары близнецов на отрезке [" + n + "][" + (2 * n) + "]: ");
        for (int i = n; i < 2 * n - 1; i++) {
            System.out.print("(" + i + "," + (i + 2) + ") ");
        }
    }

    public static void Task_4_13(Scanner in) {
        int n = 0;
        System.out.print("введите n ");
        n = in.nextInt();

        Twins(n);
    }

    public static void Task_4_14(Scanner in) {
        System.out.print("введите к: ");
        int k = in.nextInt();
        IntStream.range(1, k)
                .map(i -> {
                    int patrn = i;
                    int powSum = 0;
                    int pow = (int) Math.log10(i) + 1;
                    while (i != 0) {
                        powSum += (int) Math.pow(i % 10, pow);
                        i /= 10;
                    }
                    if (powSum == patrn)
                        return patrn;
                    return -1;
                })
                .filter(x -> x != -1)
                .forEach(System.out::println);
    }

    public static void numb(int n) {
        int a = 0, b = 0, k = 1;
        //нахождение границ
        for (int i = 0; i < n; i++) {
            a += (n - i) * k;
            b += (9 - i) * k;
            k *= 10;
        }
        //
        for (int i = a; i <= b; i++) {
            k = i;
            int d = k % 10, j;
            for (j = 1; j < n; j++) {
                k /= 10;
                if (k % 10 >= d) break;
                d = k % 10;
            }
            if (j == n) System.out.println(i);
        }
    }

    public static void Task_4_15(Scanner in) {
        System.out.print("введите n: ");
        int n = in.nextInt();

        numb(n);
    }

    public static void even(long sum) {
        int count = 0;
        for (int i = 0; sum > 0; sum /= 10) {
            if ((sum % 10) % 2 == 0)
                count++;
        }

        System.out.print("\nкол-во чётных чисел в сумме: " + count);
    }

    public static void Task_4_16(Scanner in) {
        System.out.print("введите n: ");
        int n = in.nextInt();

        int tmp = 0;
        long sum = 0;
        boolean flag = true;

        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            tmp = i;
            flag = true;

            for (; tmp > 0; tmp /= 10) {
                if ((tmp % 10) % 2 == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                sum += i;

        }
        System.out.print("сумма равна  " + sum);

        even(sum);

    }

    private static int sum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void Task_4_17(Scanner in) {
        System.out.print("введите число ");
        int n = in.nextInt();


        int count = 0;
        while (n != 0) {

                n -= sum(n);

            count++;
        }
        System.out.print("\nкол-во действий " + count);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
          Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
          натуральных чисел:
          HOK(A,B) = (A*B)/ НОД(A,B)
         */
        Task_4_1(in);

        /*
          Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
         */
        Task_4_2(in);

        /*
          Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
          треугольника.
         */
        Task_4_3(in);

        /*
          На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
          из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
         */
        Task_4_4(in);


        /*
         Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
         которое меньше максимального элемента массива, но больше всех других элементов).
        */
        Task_4_5(in);

        /*
          Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
         */
        Task_4_6(in);

        /*
          Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
         */
        Task_4_7(in);


         /*
         Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
         Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
         массива с номерами от k до m.
         */
        Task_4_8(in);

        /*
          Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
          если угол между сторонами длиной X и Y— прямой.
         */
        Task_4_9(in);

        /*
          Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
          являются цифры числа N
         */
        Task_4_10(in);

        /*
          Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
         */
        Task_4_11(in);

        /*
          Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
          являются числа, сумма цифр которых равна К и которые не большее N.
         */
        Task_4_12(in);

        /*
          Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
          Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
          решения задачи использовать декомпозицию.
         */
        Task_4_13(in);

        /*
          Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
          возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
          использовать декомпозицию.
         */
        Task_4_14(in);

        /*
          Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
          последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию
         */
        Task_4_15(in);

        /*
          Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
          Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
         */
        Task_4_16(in);

        /*
          Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
          действий надо произвести, чтобы получился ноль? Для решения задачи использовать декомпозицию.
         */
        Task_4_17(in);
    }
}
