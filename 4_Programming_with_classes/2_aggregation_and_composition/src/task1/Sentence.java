package task1;

public class Sentence {
    String sentence = "";

    public Sentence(Word... word) {
        for (Word word1 : word)
            sentence += word1;
    }

    public String toString() {
        return sentence + ".";
    }
}
