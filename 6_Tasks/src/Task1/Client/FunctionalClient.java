package Task1.Client;

import Task1.Book.ArrayBook;
import Task1.Book.PrintBook;
import Task1.Book.SearchBook;
import java.io.IOException;
import java.util.Scanner;

public class FunctionalClient {
    public void menuFunctional() throws IOException {
        Scanner in = new Scanner(System.in);
        PrintBook printBook = new PrintBook();
        SearchBook searchBook = new SearchBook();
        for(;;) {
            System.out.println("1-вывести список книг\n2-поиск книг\n3-выйти");
            int numb = in.nextInt();
            switch (numb) {
                case 1:
                    System.out.println("список книг:\n");
                    printBook.print();
                    //ArrayBook.books.stream().forEach(x -> System.out.println(x + "\n"));
                    continue;
                case 2:
                    searchBook.searchBook();
                    continue;
                case 3:
                    break;
                default:
                    System.out.println("не корректный ввод!!!");
                    continue;
            }
            if(numb==3)break;
        }
    }
}
