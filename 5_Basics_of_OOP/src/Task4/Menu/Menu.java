package Task4.Menu;

import Task4.Treasure.Actions;
import Task4.Treasure.Treasure;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public void start() throws IOException {
        Scanner in = new Scanner(System.in);

        Treasure treasure = new Treasure();
        treasure.read();
        Actions actions = new Actions();

        for (; ; ) {

            System.out.println("1-просмотр сокровища\n2-самое дорогое сокровище\n3-сокровище на заданную сумму\n" +
                    "0- выход.  ");
            int numb = in.nextInt();

            switch (numb) {
                case 0:
                    System.out.println("выход");
                    break;
                case 1:
                    actions.print(treasure);
                    break;
                case 2:
                    actions.mostExpensive(treasure);
                    break;
                case 3:
                    actions.givenAmount(treasure);
            }

            if (numb == 0) break;
        }

    }

}
