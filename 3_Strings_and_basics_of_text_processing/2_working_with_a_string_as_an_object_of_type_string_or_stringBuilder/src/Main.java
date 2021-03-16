
import java.util.Scanner;

public class Main {

    public static void Task_2_1() {
        String text = "s dd  d   d     dd d";

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isSpaceChar(text.charAt(i)))
                count++;
            else {
                if (maxCount < count)
                    maxCount = count;

                count = 0;
            }
        }
        System.out.println("макс-е кол-во пробелов: " + maxCount);
    }

    public static void Task_2_2() {
        String text = "a dsfs a sdfs aa dsfsa";

        StringBuilder stringBuilder = new StringBuilder();
        char[] mas = text.toCharArray();

        for (char some : mas) {
            if (some == 'a') {
                stringBuilder.append(Character.toLowerCase(some)).append("b");
            } else {
                stringBuilder.append(some);
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static void Task_2_3() {
        String text = "abcсba";

        StringBuilder sb = new StringBuilder(text).reverse();

        if (text.equals(sb)) {
            System.out.println("палиндромом");
        } else {
            System.out.println("не палиндромом");
        }
    }

    public static void Task_2_4() {
        String text = "информатика";

        char[] mas = text.toCharArray();
        String newText = "";
        newText = newText.concat(String.copyValueOf(mas, 7, 1))
                .concat(String.copyValueOf(mas, 3, 2))
                .concat(String.copyValueOf(mas, 7, 1));

        System.out.println(newText);
    }

    public static void Task_2_5() {
        String text = "a dsfs a sdfs aa dsfsa";
        StringBuilder sb = new StringBuilder(text);

        int count = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("а встречавется " + count + " раз");
    }

    public static void Task_2_6() {
        String text = "a dsfs a sdfs aa dsfsa";

        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < 2*text.length(); i += 2) {
            stringBuilder.insert(i, stringBuilder.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }

    public static void Task_2_7() {
        String text = "abc cde def";
        text = text.replaceAll(" ", "");

        String result = "";
        result += text.charAt(0);

        for (int i = 1; i < text.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j))
                    break;
                if (j == i - 1)
                    result += text.charAt(i);
            }
        }
        System.out.println("рез-т: " + result);

    }

    public static void Task_2_8(Scanner in) {
        System.out.print("введите строку: ");
        String text = in.nextLine();

        String[] words = text.split(" ");

        String maxWordLength;
        int wordLength = 0;
        int length = 0;

        wordLength = words[0].length();
        maxWordLength = words[0];

        for (int i = 1; i < words.length; i++) {
            if ((length = words[i].length()) > wordLength) {
                maxWordLength = words[i];
                wordLength = length;
            }
        }

        System.out.println("само слово: " + maxWordLength + " и его длина : " + wordLength);
    }

    public static void Task_2_9() {
        String text = "sdfs dssfs AAAA dsgs DDFFGDD";

        StringBuilder stringBuilder = new StringBuilder(text);

        int countUp = 0;
        int countLo = 0;

        for (int i = 0; i <stringBuilder.length() ; i++) {
            if(Character.isUpperCase(stringBuilder.charAt(i))){
                countUp++;
            }else if (Character.isLowerCase(stringBuilder.charAt(i))){
                countLo++;
            }
        }

        System.out.println("кол-во строчных: " + countLo + ", колл-во прописных: " + countUp);
    }

    public static void Task_2_10() {
        String text = "a dsfs a.sdfs! aa dsfsa?";

        StringBuilder sb= new StringBuilder(text);

        int count = 0;

        for (int i = 0; i <sb.length(); i++) {
            if(sb.charAt(i) == '.' || sb.charAt(i) == '!' || sb.charAt(i) == '?'){
                count++;
            }
        }

        System.out.println("кол-во предложений " + count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
          Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
         */
        Task_2_1();

        /*
          В строке вставить после каждого символа 'a' символ 'b'.
         */
        Task_2_2();

        /*
          Проверить, является ли заданное слово палиндромом.
         */
        Task_2_3();

        /*
          С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
         */
        Task_2_4();

        /*
          Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
         */
        Task_2_5();

        /*
          Из заданной строки получить новую, повторив каждый символ дважды.
         */
        Task_2_6();

        /*
          Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
          Например, если было введено "abc cde def", то должно быть выведено "abcdef".
         */
        Task_2_7();

        /*
          Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
          Случай, когда самых длинных слов может быть несколько, не обрабатывать.
         */
        Task_2_8(in);

        /*
          Посчитать количество строчных (маленьких) и прописных (больших)
          букв в введенной строке. Учитывать только английские буквы.
         */
        Task_2_9();

        /*
          Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
          восклицательным или вопросительным знаком. Определить количество предложений в строке X.
         */
        Task_2_10();
    }
}
