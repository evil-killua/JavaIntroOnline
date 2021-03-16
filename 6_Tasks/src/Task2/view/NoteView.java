package Task2.view;

import Task2.bean.Note;

import java.util.List;

public class NoteView {
    public void printInfo(List<Note> notes) {
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }
}
