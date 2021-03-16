package task1.view;

import task1.bean.Text;

public class TextView {
    public void printInfo(Text text) {
        System.out.println(text.getFullText());
    }

    public void printTitle(Text text) {
        System.out.println("заголовок текста: " + text.getTitle());
    }
}
