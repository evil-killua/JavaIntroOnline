package task4.view;

import task4.bean.Train;

import java.util.List;

public class Task4View {

    public void print(List<Train> trains) {
        System.out.println(trains.toString());
    }

    public void print(Train train) {
        System.out.println(train.toString());
    }
}
