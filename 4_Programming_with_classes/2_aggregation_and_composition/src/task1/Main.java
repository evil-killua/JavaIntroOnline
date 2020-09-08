package task1;

public class Main {

    public static void main(String[] args) {
        /*
          Создать объект класса Текст, используя классы Предложение, Слово.
          Методы: дополнить текст, вывести на консоль текст, заголовок текста.
         */

        Sentence sentence1 = new Sentence(new Word("Из‑за"), new Word("пандемии"), new Word("коронавируса"), new Word("канадская"), new Word("цирковая"),
                new Word("компания"), new Word("Cirque"), new Word("du"), new Word("Soleil"), new Word("оказалась"), new Word("на"),
                new Word("грани"), new Word("банкротства"));
        Sentence sentence2 = new Sentence(new Word("Как"), new Word("сообщается"), new Word("на"), new Word("ее"), new Word("сайте,"),
                new Word("руководство"), new Word("цирка"), new Word("подало"), new Word("заявление"),
                new Word("на"), new Word("защиту"), new Word("от"), new Word("банкротства"));

        Text text = new Text(sentence1);

        text.title("Cirque du Soleil");
        text.addSentence(sentence2);

        text.print();
    }
}
