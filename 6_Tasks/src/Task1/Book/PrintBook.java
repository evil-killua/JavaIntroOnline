package Task1.Book;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PrintBook {
    public void print() {
        int pageSize = 2;
        int page = 1;
        int lastPage = (int) Math.ceil(ArrayBook.books.size() / (double) pageSize);

        System.out.println("books.size: " + ArrayBook.books.size() + ", lastPage: " + lastPage);
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(page + "-я страница: ");
            ArrayBook.books.stream().skip((page - 1) * pageSize)
                    .limit(pageSize)
                    .forEach(s -> System.out.println(s));

            System.out.println("1 - следующая, 2 - предыдущая, 3 - выход");
            int choice = parseInt(in.nextLine());
            if (page == 1 && choice == 2) {
                System.out.println("Вы на первой странице, предыдущая отсутствует!");
                continue;
            } else if (page == lastPage && choice == 1) {
                System.out.println("Вы на последней странице, следующая отсутствует!");
                continue;
            }
            if (choice == 1)
                page++;
            else if (choice == 2)
                page--;
            else if (choice == 3)
                return;
        }
    }
}
