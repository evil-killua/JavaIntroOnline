package task10.logic;

import task10.bean.Airline;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Task10Logic {
    public List<Airline> destination_search(List<Airline> airlines, String destination) {
        List<Airline> airlines1 = new ArrayList<Airline>();

        for (Airline airline : airlines) {
            if (airline.getDestination().equals(destination)) {
                airlines1.add(airline);
            }
        }
        return airlines1;
    }

    public List<Airline> day_search(List<Airline> airlines, String day) {
        List<Airline> airlines1 = new ArrayList<Airline>();

        for (Airline airline : airlines) {
            if (airline.getDays().equals(day)) {
                airlines1.add(airline);
            }
        }
        return airlines1;
    }

    public List<Airline> day_time_search(List<Airline> airlines, String day, String time) {
        List<Airline> airlines1 = new ArrayList<Airline>();

        for (Airline airline : airlines) {
            if (airline.getDays().equals(day)) {
                if (airline.getTime().isAfter(LocalTime.parse(time))) {
                    airlines1.add(airline);
                }
            }
        }
        return airlines1;
    }
}
