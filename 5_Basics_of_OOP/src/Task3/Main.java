package Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        /*
          Создать класс календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
          выходых и праздничных днях.
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y.M.d");
        CalendarView calendarView = new CalendarView();
        Calendar calendar = new Calendar();


        LocalDate day1 = LocalDate.parse("2020.01.01", formatter);
        LocalDate day2 = LocalDate.parse("2020.02.02", formatter);
        LocalDate day3 = LocalDate.parse("2020.03.03", formatter);
        LocalDate day4 = LocalDate.parse("2020.04.04", formatter);
        LocalDate day5 = LocalDate.parse("2020.5.5", formatter);
        LocalDate day6 = LocalDate.parse("2020.6.6", formatter);


        calendar.addDay(new Calendar.Day(day1, "выходной"), new Calendar.Day(day2, "праздник"));
        calendar.addDay(new Calendar.Day(day3, "рабочий"), new Calendar.Day(day4, "праздник"));
        calendar.addDay(new Calendar.Day(day5, "рабочий"), new Calendar.Day(day6, "выходной"));

        calendarView.printInfo(calendar.getDays());
    }

}
