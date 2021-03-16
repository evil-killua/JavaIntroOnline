package task10.bean;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Airline {

    private String destination;
    private int flight_number;
    private String type_of_aircraft;
    private LocalTime time;
    private String days;

    public Airline() {

    }

    public Airline(String destination, int flight_number, String type_of_aircraft, String time, String days) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.type_of_aircraft = type_of_aircraft;
        this.time = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
        this.days = days;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getDays() {
        return days;
    }

    public String getType_of_aircraft() {
        return type_of_aircraft;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setType_of_aircraft(String type_of_aircraft) {
        this.type_of_aircraft = type_of_aircraft;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flight_number=" + flight_number +
                ", type_of_aircraft='" + type_of_aircraft + '\'' +
                ", time=" + time +
                ", days='" + days + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flight_number == airline.flight_number &&
                destination.equals(airline.destination) &&
                type_of_aircraft.equals(airline.type_of_aircraft) &&
                time.equals(airline.time) &&
                days.equals(airline.days);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flight_number, type_of_aircraft, time, days);
    }
}
