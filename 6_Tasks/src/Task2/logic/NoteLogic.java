package Task2.logic;

import Task2.DAO.NoteDAO;
import Task2.bean.Note;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteLogic {
    NoteDAO dao = new NoteDAO();

    public List<Note> readNote() {

        List<Note> notes = new ArrayList<>();

        notes.addAll(dao.readNotes());

        return notes;
    }

    public void writeNotes(List<Note> notes) {
        dao.writeNote(notes);
    }

    public Note addNote(String newTopic, String newMail, String newMessage) {

        Note note;

        if (!checkCorrectMail(newMail))
            return null;

        note = new Note(newTopic, LocalDate.now(), newMail, newMessage);

        return note;
    }

    private boolean checkCorrectMail(String newMail) {
        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher matcher = pattern.matcher(newMail);
        return matcher.matches();
    }


    public List<Note> searchGroupByTopicAndMain(List<Note> notes, String searchTopic, String searchMail) {
        List<Note> searchNotes = new ArrayList<>();
        Pattern p1 = Pattern.compile(searchTopic);
        Pattern p2 = Pattern.compile(searchMail);

        Matcher matcher1 = null;
        Matcher matcher2 = null;

        for (Note note : notes) {
            matcher1 = p1.matcher(note.getTopic());
            matcher2 = p2.matcher(note.getMail());

            if (matcher1.find() && matcher2.find()) {
                searchNotes.add(note);
            }
        }

        notes.sort(Comparator.comparing(Note::getTopic));

        return notes;
    }

    public List<Note> searchByOneParam(List<Note> notes, String searchParam, String search) {
        List<Note> searchNote = new ArrayList<>();

        Pattern pattern = Pattern.compile(search);
        Matcher matcher = null;
        for (Note note : notes) {
            if (searchParam.equals("topic")) matcher = pattern.matcher(note.getTopic());
            else if (searchParam.equals("date")) matcher = pattern.matcher(note.getDate().toString());
            else if (searchParam.equals("mail")) matcher = pattern.matcher(note.getMail());
            else if (searchParam.equals("message")) matcher = pattern.matcher(note.getMessage());

            if (matcher.find()) {
                searchNote.add(note);
            }
        }
        searchNote.sort(Comparator.comparing(Note::getTopic));

        return searchNote;
    }

}
