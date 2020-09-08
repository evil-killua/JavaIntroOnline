package Task5.Main;

import Task5.CreateBouquet.CreateBouquet;

import java.util.Scanner;

public class Menu {

    public void start() {
        Scanner in = new Scanner(System.in);
        CreateBouquet createBouquet= new CreateBouquet();
        for (; ; ) {
            System.out.println("1-создать цветочную композицию\n0-выйти");
            int numb = in.nextInt();
            switch (numb) {
                case 1:
                    createBouquet.create();
                    break;
            }

            if(numb==0)break;

        }
    }

}
