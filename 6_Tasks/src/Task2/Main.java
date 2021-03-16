package Task2;

import Task2.bean.Notebook;
import Task2.logic.NoteLogic;
import Task2.view.NoteView;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
          Блокнот. Разработать консольное приложение, работающее с Заметками
          в Блокноте. Каждая Заметка это: Заметка (тема, дата создания, е-таП, сообщение).
          В начале работы приложения данные должны считываться из файла, в конце
          работы - сохраняться в файл.
          У пользователя должна быть возможность найти запись по любому параметру
          или по группе параметров (группу параметров можно определить
          самостоятельно), получить требуемые записи в отсортированном виде, найти
          записи, текстовое поле которой содержит определенное слово, а также
          добавить новую запись.
          Особое условие: поиск, сравнение и валидацию вводимой информации
          осуществлять с использованием регулярных выражений.
          Особое условие: проверку введенной информации на валидность должен
          осуществлять код, непосредственно добавляющий информацию.
         */
//        ReadNotes readNotes = new ReadNotes();
//        Menu menu = new Menu();
//        menu.Menu();


        NoteLogic logic = new NoteLogic();
        NoteView view = new NoteView();
        Notebook notes = new Notebook();

        notes.addNotes(logic.readNote());

        view.printInfo(logic.searchByOneParam(notes.getNotes(), "topic", "покупка"));

        notes.addNote(logic.addNote("q", "q", "q"));
        view.printInfo(notes.getNotes());

        logic.writeNotes(notes.getNotes());

    }
}
