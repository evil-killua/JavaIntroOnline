package task3;

import task3.bean.City;
import task3.bean.District;
import task3.bean.Region;
import task3.bean.State;
import task3.logic.StateLogic;
import task3.view.StateView;

public class Main {

    public static void main(String[] args) {
        /*
         Создать объект класса Государство, используя классы Область, Район, Город.
         Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
        */

        StateLogic stateLogic = new StateLogic();
        StateView stateView = new StateView();
        State state = new State("Беларусь");

        Region regionA = new Region("A", 1000);
        Region regionB = new Region("Б", 1001);
        Region regionC = new Region("В", 1002);

        District a1 = new District("a1",new City("Aaa", true, true),
                new City("Aab", false, false));

        District a2 = new District("a2",new City("ABa", false, true),
                new City("Aab", false, false));

        District a3 = new District("a3",new City("Baa", false, true),
                new City("Aab", false, false));

        regionA.addDistrict(a1);
        regionB.addDistrict(a2);
        regionC.addDistrict(a3);

        state.addRegion(regionA);
        state.addRegion(regionB);
        state.addRegion(regionC);


//        new Region().addDistrict(new District("Aa").addCity(new City())),
//        new Region(, new District("Бб", new City("Ббб"))),
//                new Region(, new District("Вв", new City("Ввв"))),
//                new Region("Г", 1003, new District("Гг", new City("Ггг"))),
//                new Region("Д", 1004, new District("Дд", new City("Ддд"))),
//                new Region("Е", 1005, new District("Ее", new City("Еее"))));

        stateView.printCapital(stateLogic.searchCapital(state.getRegions()));
        stateView.printNumberRegion(state.getRegions());
        stateView.printRegionalCenter(stateLogic.searchRegionalCenter(state.getRegions()));
        stateView.printStateArea(stateLogic.areaCalculation(state.getRegions()));

    }
}
