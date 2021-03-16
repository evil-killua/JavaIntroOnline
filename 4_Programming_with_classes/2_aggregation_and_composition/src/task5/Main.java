package task5;

import task5.bean.TravelChoice;
import task5.bean.TravelVoucher;
import task5.logic.TravelLogic;
import task5.view.TravelView;

public class Main {

    public static void main(String[] args) {
        /* Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
          различного типа(отдых,экскурсии,лечение,шопинг,круиз и т.д.) для оптимального выбора. Учитывать
          возможность выбора транспорта,питания и числа дней. Реализовать выбор и сортировку путевок.
         */
        TravelVoucher travelVoucher = null;
        TravelLogic travelLogic = new TravelLogic();
        TravelView travelView = new TravelView();
        TravelChoice travelChoice = new TravelChoice();


        travelChoice.addTravel(new TravelVoucher(1, "отдых"));
        travelChoice.addTravel(new TravelVoucher(2, "экскурсия"));
        travelChoice.addTravel(new TravelVoucher(3, "лечение"));
        travelChoice.addTravel(new TravelVoucher(4, "шопинг"));
        travelChoice.addTravel(new TravelVoucher(5, "круиз"));

        travelView.printAllTravel(travelChoice.getTravels());

        travelVoucher = travelLogic.travelChoice(travelChoice.getTravels());
        travelView.selected_type_of_travel(travelVoucher);

    }
}
