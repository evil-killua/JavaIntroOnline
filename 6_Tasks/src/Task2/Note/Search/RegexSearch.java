package Task2.Note.Search;

import Task2.Note.ArrayNote;
import Task2.Note.Note;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSearch {

    private ArrayList<Note> search = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public RegexSearch(String param) {
        System.out.print("введите по чём искать: ");
        String search = in.nextLine();
        Pattern pattern = Pattern.compile(search);
        regSearch(param, pattern);
    }

    public RegexSearch(String parameter1, String parameter2) {
        System.out.print("введите тему: ");
        String searchTopic = in.nextLine();
        System.out.print("формат даты: гггг-мм-дд\nвведите дату: ");
        String searchDate = in.nextLine();
        Pattern pattern = Pattern.compile(searchTopic);
        regSearchGroup(parameter1, parameter2, pattern, searchDate);
    }

    private void regSearchGroup(String parameter1, String parameter2, Pattern pattern, String searchDate) {
        Matcher matcher = null;

        for (Note notes : ArrayNote.notes) {
            matcher = pattern.matcher(notes.getTopic());

            if (matcher.find()) {
                if (searchDate.equals(notes.getDate().toString()))
                    search.add(notes);
            }

        }

    }

    private void regSearch(String param, Pattern pattern) {
        Matcher matcher = null;

        for (Note notes : ArrayNote.notes) {
            if (param.equals("topic")) matcher = pattern.matcher(notes.getTopic());
            else if (param.equals("date")) matcher = pattern.matcher(notes.getDate().toString());
            else if (param.equals("mail")) matcher = pattern.matcher(notes.getMail());
            else if (param.equals("message")) matcher = pattern.matcher(notes.getMessage());

            if (matcher.find())
                search.add(notes);

        }

    }

    public ArrayList<Note> getSearch() {
        return search;
    }

}
