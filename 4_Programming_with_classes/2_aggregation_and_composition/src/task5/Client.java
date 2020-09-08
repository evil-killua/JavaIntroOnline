package task5;

import java.util.Scanner;

public class Client {

    Scanner in = new Scanner(System.in);
    TravelVoucher travelVoucher;
    boolean flag = false;

    public Client() {
        TravelChoice travelChoice = new TravelChoice();

        System.out.println("1 - список путёвок\n2 - Сортировка по цене\n3 - покупка путевки\n4 - Выход");

        while (!flag) {
            System.out.print("сделайте выбор: ");
           int choice=in.nextInt();
            switch (choice) {
                case 1:
                    travelChoice.listOfTravel();
                    break;
                case 2:
                    travelChoice.sortTravel();
                    break;
                case 3:
                    travelVoucher = travelChoice.selectionTravel();
                    break;
                case 4:
                    flag = true;
                    break;

            }

            if (choice > 4 || choice < 1)
                System.out.println("Некорректный ввод");

        }

    }


}
