package task4.bean;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Objects;

public class Train {

    private String stopping;
    private int numb;
    private LocalTime departureTime;

    public Train() {

    }

    public Train(String stopping, int numb, String time) {
        departureTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
        this.stopping = stopping;
        this.numb = numb;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return numb == train.numb &&
                stopping.equals(train.stopping) &&
                departureTime.equals(train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stopping, numb, departureTime);
    }

    @Override
    public String toString() {
        return "Train{" +
                "stopping='" + stopping + '\'' +
                ", numb=" + numb +
                ", departureTime=" + departureTime +
                '}';
    }

}





