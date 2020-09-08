package task4;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Train {

    String stopping;
    int numb;
    LocalTime departureTime ;


    public Train(String stopping, int numb, String time) {
        departureTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));

        this.stopping = stopping ;
        this.numb = numb;

    }

    public String toString() {
        return stopping + ", " + numb + ", " + departureTime;
    }

    public String getStopping() {
        return stopping;
    }

    public int getNumb() {
        return numb;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }


}





