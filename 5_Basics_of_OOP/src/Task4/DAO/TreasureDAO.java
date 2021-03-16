package Task4.DAO;

import Task4.bean.Treasure;

import java.io.IOException;
import java.util.List;

public interface TreasureDAO {
    boolean addTreasure(Treasure treasure) throws TreasureException;

    List<Treasure> getAllTreasure() throws IOException;

    List<Treasure> delete(List<Treasure> treasures, Treasure treasure);
}
