
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void Task_1_1() {

        int N = 0, K = 0;

        N = enterToConsoleIntNumb("введите размер массива: ");
        K = enterToConsoleIntNumb("введите размер К: ");

        int A[] = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = (int) (Math.random() * (99 + 1)) + 1;
            if (A[i] % K == 0) sum += A[i];
        }

        System.out.println("исходный массив ");
        System.out.println(Arrays.toString(A));

        System.out.print("\nсумма эл-в кратных К = " + sum);

    }

    public static void Task_1_2() {
        int N = 0, Z = 0;


        N = enterToConsoleIntNumb("введите разме массива: ");
        Z = enterToConsoleIntNumb("введите размер Z: ");

        double A[] = new double[N];
        for (int i = 0; i < N; i++) A[i] = (double) Math.random() * 200 - 100;

        System.out.printf("исходный массив " + Arrays.toString(A));

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > Z) {
                A[i] = Z;
                count++;
            }
        }

        System.out.println("\nмассив после преобразований" + Arrays.toString(A) + " \nвол-во замен: " + count);

    }

    public static void Task_1_3() {
        int N = 0;

        N = enterToConsoleIntNumb("введите размер массива: ");

        double A[] = new double[N];
        for (int i = 0; i < N; i++) A[i] = (double) Math.random() * 200 - 100;

        System.out.printf("исходный массив " + Arrays.toString(A));

        int count_0 = 0, count_positive = 0, count_negative = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > 0) count_positive++;
            else if (A[i] < 0) count_negative++;
            else count_0++;
        }

        System.out.print("\nкол-во положительных: " + count_positive + "\nкол-во отрицительных чисел: " + count_negative +
                "\nкол-во эл-в равных 0: " + count_0);
    }

    public static void Task_1_4() {
        int N = 0;

        N = enterToConsoleIntNumb("введите размер массива: ");

        double A[] = new double[N];
        for (int i = 0; i < N; i++) A[i] = (double) Math.random() * 200 - 100;

        System.out.printf("исходный массив " + Arrays.toString(A));

        int largest = 0, smallest = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < A[smallest]) smallest = i;
            if (A[i] > A[largest]) largest = i;
        }

        double swap;

        swap = A[largest];
        A[largest] = A[smallest];
        A[smallest] = swap;

        System.out.printf("\nпол-й массив " + Arrays.toString(A));
    }

    public static void Task_1_5() {
        int N = 0;

        N = enterToConsoleIntNumb("введите размер массива: ");

        int A[] = new int[N];
        for (int i = 0; i < N; i++) A[i] = (int) (Math.random() * 200 - 100);

        System.out.printf("исходный массив " + Arrays.toString(A));

        System.out.print("\nудовл-е условию числа: ");
        for (int i = 0; i < N; i++) {
            if (A[i] > i) System.out.print(A[i] + " ");
        }
    }

    static boolean prime_number(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static void Task_1_6() {
        int N = 0;

        N = enterToConsoleIntNumb("введите размер массива: ");

        double A[] = new double[N];
        for (int i = 0; i < N; i++) A[i] = (double) (Math.random() * 200 - 100);

        System.out.printf("исходный массив " + Arrays.toString(A));

        System.out.println("Удовлетворяющие условию");
        for (int i = 0; i < A.length; i++) {
            if (prime_number(i + 1))
                System.out.println(A[i]);
        }
    }

    public static void Task_1_7() {
        int N = 0;

        N = enterToConsoleIntNumb("введите размер массива: ");

        double A[] = new double[N];
        for (int i = 0; i < N; i++) A[i] = (double) (Math.random() * 200 - 100);

        System.out.printf("исходный массив " + Arrays.toString(A));


        double max = A[0] + A[A.length - 1];
        double maxFinal = 0;
        for (int i = 1; i < A.length / 2; i++) {
            double sum = A[i] + A[A.length - 1 - i];
            maxFinal = max < sum ? sum : max;
        }
        System.out.println("\n" + maxFinal);
    }

    public static void Task_1_8() {
        int N = 0;

        N = enterToConsoleIntNumb("введите размер массива: ");
        //int A[]=new int[]{1,2,3,4,1,4,5,8};

        int A[] = new int[N];
        for (int i = 0; i < N; i++) A[i] = (int) (Math.random() * 200 - 100);

        System.out.printf("исходный массив " + Arrays.toString(A));


        int min = A[0], counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= min) {
                if (A[i] < min) {
                    min = A[i];
                    counter = 1;
                } else
                    counter++;
            }
        }
        int B[] = new int[A.length - counter];
        for (int i = 0, j = 0; i < A.length; i++) {
            if (A[i] != min) {
                B[j] = A[i];
                j++;
            }
        }

        System.out.println("\nB: " + Arrays.toString(B));
    }

    public static void Task_1_9() {
        int N = 0;

        N = enterToConsoleIntNumb("введите размер массива: ");
        //int A[]=new int[]{1,2,3,4,1,4,5,8};

        int A[] = new int[N];
        for (int i = 0; i < N; i++) A[i] = (int) (Math.random() * 200 - 100);
        int[] popular = new int[A.length];

        System.out.printf("исходный массив " + Arrays.toString(A));


        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    popular[i]++;
                }
            }
        }

        int result = A[0];
        int popular_result = popular[0];

        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popular_result) {
                popular_result = popular[i];
                result = A[i];
            }
            if ((popular_result == popular[i]) && (A[i] < result)) {
                result = A[i];
            }
        }
        System.out.println("\nрез-тат: " + result);

    }

    public static void Task_1_10() {
        int N = 0;

        N = enterToConsoleIntNumb("введите размер массива: ");

        int A[] = new int[N];
        for (int i = 0; i < N; i++) A[i] = (int) (Math.random() * 200 - 100);

        System.out.printf("исходный массив " + Arrays.toString(A));

        for (int i = 0; i < N; i++) {
            if (i % 2 != 0) A[i] = 0;
        }

        System.out.printf("\nмассив после сжатия " + Arrays.toString(A));

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
          В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
         */
        Task_1_1();

        /*
          Дана последовательность действительных чисел a₁,a₂,...,aₙ. Заменить все ее члены, большие данного Z, этим числом.
          Подсчитать количество замен.
         */
        Task_1_2();

        /*
          Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
          положительных и нулевых элементов
         */
        Task_1_3();

        /*
          Даны действительные числа a₁,a₂,...,aₙ . Поменять местами наибольший и наименьший элементы.
         */
        Task_1_4();

        /*
          Даны целые числа а₁,а₂ ,..., аₙ . Вывести на печать только те числа, для которых аᵢ > i.
         */
        Task_1_5();

        /*
          Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
          являются простыми числами.
         */
        Task_1_6();

        /*
           Даны действительные числа (a₁,a₂,...,aₙ).
           Найти max(a₁ | a₂ₙ, a₂ | a₂ₙ₋₁,...  aₙ | aₙ₊₁)
         */
        Task_1_7();

        /*
          Дана последовательность целых чисел (a₁,a₂,...,aₙ).
          Образовать новую последовательность, выбросив из данной min(a₁,a₂,...,aₙ)
         */
        Task_1_8();

        /*
         В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
         Если таких чисел несколько, то определить наименьшее из них.
         */
        Task_1_9();

        /*
          Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
          элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
         */
        Task_1_10();
    }
}
