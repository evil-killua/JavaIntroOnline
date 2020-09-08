package task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TravelChoice {

    Scanner in = new Scanner(System.in);
    ArrayList<TravelVoucher> travel = new ArrayList<TravelVoucher>();

    public TravelChoice() {
        travel.add(new TravelVoucher("отдых", "поезд", 2, true));
        travel.add(new TravelVoucher("экскурсия", "автобус", 1, false));
        travel.add(new TravelVoucher("лечение", "самолёт", 10, true));
        travel.add(new TravelVoucher("шопинг", "автобус", 1, false));
        travel.add(new TravelVoucher("круиз", "корабль", 2, true));
    }

    public void listOfTravel() {
        System.out.println("список путёвок:");
        System.out.println(travel);
    }

    public TravelVoucher selectionTravel() {
        listOfTravel();

        System.out.print("введите номер путёвки: ");
        int numb = in.nextInt();

        if (numb >= 0 && numb <= travel.size())
            return travel.get(numb);
        else
            System.out.println("такого номера нет!");

        return null;
    }

    public void sortTravel() {

        travel.sort(Comparator.comparing(TravelVoucher::getPrice));

        System.out.println("путёвки отсортированы");
        for (TravelVoucher travelVoucher : travel)
            System.out.println(travelVoucher);
    }

}
