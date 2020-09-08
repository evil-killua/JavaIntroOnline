package Task1.Book;

import java.util.Scanner;

public class SearchBook {
    Scanner in = new Scanner(System.in);

    public void searchBook() {
        System.out.print("введите название книги: ");
        String nameBook = in.nextLine();
        boolean flag = false;
        for (int i = 0; i < ArrayBook.books.size(); i++) {
            if (nameBook.equals(ArrayBook.books.get(i).name)) {
                flag = true;
                System.out.println("такая книга есть");
                break;
            }
        }
        if (!flag) System.out.println("такой книги нет");
    }
}
