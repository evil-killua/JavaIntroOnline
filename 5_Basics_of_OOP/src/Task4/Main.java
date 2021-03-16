package Task4;

import Task4.bean.Cave;
import Task4.bean.Treasure;
import Task4.logic.TreasureLogic;
import Task4.view.TreasureView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
          Создать консольное приложение. удовлетворяющее следующим требованиям:
          Приложение должно быть объектно, а не процедурно-ориентированным.
          Каждый класс должен иметь отражающее смысл название и информативный состав.
          Наследование должно применяться только тогда, когда это имеет смысл.
          При кодировании должны быть использованы соглашения об оформлении кода java code convention.
          Классы должны быть грамотно разложены по пакетам.
          Консольное меню должно быть минимальным
          Для хранения данных можно использовать файлы.

          Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
          Реализовать возомжность просмотра сокровищ, выбора самого дорогого по стоимости сокровища
          и выбора сокровищ на заданную сумму.
         */
        TreasureLogic treasureLogic = new TreasureLogic();
        TreasureView treasureView = new TreasureView();
        Cave cave = new Cave();

        Treasure treasure = null;
        List<Treasure> treasures = null;
        treasures = treasureLogic.getAllTreasure();

        cave.addTreasure(treasures);
        treasureView.printTreasureInfo(cave.getTreasures());

        cave.setTreasures(treasureLogic.sortByPrice(cave.getTreasures()));

        treasure = treasureLogic.mostExpensive(cave.getTreasures());
        treasureView.mostExpensive(treasure);

        int sum = 20;
        List<Treasure> treasureList = null;
        treasureList = treasureLogic.givenAmount(cave.getTreasures(), sum);
        treasureView.TreasureGivenAmount(treasureList);


    }
}
