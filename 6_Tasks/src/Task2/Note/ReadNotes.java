package Task2.Note;

import java.io.*;
import java.time.LocalDate;

public class ReadNotes {
    Note note;
    public static final String path = "F:\\un\\Курсы\\6 этап\\src\\Task2\\Note\\note.txt";

    String topic;
    LocalDate date;
    String mail;
    String message;

    public ReadNotes() throws IOException {
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        while (line != null) {
            topic=line;
            date=LocalDate.parse(reader.readLine());
            mail=reader.readLine();
            message=reader.readLine();
            note = new Note(topic,date,mail,message);
           /* note.setTopic(line);
            note.setDate(LocalDate.parse(reader.readLine()));
            note.setMail(reader.readLine());
            note.setMessage(reader.readLine());*/


            ArrayNote.notes.add(note);

            line = reader.readLine();

            if (line.equals("///")) {
                line = reader.readLine();
            }

        }

    }

}
