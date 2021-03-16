package task1.bean;

public class Word {

    private String word = "";

    public Word() {

    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String toString() {
        return word + " ";
    }
}
