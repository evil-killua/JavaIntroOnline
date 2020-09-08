package task10;

import java.time.LocalTime;

public class Airline2 {

    Airline[] airlines = {
            new Airline("A", 2, "Аэробус", "12:10", "понедельник"),
            new Airline("B", 3, "Боинг", "13:30", "вторник"),
            new Airline("C", 7, "Аэробус", "15:20", "среда"),
            new Airline("A", 10, "Боинг", "14:50", "вторник"),
            new Airline("С", 20, "Боинг", "20:00", "пятница")
    };

    public void destination_search(String destination) {
        System.out.println("поиск по пункту названичения: " + destination);
        for (Airline airline : airlines) {
            if (airline.getDestination() == destination)
                System.out.println(airline);
        }
    }

    public void day_search(String day) {
        System.out.println("поиск по дню недели: " + day);
        for (Airline airline : airlines) {
            if (airline.getDays() == day)
                System.out.println(airline);
        }
    }

    public void day_time_search(String day, String time) {
        System.out.println("поиск по дню недели и времени: " + day + " , " + time);
        for (Airline airline : airlines) {
            if (airline.getDays() == day)
                if(airline.getTime().isAfter(LocalTime.parse(time)))
                System.out.println(airline);
        }
    }
}
