package Task2.Note.Search;

import Task2.Note.Note;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SearchParameter {
Scanner in = new Scanner(System.in);

    public ArrayList<Note> searchParameter(){
        ArrayList<Note> notes;

        System.out.print("1-название\n2-дата\n3-почта\n4-сообщение\n5-выйти\nвыберете параметр по которому хотите искать:");

        int numb=in.nextInt();
        if(numb==1)notes=new RegexSearch("topic").getSearch();
        else if(numb==2){
            System.out.println("формат даты: гггг-мм-дд");
            notes= new RegexSearch("date").getSearch();
            //return new RegexSearch("date").getSearch();
        }
        else if(numb==3)notes=new RegexSearch("mail").getSearch();
        else if(numb==4)notes=new RegexSearch("message").getSearch();
        else if (numb == 5) return null;
        else {
            System.out.println("Некорректны ввод");
            return null;
        }

        if (notes.size() == 0) {
            System.out.println("Не найдено");
            return null;
        }
        notes.sort(Comparator.comparing(Note::getTopic));
        return notes;

    }

}
