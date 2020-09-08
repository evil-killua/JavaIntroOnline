package Task2.Note;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.lineSeparator;

public class AddNote {
    Scanner in = new Scanner(System.in);
    Note note;

    public AddNote() throws Exception {
        System.out.print("введите тему: ");
        String newTopic=in.nextLine();
        System.out.print("введите email: ");
        String newMail=in.nextLine();
        if(!checkCorrectMail(newMail))throw new Exception("Некорректный mail");
        System.out.print("введите сообщение: ");
        String newMessage=in.nextLine();

        note=new Note(newTopic, LocalDate.now(),newMail,newMessage);
        ArrayNote.notes.add(note);

        String newNote=lineSeparator() + newTopic + lineSeparator() +LocalDate.now() + lineSeparator() + newMail +
                lineSeparator() + newMessage + lineSeparator() + "///" + lineSeparator();

        writeNewNote(newNote);
    }

    public void writeNewNote(String newNote) throws IOException {
        FileWriter writer = new FileWriter(ReadNotes.path, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(newNote);
        bufferWriter.close();
    }

    public boolean checkCorrectMail(String newMail){
        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher matcher=pattern.matcher(newMail);
        return matcher.matches();
    }

}
