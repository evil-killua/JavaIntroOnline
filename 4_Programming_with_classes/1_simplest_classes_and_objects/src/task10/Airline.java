package task10;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Airline {

    String destination;
    int flight_number;
    String type_of_aircraft;
    LocalTime time;
    String days;

    public Airline(String destination,int flight_number,String type_of_aircraft,String time,String days){
        this.destination=destination;
        this.flight_number=flight_number;
        this.type_of_aircraft=type_of_aircraft;
        this.time = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
        this.days=days;
    }

    public String toString(){
        return "пункт назначения " + destination + " номер рейса " + flight_number + " тип самолёта " + type_of_aircraft +
                " время вылета " + time + " дни недели " +days;
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


}
