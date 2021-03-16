package Task4.logic;

import Task1.File;
import Task4.DAO.FileTreasureDAO;
import Task4.bean.Treasure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TreasureLogic {
    FileTreasureDAO fileTreasureDAO = new FileTreasureDAO();

    public List<Treasure> sortByPrice(List<Treasure> treasures) {
        treasures.sort(Comparator.comparing(Treasure::getPrice));

        return treasures;
    }

    public Treasure mostExpensive(List<Treasure> treasures) {
        Treasure mostExpensiveTreasure = null;

        mostExpensiveTreasure = treasures.get(0);
        for (Treasure treasure : treasures) {
            if (mostExpensiveTreasure.getPrice() < treasure.getPrice()) {
                mostExpensiveTreasure = treasure;
            }
        }

        return mostExpensiveTreasure;
    }

    public List<Treasure> getAllTreasure() {
        List<Treasure> treasures = null;

        try {
            treasures = fileTreasureDAO.getAllTreasure();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return treasures;
    }

    public List<Treasure> givenAmount(List<Treasure> treasures, int sum) {
        List<Treasure> treasureList = new ArrayList<Treasure>();
        int allSum = 0;

        for (Treasure treasure : treasures) {
            if (allSum + treasure.getPrice() <= sum) {
                allSum += treasure.getPrice();
                treasureList.add(treasure);
            }
        }


        return treasureList;
    }

}
