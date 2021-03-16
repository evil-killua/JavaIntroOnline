package Task5;

import Task5.bean.Flower.Flower;
import Task5.bean.Flower.FlowerFactory;
import Task5.bean.Flower.FlowerTypes;
import Task5.bean.FlowerComposition;
import Task5.bean.Packaging;
import Task5.view.FlowerCompositionView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Создать консольное приложение, удовлетворяющее следующим требованиям:
         Корректно спроектируйте и реализуйте предметную область задачи.
         Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
         проектирования.
         Реализуйте проверку данных. вводимых пользователем. но не на стороне клиента.
         Для проверки корректности переданных данных можно применить регулярные выражения.
         *Меню выбора действия пользователем МОЖНО не реализовывать, ИСПОЛЬЗУЙТЭ ЗЗГЛУШКУ.
         *Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

         Вариант А. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
         (объект. представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
         и упаковка.

         Вариант В. Подарки. Реализовать приложение. позволяющее создавать подарки (объект, представляющий собой
         подарок). Составляющими целого подарка являются сладости и упаковка.
         */
        FlowerFactory factory = new FlowerFactory();
        FlowerComposition flowerComposition = new FlowerComposition();
        FlowerCompositionView view = new FlowerCompositionView();
        List<Flower> flowerList = new ArrayList<Flower>();

        Flower rose = factory.getFlower(FlowerTypes.Rose);
        rose.setSize(10);
        Flower tulip = factory.getFlower(FlowerTypes.Tulip);
        tulip.setSize(15);
        Flower chamomile = factory.getFlower(FlowerTypes.Chamomile);
        chamomile.setSize(13);
        Collections.addAll(flowerList, tulip, rose, chamomile);

        Packaging packaging = new Packaging("синий");

        flowerComposition.setFlowers(flowerList);
        flowerComposition.setPackaging(packaging);

        view.printInfo(flowerComposition);

    }
}
