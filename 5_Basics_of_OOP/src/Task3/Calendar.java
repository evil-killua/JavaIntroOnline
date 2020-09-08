package Task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Calendar {

    ArrayList<Day> days = new ArrayList<>();

    void addDay(Day... days){
        Collections.addAll(this.days,days);
    }

    void printDay(){
        for (Day day: days)
            System.out.println(day);
    }


     class Day{

        LocalDate day;
        String celebration;

        Day(LocalDate day,String celebration){
            this.day=day;
            this.celebration=celebration;
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

         public String toString(){
         return day.toString() + " - " + celebration;
         }

     }

}
