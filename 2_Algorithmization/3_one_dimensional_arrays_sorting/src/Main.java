
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void Task_3_1() {
        int n = 0, m = 0, k = 0;

        n = enterToConsoleIntNumb("введите размер 1го массива: ");
        m = enterToConsoleIntNumb("введите размер 2го массива: ");
        k = enterToConsoleIntNumb("введите размер к: ");

        int mas1[] = new int[n];
        int mas2[] = new int[m];

        for (int i = 0; i < n; i++) {
            mas1[i] = (int) (Math.random() * (9 + 1)) + 1;
        }

        for (int i = 0; i < m; i++) {
            mas2[i] = (int) (Math.random() * (9 + 1)) + 1;
        }

        System.out.println("исходный массив 1 " + Arrays.toString(mas1));
        System.out.println("исходный массив 2 " + Arrays.toString(mas2));

        int mas3[] = new int[n + m];

        for (int i = 0, j = 0, z = 0; i < mas3.length; i++) {
            if (i < k || i >= k + mas2.length) {
                mas3[i] = mas1[j];
                j++;
            } else {
                mas3[i] = mas2[z];
                z++;
            }
        }

        System.out.println("рез-т преобазований " + Arrays.toString(mas3));
    }

    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }

    public static void Task_3_2() {
        int mas1[] = {1, 2, 3, 4};
        int mas2[] = {2, 4, 7, 8};

        int n = mas1.length;

        System.out.println("исходный массив 1 " + Arrays.toString(mas1));
        System.out.println("исходный массив 2 " + Arrays.toString(mas2));

        mas1 = Arrays.copyOf(mas1, mas1.length + mas2.length);

        for (int i = n, j = 0; i < mas1.length; i++, j++) {
            mas1[i] = mas2[j];
        }

        bubbleSort(mas1, mas1.length);

        System.out.println("исходный массив  " + Arrays.toString(mas1));
    }

    public static void Task_3_3() {

        int mas[] = {1, 2, 3, 4};

        System.out.println("исходный массив " + Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            int max = mas[i];
            int maxId = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] > max) {
                    max = mas[j];
                    maxId = j;
                }
            }

            // замена
            int temp = mas[i];
            mas[i] = max;
            mas[maxId] = temp;
        }
        System.out.println("отсортированный массив " + Arrays.toString(mas));
    }

    public static void swap(int[] mas, int i) {
        int buff;
        buff = mas[i];
        mas[i] = mas[i - 1];
        mas[i - 1] = buff;
    }

    public static void Task_3_4() {
        int mas[] = {1, 2, 3, 4};
        System.out.println("исходный массив " + Arrays.toString(mas));

        int leftMark = 1;
        int rightMark = mas.length - 1;

        while (leftMark <= rightMark) {
            for (int i = rightMark; i >= leftMark; i--) {
                if (mas[i - 1] < mas[i]) {
                    swap(mas, i);
                }
            }
            leftMark++;

            for (int i = leftMark; i <= rightMark; i++) {
                if (mas[i - 1] < mas[i]) {
                    swap(mas, i);
                }
            }
            rightMark--;
        }

        System.out.println("отсортированный массив " + Arrays.toString(mas));
    }

    static int binarySearch(int arr[], int item, int low, int high) {
        if (high <= low) {
            return (item > arr[low]) ? (low + 1) : low;
        }
        int mid = (low + high) / 2;

        if (item == arr[mid]) {
            return mid + 1;
        }
        if (item > arr[mid]) {
            return binarySearch(arr, item, mid + 1, high);
        }
        return binarySearch(arr, item, low, mid - 1);
    }

    public static void Task_3_5() {
        int n = 0;

        n = enterToConsoleIntNumb("введите размер 1го массива: ");

        int mas[] = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * (9 + 1)) + 1;
        }

        System.out.println("исходный массив 1 " + Arrays.toString(mas));

        int i, loc, j, k, selected;
        for (i = 1; i < n; ++i) {
            j = i - 1;
            selected = mas[i];
            loc = binarySearch(mas, selected, 0, j);
            while (j >= loc) {
                mas[j + 1] = mas[j];
                j--;
            }
            mas[j + 1] = selected;
        }

        System.out.println("отсортированный массив " + Arrays.toString(mas));
    }

    public static void insertionSort(double[] arr, int start, int inc) {
        double tmp;

        for (int i = start; i < arr.length - 1; i += inc)
            for (int j = Math.min(i + inc, arr.length - 1); j - inc >= 0; j = j - inc)
                if (arr[j - inc] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[j - inc];
                    arr[j - inc] = tmp;
                } else break;
    }

    public static void Task_3_6() {
        int n = 0;

        n = enterToConsoleIntNumb("введите размер массива: ");

        double arr[] = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (double) ((double) (Math.random() * (9 + 1)) + 1);
        }

        System.out.println("исходный массив " + Arrays.toString(arr));

        for (int inc = arr.length / 2; inc >= 1; inc = inc / 2) {
            for (int step = 0; step < inc; step++) {
                insertionSort(arr, step, inc);
            }
        }
        System.out.println("массив после сортировки " + Arrays.toString(arr));
    }

    static void Task_3_7() {
        int n;
        int m;

        n = enterToConsoleIntNumb("введите размер 1го массива: ");
        m = enterToConsoleIntNumb("введите размер 2го массива: ");

        int[] b = new int[m];
        for (int i = 0; i < b.length; i++)

            b[i] = (int) (Math.random() * (8 + 1)) + 1;
        bubbleSort(b, b.length);

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)

            a[i] = (int) (Math.random() * (8 + 1)) + 1;
        bubbleSort(a, a.length);

        System.out.println("массив a: " + Arrays.toString(a));
        System.out.print("массив b: " + Arrays.toString(b));


        int[] c = new int[n + m];

        //System.out.println("for the " + k + " element b - " + "- " + i + " place in a");
        for (int i = 0, j = 0, k = 0; i < c.length; i++) {
            if (k >= b.length && j < a.length) {
                c[i] = a[j];
                j++;
            } else if (k < b.length && j >= a.length) {
                c[i] = b[k];
                System.out.println("for the " + (k + 1) + " element b - " + (i + 1) + " place in a");
                k++;
            } else if (k < b.length && b[k] < a[j]) {
                c[i] = b[k];
                System.out.println("for the " + (k + 1) + " element b - " + (i + 1) + " place in a");
                k++;
            } else if (j < a.length && b[k] >= a[j]) {
                c[i] = a[j];
                j++;
            }
        }

    }

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

    public static void Task_3_8() {
        int n = 0;

        n = enterToConsoleIntNumb("введите размер массива: ");

        int mas1[] = new int[n];
        int mas2[] = new int[n];

        for (int i = 0; i < n; i++) {
            mas1[i] = (int) (Math.random() * (9 + 1)) + 1;
            mas2[i] = (int) (Math.random() * (9 + 1)) + 1;
            System.out.print(mas1[i] + "/" + mas2[i] + "  ");
        }
        System.out.println();

        int mean = nok(mas2[0], mas2[1]);
        for (int i = 2; i < n; i++) {
            mean = nok(mean, mas2[i]);
        }

        for (int i = 0; i < n; i++) {
            mas1[i] = mean / mas2[i] * mas1[i];
            mas2[i] = mean;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (mas1[j] > mas1[j + 1]) {
                    int value = mas1[j];
                    mas1[j] = mas1[j + 1];
                    mas1[j + 1] = value;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.print(mas1[i] + "/" + mas2[i] + " ");
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

    public static void main(String[] args) {

        /*
           Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
           один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
           дополнительный массив.
         */
        Task_3_1();

        /*
          Даны две последовательности a1<a2<...<an и b1<b2<...<bn. Образовать из них новую последовательность
          чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
         */
        Task_3_2();

        /*
          Сортировка выбором. Дана последовательность чисел a1 < a2 < ... < an.Требуется переставить элементы так,
          чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
          элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
          повторяется. Написать алгоритм сортировки выбором.
         */
        Task_3_3();

        /*
          Сортировка обменами. Дана последовательность чисел a1 < a2 < ... < an.Требуется переставить числа в
          порядке возрастания. Для этого сравниваются два соседних числа ai, a(i+1). Если ai > ai+1, то делается
          перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
          Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
         */
        Task_3_4();

        /*
          Сортировка вставками. Дана последовательность чисел a1, a2 ... an. Требуется переставить числа в порядке
          возрастания. Делается это следующим образом. Пусть a1, a2 ... ai - упорядоченная последовательность, т. е.
          a1 < a2 < ... < an. Берется следующее число a(i + 1) и вставляется в последовательность так, чтобы новая
          последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n
          не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
          с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
         */
        Task_3_5();

        /*
          Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
          Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai < ai+1,
          то продвигаютсяна один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются
          на один элемент назад.Составить алгоритм этой сортировки.
         */
        Task_3_6();

        /*
          Пусть даны две неубывающие последовательности действительных чисел a1 < a2 < ... < an и
          b1 < b2 < ... < bm; Требуется указать те места, на которые нужно вставлять элементы последовательности
          b1, b2...bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
         */
        Task_3_7();

        /*
          Даны дроби p1/q1, p2/q2,.., pn/qn(pi,qi - натуральные). Составить программу, которая приводит
          эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
         */
        Task_3_8();
    }
}
