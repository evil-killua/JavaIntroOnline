package task1;

public class Text {
    String text = "";
    String title;

    public Text(Sentence... sentence) {
        for (Sentence sentence1 : sentence)
            text += sentence1;
    }

    public void title(String title) {
        this.title = title;
    }

    public void addSentence(Sentence sentence) {
        text += sentence;
    }

    public void print() {
        System.out.println(title + "\n");
        System.out.println(text);
    }


}
