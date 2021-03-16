package Task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calendar {

    private List<Day> days;

    {
        days = new ArrayList<Day>();
    }

    public Calendar() {

    }

    public void addDay(Day... days) {
        Collections.addAll(this.days, days);
    }

    public void removeDay(Day day) {
        days.remove(day);
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "days=" + days +
                '}';
    }

    public static class Day {

        private LocalDate day;
        private String celebration;

        public Day() {

        }

        Day(LocalDate day, String celebration) {
            this.day = day;
            this.celebration = celebration;
        }

        public LocalDate getDay() {
            return day;
        }

        public void setDay(LocalDate day) {
            this.day = day;
        }

        public String getCelebration() {
            return celebration;
        }

        public void setCelebration(String celebration) {
            this.celebration = celebration;
        }

        public String toString() {
            return day.toString() + " - " + celebration;
        }

    }

}
