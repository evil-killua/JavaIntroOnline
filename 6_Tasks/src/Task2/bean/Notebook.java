package Task2.bean;

import Task2.bean.Note;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notes;

    {
        notes = new ArrayList<>();
    }

    public Notebook() {

    }

    public Notebook(List<Note> noteList) {
        this.notes = noteList;
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public void addNotes(List<Note> noteList) {
        notes.addAll(noteList);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "notes=" + notes +
                '}';
    }
}
