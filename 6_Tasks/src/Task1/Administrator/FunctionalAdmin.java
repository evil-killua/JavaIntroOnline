package Task1.Administrator;

import Task1.Book.AddBook;
import Task1.Book.ArrayBook;
import Task1.Book.PrintBook;

import static java.lang.Integer.parseInt;

import java.io.IOException;
import java.util.Scanner;

public class FunctionalAdmin {
    public void menuFunctional() throws IOException {
        Scanner in = new Scanner(System.in);
        PrintBook printBook = new PrintBook();
        for (; ; ) {
            System.out.println("1-вывести список книг\n2-добавить книгу\n3-выйти");
            int numb = in.nextInt();
            switch (numb) {
                case 1:
                    System.out.println("список книг:\n");
                    printBook.print();
                    // ArrayBook.books.stream().forEach(x -> System.out.println(x + "\n"));
                    continue;
                case 2:
                    AddBook addBook = new AddBook();
                    continue;
                case 3:
                    break;
                default:
                    System.out.println("не корректный ввод!!!");
                    continue;
            }
            if (numb == 3) break;
        }
    }



}
