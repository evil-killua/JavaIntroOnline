package Task4.Treasure;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;


public class Treasure {
    int[] mas;

    public void read() throws IOException {

        ArrayList<Integer> list = new ArrayList<>();
        for(String x: Files.readAllLines(Paths.get("F:\\un\\Курсы\\5 этап\\src\\Task4\\treasure .txt"))){
            list.add(parseInt(x));
        }

        mas=new int[list.size()];


        for (int i = 0; i !=list.size() ; i++) {
            mas[i]=list.get(i);
        }

    }

}
