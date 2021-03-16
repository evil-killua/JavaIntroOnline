package task5.bean;

import task5.bean.TravelVoucher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TravelChoice {

    private List<TravelVoucher> travels;

    {
        travels = new ArrayList<TravelVoucher>();
    }

    public TravelChoice() {

    }

    public void addTravel(TravelVoucher travelVoucher) {
        travels.add(travelVoucher);
    }

    public List<TravelVoucher> getTravels() {
        return travels;
    }

    public void setTravel(List<TravelVoucher> travels) {
        this.travels = travels;
    }

    @Override
    public String toString() {
        return "TravelChoice{" +
                "travels=" + travels +
                '}';
    }
}
