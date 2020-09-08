
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void Task_2_1(Scanner in) {

        System.out.print("ввидите n: ");
        int n = in.nextInt();

        System.out.print("введите m: ");
        int m = in.nextInt();

        int mas[][] = new int[n][m];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * (8 + 1)) + 1;
            }
        }

        System.out.println("исходный массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 1; i < mas.length; i += 2) {
            if (mas[0][i] > mas[mas[i].length - 1][i]) {
                for (int a = 0; a < mas[i].length; a++) {
                    System.out.println(mas[a][i]);
                }
                System.out.println(" ");
            }
        }
    }

    public static void Task_2_2(Scanner in) {
        System.out.print("ввидите n: ");
        int n = in.nextInt();

        System.out.print("введите m: ");
        int m = in.nextInt();

        int mas[][] = new int[n][m];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * (8 + 1)) + 1;
            }
        }

        System.out.println("исходный массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        System.out.println("диаганальный");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i][i] + " ");
        }

    }

    public static void Task_2_3(Scanner in) {

        System.out.print("ввидите n: ");
        int n = in.nextInt();

        System.out.print("введите m: ");
        int m = in.nextInt();

        int mas[][] = new int[n][m];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * (8 + 1)) + 1;
            }
        }

        System.out.println("исходный массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        int k = 0, p = 0;
        System.out.print("введите к: ");
        k = in.nextInt();
        System.out.print("введиет p: ");
        p = in.nextInt();

        System.out.println("к-я строка ");
        for (int i = 0; i < m; i++) {
            System.out.print(mas[k - 1][i] + " ");
        }

        System.out.println("\np-й столбец");
        for (int i = 0; i < n; i++) {
            System.out.print(mas[i][p - 1] + " ");
        }
    }

    public static void Task_2_4(Scanner in) {
        int n = 0;
        System.out.print("введите n: ");
        n = in.nextInt();
        int mas[][] = new int[n][n];

        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = j + 1;
            }
        }

        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = n - j;
            }
        }

        System.out.println("массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }

    public static void Task_2_5(Scanner in) {
        int n = 0;
        System.out.print("введите n: ");
        n = in.nextInt();
        int mas[][] = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                mas[i][j] = i + 1;
            }
        }

        System.out.println("массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void Task_2_6(Scanner in) {
        int n = 0;
        System.out.print("введите n: ");
        n = in.nextInt();
        int mas[][] = new int[n][n];

        for (int i = 0; i < mas.length / 2; ++i) {
            for (int j = i; j < n - i; j++) {
                mas[i][j] = 1;
                mas[mas.length - i - 1][j] = 1;
            }
        }

        System.out.println("массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }

    public static void Task_2_7(Scanner in) {
        int n = 0;
        System.out.print("введите n: ");
        n = in.nextInt();
        double mas[][] = new double[n][n];
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = Math.sin((i * i - j * j) / n);
                if (mas[i][j] > 0) count++;
            }
        }

        System.out.println("массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.printf("%.2f ", mas[i][j]);
            }
            System.out.println(" ");
        }
        System.out.print("\nкол-во пол-х: " + count);
    }

    public static void Task_2_8(Scanner in) {
        System.out.print("ввидите n: ");
        int n = in.nextInt();

        System.out.print("введите m: ");
        int m = in.nextInt();

        int mas[][] = new int[n][m];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * (8 + 1)) + 1;
            }
        }

        System.out.println("исходный массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        int first = 0, second = 0;
        System.out.print("введите номера столбцов которые хотитие поменять местами:");
        first = in.nextInt();
        second = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = mas[i][first - 1];
                mas[i][first - 1] = mas[i][second - 1];
                mas[i][second - 1] = temp;
            }
        }

        System.out.println("массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }

    public static void Task_2_9(Scanner in) {
        System.out.print("ввидите n: ");
        int n = in.nextInt();
        System.out.print("ввидите m: ");
        int m = in.nextInt();

        int mas[][] = new int[n][m];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * (8 + 1)) + 1;
            }
        }

        System.out.println("исходный массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        int sum = 0, max = 0, stolb = 0, maxStolb = 0;
        for (int i = 0; i < mas[0].length; i++) {
            for (int j = 0; j < mas.length; j++) {
                sum += mas[j][i];
                stolb = j + 1;
            }
            if (sum > max) {
                max = sum;
                maxStolb = stolb;
            }
            System.out.print(sum + " ");
            sum = 0;
        }
        System.out.println("\n" + "Максимальная сумма " + max + " в столбце " + maxStolb);
    }

    public static void Task_2_10(Scanner in) {
        System.out.print("ввидите n: ");
        int n = in.nextInt();

        int mas[][] = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * 200) - 100;
            }
        }

        System.out.println("исходный массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        System.out.println("положит-е эл-ты на главной диагонали");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i][i] > 0) System.out.print(mas[i][i] + " ");
        }
    }

    public static void Task_2_11(Scanner in) {

        int mas[][] = new int[10][20];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * (14 + 1)) + 0;
            }
        }
        System.out.println("исходный массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");


        for (int i = 0; i < mas.length; i++) {
            int count = 0;

            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("Строка " + (i + 1));
            }
        }

    }

    public static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void Task_2_12(Scanner in) {
        System.out.print("ввидите n: ");
        int n = in.nextInt();
        System.out.print("ввидите m: ");
        int m = in.nextInt();

        int mas[][] = new int[n][m];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * (8 + 1)) + 1;
            }
        }

        System.out.println("исходный массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        System.out.println("По возрастанию:");
        for (int[] i : mas) {
            Arrays.sort(i);
            System.out.println(Arrays.toString(i));
        }

        System.out.println("По убыванию:");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                bubbleSort(mas[i]);
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }

    }

    public static void Task_2_13(Scanner in) {

        System.out.print("ввелите n");
        int n = in.nextInt();
        System.out.print("введите m");
        int m = in.nextInt();

        int[][] mas = new int[n][m];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * (8 + 1)) + 1;
            }
        }

        System.out.println("исходная матрицы: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
        System.out.println("по возрастанию : ");
        for (int k = 0; k < mas[0].length; k++) {
            for (int i = mas.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (mas[j][k] > mas[j + 1][k]) {
                        int tmp = mas[j][k];
                        mas[j][k] = mas[j + 1][k];
                        mas[j + 1][k] = tmp;
                    }
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
        System.out.println("по убыванию ");
        for (int k = 0; k < mas[0].length; k++) {
            for (int i = mas.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (mas[j][k] < mas[j + 1][k]) {
                        int tmp = mas[j][k];
                        mas[j][k] = mas[j + 1][k];
                        mas[j + 1][k] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }

    }

    static public void Task_2_14(Scanner in) {
        System.out.print("введите n ");
        int n = in.nextInt();
        int[][] mas = new int[n][n];

        for (int i = 0; i < mas[0].length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (j >= i)
                    mas[i][j] = 1;
                else
                    mas[i][j] = 0;
            }
        }

        System.out.println("матрица: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }

    }

    public static void Task_2_15(Scanner in){
        System.out.print("ввелите n ");
        int n = in.nextInt();
        System.out.print("введите m ");
        int m = in.nextInt();

        int[][] mas = new int[n][m];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = (int) (Math.random() * (8 + 1)) + 1;
            }
        }

        System.out.println("исходная матрицы: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
        int max=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max=mas[0][0];
                if(mas[i][j]>max)max=mas[i][j];
            }
        }

        System.out.print("max " + max + "\n");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
            if(mas[i][j]%2!=0)mas[i][j]=max;
            }
        }

        System.out.println("после преобразований матрица: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
    }

    public static void Task_2_16(Scanner in){

            System.out.print("введите n ");
            int n = in.nextInt();
            int m[][] = new int[n][n];

            int i, j;
            int num = 1;

            int nn = n * 3 / 2; //4


            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    m[(j - i + nn) % n][(i * 2 - j + n) % n] = num++;

                    //System.out.println(num);
                }
            }

            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(m[i][j] + "\t");
                }
                System.out.println();
            }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
          Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
         */

        Task_2_1(in);

        /*
          Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
         */
        Task_2_2(in);

        /*
          Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
         */
        Task_2_3(in);

        /*
          Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                     1  2   3   .... n
                     n  n-1 n-2 .... n
                     1  2   3   .... n
                     n  n-1 n-2 .... n
                     .................
                     n  n-1 n-2 .... n
         */
        Task_2_4(in);

        /*
          Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                      1 1 1 1 .... 1
                      2 2 2 2 .... 0
                      3 3 3 0 .... 0
                      ..............
                      n 0 0 0 .... 0
         */
        Task_2_5(in);

        /*
          Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                        1 1 1 .... 1 1 1
                        0 1 1 .... 1 1 0
                        0 0 1 .... 1 0 0
                        ................
                        0 0 1 .... 1 0 0
                        0 1 1 .... 1 1 0
                        1 1 1 .... 1 1 1
         */
        Task_2_6(in);

        /*
          Сформировать квадратную матрицу порядка N по правилу:
          A[I,J] = sin((I² - J²) / N)
          и подсчитать количество положительных элементов в ней
         */

        Task_2_7(in);

        /*
          В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
          на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
          пользователь с клавиатуры.
         */
        Task_2_8(in);

        /*
          Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
          столбец содержит максимальную сумму.
         */
        Task_2_9(in);

        /*
          Найти положительные элементы главной диагонали квадратной матрицы.
         */
        Task_2_10(in);

        /*
          Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
          которых число 5 встречается три и более раз.
         */
        Task_2_11(in);

        /*
          Отсортировать строки матрицы по возрастанию и убыванию значений элементов
         */
        Task_2_12(in);

        /*
          Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов
         */
        Task_2_13(in);

        //TODO  при данном условии возможны ошибки,поэтому необходи решать задачу с квадратной матрицей

         /*
         Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
         единиц равно номеру столбца.
         */
        Task_2_14(in);

        /*
          Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
         */
        Task_2_15(in);

        /*
          Магическим квадратом порядка n называется квадратная матрица n*n составленная из чисел 1,2,3,...,n², так,
          что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
          Пример магического квадрата порядка 3:
                            6 1 8
                            7 5 3
                            2 9 4
         */
        Task_2_16(in);
    }
}
