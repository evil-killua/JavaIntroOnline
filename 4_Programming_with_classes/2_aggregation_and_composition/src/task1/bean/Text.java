package task1.bean;

import task1.bean.Sentence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Text {
    //    private String text = "";
    private String title;

    private List<Sentence> fullText;

    {
        fullText = new ArrayList<Sentence>();
    }

    public Text() {

    }

    public void addSentence(Sentence... sentence) {
        Collections.addAll(fullText, sentence);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Sentence> getFullText() {
        return fullText;
    }

    public void setFullText(List<Sentence> fullText) {
        this.fullText = fullText;
    }

    @Override
    public String toString() {
        return "fullText='" + fullText +
                ", title='" + title + '\'';
    }
}
