package Task4.DAO;

import Task4.bean.Treasure;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileTreasureDAO implements TreasureDAO {

    public FileTreasureDAO() {

    }

    private static final String SOURSE = "F:\\un\\Курсы\\IntroductionToJava\\5_Basics_of_OOP\\src\\Task4\\treasure.txt";

    @Override
    public boolean addTreasure(Treasure treasure) throws TreasureException {

        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter(SOURSE, true));

            bf.write(treasure.getName() + "\t" + treasure.getPrice());
        } catch (IOException e) {
            throw new TreasureException(e);
        } finally {
            if (bf != null) {
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return true;
    }

    @Override
    public List<Treasure> getAllTreasure() throws IOException {

        List<Treasure> treasures = new ArrayList<Treasure>();

        List<String> strings = new ArrayList<>();
        for (String x : Files.readAllLines(Paths.get(SOURSE))) {
            strings.add(x);
        }

        for (int i = 0; i < strings.size(); i++) {
            String[] input = strings.get(i).split(" ");
            treasures.add(new Treasure(input[0], Integer.parseInt(input[1])));
        }

        return treasures;
    }

    @Override
    public List<Treasure> delete(List<Treasure> treasures, Treasure treasure) {

        for (Treasure treasure1 : treasures) {
            if (treasure1.equals(treasure)) {
                treasures.remove(treasure1);
            }
        }

        return treasures;
    }
}
