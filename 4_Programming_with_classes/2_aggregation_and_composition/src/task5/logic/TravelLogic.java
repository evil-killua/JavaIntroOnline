package task5.logic;

import task5.bean.TravelVoucher;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TravelLogic {
    Scanner in = new Scanner(System.in);

    public TravelVoucher selectionTravel(List<TravelVoucher> travelVouchers, int numbTravel) {
        for (TravelVoucher travelVoucher : travelVouchers) {
            if (travelVoucher.getNumbTravel() == numbTravel)
                return travelVoucher;
            else {
                continue;
            }
        }
        return null;
    }

    public List<TravelVoucher> sortTravel(List<TravelVoucher> travelVouchers) {
        travelVouchers.sort(Comparator.comparing(TravelVoucher::getDay));

        return travelVouchers;
    }

    public TravelVoucher travelChoice(List<TravelVoucher> travelVouchers) {
        String choice;
        boolean choiceFood = false;
        int choiceNumbDay = 0;
        TravelVoucher travelVoucher = null;

        System.out.println("какой тип путешествия: ");
        choice = in.nextLine();

        for (TravelVoucher traverVoucher : travelVouchers) {
            if (choice.equals(traverVoucher.getTypeTravel())) {
                travelVoucher = traverVoucher;
            }
        }

        System.out.println("какой тип транспорта: ");
        choice = in.nextLine();
        travelVoucher.setTypeTransport(choice);

        System.out.println("питание включено(true/false): ");
        choiceFood = in.nextBoolean();
        travelVoucher.setFood(choiceFood);

        System.out.println("сколько дней хотите отдыхать: ");
        choiceNumbDay = in.nextInt();
        travelVoucher.setDay(choiceNumbDay);

        return travelVoucher;
    }
}
