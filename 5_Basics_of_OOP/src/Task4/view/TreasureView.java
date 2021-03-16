package Task4.view;

import Task4.bean.Treasure;

import java.util.List;

public class TreasureView {
    public void printTreasureInfo(List<Treasure> treasures) {
        System.out.println("список всех сокровищ");
        for (Treasure treasure : treasures) {
            System.out.println(treasure.toString());
        }
    }

    public void mostExpensive(Treasure treasure) {
        System.out.println("самое дорого сокровище");
        System.out.println(treasure.toString());
    }

    public void TreasureGivenAmount(List<Treasure> treasures) {
        System.out.println("список сокровищ на данную сумму");
        for (Treasure treasure : treasures) {
            System.out.println(treasure.toString());
        }
    }
}
