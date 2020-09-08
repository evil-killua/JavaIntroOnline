package Task2.Note.Search;

import Task2.Note.Note;

import java.util.*;

public class SearchGroup {


    public ArrayList<Note> searchGroup() {

        ArrayList<Note> notes;
        System.out.println("поиск производится по теме и дате.");
        notes=new RegexSearch("topic","date").getSearch();

        if (notes.size() == 0) {
            System.out.println("Не найдено");
            return null;
        }
        notes.sort(Comparator.comparing(Note::getTopic));
        return notes;

    }

}
