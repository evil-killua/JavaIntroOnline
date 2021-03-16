package task1;

import task1.bean.Sentence;
import task1.bean.Text;
import task1.bean.Word;
import task1.view.TextView;

public class Main {

    public static void main(String[] args) {
        /*
          Создать объект класса Текст, используя классы Предложение, Слово.
          Методы: дополнить текст, вывести на консоль текст, заголовок текста.
         */

        Text text = new Text();
        Sentence sentence1 = new Sentence();
        Sentence sentence2 = new Sentence();
        TextView textView = new TextView();


        sentence1.addWord(new Word("Из‑за"), new Word("пандемии"), new Word("коронавируса"), new Word("канадская"), new Word("цирковая"),
                new Word("компания"), new Word("Cirque"), new Word("du"), new Word("Soleil"), new Word("оказалась"), new Word("на"),
                new Word("грани"), new Word("банкротства."));


        sentence2.addWord(new Word("Как"), new Word("сообщается"), new Word("на"), new Word("ее"), new Word("сайте,"),
                new Word("руководство"), new Word("цирка"), new Word("подало"), new Word("заявление"),
                new Word("на"), new Word("защиту"), new Word("от"), new Word("банкротства."));


        text.addSentence(sentence1);
        text.setTitle("Cirque du Soleil");
        textView.printInfo(text);
        textView.printTitle(text);

        text.addSentence(sentence2);
        textView.printInfo(text);
        text.setTitle("1");
        textView.printTitle(text);


    }
}
