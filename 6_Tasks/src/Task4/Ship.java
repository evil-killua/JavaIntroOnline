package Task4;

import java.util.Random;
import java.util.Scanner;

public class Ship {
    Scanner in = new Scanner(System.in);
    int amountOfCargo;

    public void ship(int numb) {
        int[] masForRandom = {0, 50};
        Random random = new Random();
        amountOfCargo = masForRandom[random.nextInt(2)];
    }

}
