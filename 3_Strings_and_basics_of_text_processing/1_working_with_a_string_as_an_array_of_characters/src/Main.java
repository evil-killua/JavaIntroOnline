
import java.util.Arrays;
import java.lang.reflect.Array;

public class Main {

    public static String convert(String elem) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] mas = elem.toCharArray();

        for (char some : mas) {
            if (Character.isUpperCase(some)) {
                stringBuilder.append("_").append(Character.toLowerCase(some));
            } else {
                stringBuilder.append(some);
            }
        }
        return stringBuilder.toString();
    }

    public static void Task_1_1() {
        String[] mas = {"aA", "bB", "cC"};
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            mas[i] = convert(mas[i]);
        }
        System.out.println(Arrays.toString(mas));
    }

    public static void Task_1_2() {
        String str = "world qwerty qwerty world qwerty world";
        String str2 = str.replace("world", "letter");
        System.out.println(str2);
    }

    public static void Task_1_3() {
        String elem = "qweq 1231 sdfs 1213";

        char[] mas = elem.toCharArray();
        int count = 0;

        for (char some : mas) {
            if (Character.isDigit(some)) {
                count++;
            }
        }

        System.out.print("кол-во цифр: " + count);
    }

    public static void Task_1_4() {
        String elem = "qweq 1231 sdfs 1213";

        char[] mas = elem.toCharArray();
        int count = 0;

        for (int i = 0; i < mas.length - 1; i++) {
            if (Character.isDigit(mas[i])) {
                if (!Character.isDigit(mas[i + 1])) {
                    count++;
                }
            }
        }

        if (Character.isDigit(mas[mas.length - 1])) {
            count++;
        }

        System.out.print("кол-во чисел: " + count);
    }

    public static void Task_1_5() {
        String elem = "qweq  1231  sdfs 1213  ";
        StringBuilder stringBuilder =new StringBuilder(elem);
        System.out.println(stringBuilder.toString());
        char[] mas = elem.toCharArray();
        int count = -1;

        for (int i = 0; i < mas.length - 1; i++) {
            if (Character.isSpaceChar(mas[i])) {
                if (Character.isSpaceChar(mas[i + 1])) {
                count++;
                stringBuilder.deleteCharAt(i-count);
                }
            }
        }

        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {

        /*
          Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
         */
        Task_1_1();

        /*
          Замените в строке все вхождения 'word' на 'letter'.
         */
        Task_1_2();

        /*
          В строке найти количество цифр.
         */
        Task_1_3();

        /*
          В строке найти количество чисел
         */
        Task_1_4();

        /*
          Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить
          на одиночные пробелы. Крайние пробелы в строке удалить.
         */
        Task_1_5();
    }
}
