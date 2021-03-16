package task10.bean;

import task10.bean.Airline;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airline2 {
    private List<Airline> airlines;

    {
        airlines = new ArrayList<Airline>();
    }

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    @Override
    public String toString() {
        return "Airline2{" +
                "airlines=" + airlines +
                '}';
    }
}
