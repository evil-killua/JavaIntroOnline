package task4.bean;

import java.util.ArrayList;
import java.util.List;

public class Depo {
    private List<Train> trains;

    {
        trains = new ArrayList<Train>();
    }

    public Depo() {

    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    @Override
    public String toString() {
        return "trains=" + trains;
    }
}
