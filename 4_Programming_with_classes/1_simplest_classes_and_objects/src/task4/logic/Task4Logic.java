package task4.logic;

import task4.bean.Train;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task4Logic {

    public List<Train> sort_by_number(List<Train> trains) {
        System.out.println();
        trains.sort(Comparator.comparing(Train::getNumb));
//        Arrays.sort(trains, Comparator.comparing(Train::getNumb));

        return trains;
    }

    public List<Train> sort_by_stopping(List<Train> trains) {
        trains.sort(Comparator.comparing(Train::getStopping));
//        Arrays.sort(trains, Comparator.comparing(Train::getStopping).thenComparing(Train::getDepartureTime));

        return trains;
    }

    public Train findByNumber(List<Train> trains, int number) {
        for (Train train : trains) {
            if (train.getNumb() == number) {
                return train;
            }
        }
        return null;
    }

}
