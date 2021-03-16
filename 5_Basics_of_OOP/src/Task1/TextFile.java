package Task1;

import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
import java.util.List;

public class TextFile extends File {
    private String text;

    public TextFile() {

    }

    public TextFile(String title, String text) {
        super(title);
        this.text = text;
    }

    public TextFile(String text) {
        super("new File");
        this.text = text;
    }

    public void addText(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "title" + getTitle() + '\'' +
                "text='" + text +
                '}';
    }


}
