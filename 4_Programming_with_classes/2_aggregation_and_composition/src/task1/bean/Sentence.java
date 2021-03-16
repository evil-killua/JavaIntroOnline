package task1.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sentence {
    //    private String sentence = "";
    private List<Word> sent;

    {
        sent = new ArrayList<Word>();
    }

    public Sentence() {

    }

    public void addWord(Word... word){
        Collections.addAll(sent, word);
    }

    public List<Word> getSent() {
        return sent;
    }

    public void setSent(List<Word> sent) {
        this.sent = sent;
    }

    //    public String toString() {
//        return sentence + ".";
//    }

    public String toString() {
        return sent + "";
    }
}
