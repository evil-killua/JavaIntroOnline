package Task2.DAO;

import Task2.bean.Note;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NoteDAO {

    public final String path = "F:\\un\\Курсы\\6 этап\\src\\Task2\\Note\\note.txt";

    public List<Note> readNotes() {
        Note note;
        List<Note> notes = new ArrayList<>();
        String topic;
        LocalDate date;
        String mail;
        String message;


        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));

            String line = reader.readLine();
            while (line != null) {
                topic = line;
                date = LocalDate.parse(reader.readLine());
                mail = reader.readLine();
                message = reader.readLine();
                note = new Note(topic, date, mail, message);

                notes.add(note);

                line = reader.readLine();

                if (line.equals("///")) {
                    line = reader.readLine();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return notes;
    }

    public void writeNote(List<Note> notes) {

        BufferedWriter bufferWriter = null;
        try {
            bufferWriter = new BufferedWriter(new FileWriter(path));
            for (Note note : notes) {
                bufferWriter.write(note.getTopic() + "\n" + note.getDate() + "\n" + note.getMail()
                        + "\n" + note.getMessage() + "///");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
