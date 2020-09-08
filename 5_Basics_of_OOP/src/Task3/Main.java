package Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        /*
          Создать класс календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
          выходых и праздничных днях.
         */
        Calendar calendar = new Calendar();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y.M.d");

        LocalDate day1 = LocalDate.parse("2020.01.01", formatter);
        LocalDate day2 = LocalDate.parse("2020.02.02", formatter);
        LocalDate day3 = LocalDate.parse("2020.03.03", formatter);
        LocalDate day4 = LocalDate.parse("2020.04.04", formatter);
        LocalDate day5 = LocalDate.parse("2020.5.5", formatter);

        Calendar.Day days1 = calendar.new Day(day1,"выходной");
        Calendar.Day days2 = calendar.new Day(day2,"праздник");
        Calendar.Day days3 = calendar.new Day(day3,"праздник");
        Calendar.Day days4 = calendar.new Day(day4,"праздник");
        Calendar.Day days5 = calendar.new Day(day5,"выходной");


        calendar.addDay(days1,days2,days3,days4,days5);
        calendar.printDay();
    }

}
