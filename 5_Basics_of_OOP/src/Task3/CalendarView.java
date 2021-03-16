package Task3;

import java.util.List;

public class CalendarView {
    public void printInfo(List<Calendar.Day> days) {
        for (Calendar.Day day : days) {
            System.out.println(day.toString());
        }
    }
}
