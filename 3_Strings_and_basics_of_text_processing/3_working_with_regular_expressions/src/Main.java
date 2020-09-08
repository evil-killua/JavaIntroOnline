
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Comparator.comparingInt;

public class Main {



    public static void main(String[] args) {
        /*
          Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
          операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
          отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
          алфавиту.
         */
        Task_3_1();

        Task_3_2();
    }

    public static void Task_3_2(){
        String xml = "<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>";

        String[] examine = xml.split("\\n");
        StringBuilder stringBuilder = new StringBuilder();
        Pattern openTag = Pattern.compile("<[\\w=\"\\s]+>");
        Pattern closeTag = Pattern.compile("<(/+[\\w]+?)>");
        Pattern emptyTag = Pattern.compile("<([\\w]+/)>");
        Pattern contentTag = Pattern.compile("[а-яА-яЁё\\s]+[!.?,]?");

        for (String s : examine) {

            Matcher openingTagMatcher = openTag.matcher(s);
            if (openingTagMatcher.find()) {
                stringBuilder.append("Открывающий тег ");
                stringBuilder.append(openingTagMatcher.group());
            }

            Matcher tagWithoutBodyMatcher = emptyTag.matcher(s);
            if (tagWithoutBodyMatcher.find()) {
                stringBuilder.append(tagWithoutBodyMatcher.group());
                stringBuilder.append(" Тег без тела");
            }

            Matcher contentTagMatcher = contentTag.matcher(s);
            if (contentTagMatcher.find()
                    && !contentTagMatcher.group().equals(" ")) {
                stringBuilder.append(" Содержимое тега: ");
                stringBuilder.append(contentTagMatcher.group());
                stringBuilder.append(" ");
            }

            Matcher closeTagMatcher = closeTag.matcher(s);
            if (closeTagMatcher.find()) {
                stringBuilder.append(closeTagMatcher.group());
                stringBuilder.append(" Закрывающий тег");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
    

    public static void Task_3_1() {

        String text = "I live in a house. I like my house very much. It’s neither big nor little.\n" +
                "When you enter the house you see a big living room. There is a sofa and a round table in the middle of the living room.\n" +
                "There is a big TV-set on the wall. My living room is light as there are 4 big windows. There is a kitchen to the right and stairs to the upper floor. The kitchen is big, and the whole family can get together for dinner there.\n" +
                "My parents also like to invite their friends for dinner.";

        System.out.println("Абзацы по количеству предложений: \n");
        sortParagraph(text);
        System.out.println("\nОтсортированые слова в каждом предложении по длине: \n");
        sortWord(text);
        System.out.println("Отсортированные лексемы:\n");
        SortLiteral(text, 'c');

    }

    private static void sortParagraph(String text) {
        String[] paragraphs = text.split("\\n");
        int count = 0;

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String paragr : paragraphs) {
            for (String s1 : paragr.split("[.!?]")) {
                count++;
            }
            map.put(paragr, count);
            count = 0;
        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    private static void sortWord(String text) {
        String[] sentences = text.split("[.!?]");
        ArrayList<String> words = new ArrayList<>();
        Comparator<String> comparator = comparingInt(String::length);
        for (String sent : sentences) {

            Collections.addAll(words, sent.split("\\s*([ ,;:.«»\\-—])\\s*"));
            words.sort(comparator);
            System.out.println(words);
            words.clear();
        }

    }


    private static void SortLiteral(String text, char letter) {
        if (text.indexOf(letter) != -1) {
            String[] sentences = text.split("([.!?]+)");
            for (String s : sentences) {
                String[] mass = s.split("\\W");
                for (int k = 0; k < mass.length; k++) {
                    if (mass[k].indexOf(letter) == -1) {
                        mass[k] = mass[k].replaceAll(".", "");
                    }
                }
                for (int k = 0; k < mass.length; k++) {
                    for (int j = 0; j < mass.length - 1; j++) {
                        if (CountLiteral(mass[j], letter) > CountLiteral(mass[j + 1], letter)) {
                            String temp = mass[j];
                            mass[j] = mass[j + 1];
                            mass[j + 1] = temp;
                        }
                    }
                }
                for (int k = 0; k < mass.length; k++) {
                    for (int j = 0; j < mass.length - 1; j++) {
                        if (CountLiteral(mass[j], letter) == CountLiteral(mass[j + 1], letter) && mass[j].compareTo(mass[j + 1]) > 0) {
                            String temp = mass[j];
                            mass[j] = mass[j + 1];
                            mass[j + 1] = temp;
                        }
                    }
                }
                int count = 1;
                for (String a : mass) {
                    if (!a.equals("")) {
                        if (count == mass.length) {
                            System.out.print(a);
                            System.out.println();
                        } else {
                            System.out.print(a + " ");
                        }
                    }
                    count++;
                }
            }
        } else {
            System.out.println("Отсутствует");
        }
    }

    private static int CountLiteral(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

}
