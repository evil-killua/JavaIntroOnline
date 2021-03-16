package Task1;

import Task1.logic.Authentication;
import Task1.logic.FunctionalAdmin;
import Task1.bean.Book.Book;
import Task1.logic.BookLogic;
import Task1.view.BookView;
import Task1.bean.Book.Library;
import Task1.logic.FunctionalClient;
import Task1.bean.User.ListUser;
import Task1.logic.UserLogic;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
          Система учитывает книги как в электронном, так и в бумажном варианте.
          Существующие роли: пользователь, администратор.
          Пользователь может просматривать книги в каталоге книг, осуществлять поиск
          книг в каталоге.
          Администратор может модифицировать каталог.
          При добавлении описания книги в каталог оповещение о ней рассылается на
          е-таil всем пользователям
          При просмотре каталога желательно реализовать постраничный просмотр
          Пользователь может предложить добавить книгу в библиотеку, переслав её
          администратору на е-mail.
          Каталог книг хранится в текстовом файле.
          Данные аутентификации пользователей хранятся в текстовом файле. Пароль
          не хранится в открытом виде
         */
        Authentication authentication = new Authentication();

        Library library = new Library();
        BookLogic bookLogic = new BookLogic();
        BookView bookView = new BookView();
        library.addBook(bookLogic.getBook());

        ListUser listUser = new ListUser();
        UserLogic userLogic = new UserLogic();
        listUser.addUser(userLogic.getUser());

        if (authentication.login("alex", "111", listUser.getUsers()).equals("admin")) {
            FunctionalAdmin admin = new FunctionalAdmin();
            admin.changeAuthorBook(library.getBooks(),"Роберт Мартин","A");
        } else if (authentication.login("alex", "111", listUser.getUsers()).equals("client")) {
            FunctionalClient client = new FunctionalClient();
            Book book;
            book=client.searchBook(library.getBooks(),"A");
            bookView.print(book);
        } else {
            System.out.println("нет такого пользователя");
        }


    }

}
