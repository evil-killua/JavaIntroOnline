package Task4.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cave {
    List<Treasure> treasures;

    {
        treasures = new ArrayList<Treasure>();
    }

    public Cave() {

    }

    public Cave(Treasure... treasure) {
        Collections.addAll(treasures, treasure);
    }

    public void addTreasure(List<Treasure> treasure) {
        treasures.addAll(treasure);
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public String toString() {
        return "Cave{" +
                "treasures=" + treasures +
                '}';
    }
}
