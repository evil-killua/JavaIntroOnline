package Task2.Menu;

import Task2.Note.AddNote;
import Task2.Note.ArrayNote;
import Task2.Note.Note;
import Task2.Note.Search.SearchGroup;
import Task2.Note.Search.SearchParameter;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);


    public void Menu() throws Exception {
        SearchParameter searchParameter = new SearchParameter();
        SearchGroup searchGroup = new SearchGroup();
        for (; ; ) {
            System.out.println("1-Показать записи\n2-найти запись по параметру\n3-найти запись по группе параметров\n" +
                    "4-добавить новую запись\n0-выйти");
            int numb = in.nextInt();

            switch (numb) {
                case 1:
                    for (Note note : ArrayNote.notes) {
                        System.out.println(note + "\n");
                    }
                    break;
                case 2:
                    ArrayList<Note> resultSearch = searchParameter.searchParameter();
                    resultSearch.stream().forEach(x -> System.out.println(x));
                    break;

                case 3:
                    ArrayList<Note> resultGroupSearch = searchGroup.searchGroup();
                    resultGroupSearch.stream().forEach(x -> System.out.println(x));

                    break;
                case 4:
                    AddNote addNote = new AddNote();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("не корректный ввод!!!");
                    continue;
            }
            if (numb == 0) break;

        }
    }
}
