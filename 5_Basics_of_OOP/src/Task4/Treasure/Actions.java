package Task4.Treasure;

import java.util.Scanner;

public class Actions {

    public void print(Treasure treasure) {

        for (int i = 0; i < treasure.mas.length; i++) {
            System.out.println(treasure.mas[i]);
        }

    }

    public void mostExpensive(Treasure treasure) {

        int max = treasure.mas[0];
        for (int i = 0; i < treasure.mas.length; i++) {
            if (max < treasure.mas[i]) max = treasure.mas[i];
        }

        System.out.println(max);
    }

    public void givenAmount(Treasure treasure) {
        int giveSum=0;
        System.out.print("введите сумму: ");
        Scanner in = new Scanner(System.in);
        giveSum=in.nextInt();

        int sum = 0;
        for (int i = 0; sum <= giveSum; i++) {
            if (giveSum - sum >= treasure.mas[i]) {
                sum += treasure.mas[i];
                System.out.println(treasure.mas[i]);
            } else break;
        }
        System.out.println("сумма: " + sum);
    }

}
