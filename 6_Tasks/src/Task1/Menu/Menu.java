package Task1.Menu;

import Task1.Administrator.Admin;
import Task1.Client.Client;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void start() throws IOException {
        Admin admin = new Admin();
        Client user = new Client();
        for (; ; ) {
            System.out.println("1-зайти как админ\n2-зайти как пользователь\n3-выйти");
            Scanner in = new Scanner(System.in);
            int numb = in.nextInt();
            switch (numb) {
                case 1:
                    admin.login();
                    continue;
                case 2:
                    user.login();
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
