package Task5.CreateBouquet;

import Task5.Product.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateBouquet extends Assortment {


    Bouquet bouquet;
    ArrayList<Product> flowers;
    Packaging packaging ;


    public int addNumberFlowers() {
        System.out.println("сколько хотите этих цветков: ");
        int numbFlower = new Scanner(System.in).nextInt();//in.nextInt();
        if (numbFlower < 0) numbFlower = 1;
        return numbFlower;
    }

    public Flower /*addFlower*/choiceFlower() {
        System.out.println("имеются следующие цветы: ");
        for (Flower flower : getFlowers())
            System.out.println("цветок - " + flower + " и его цена - " + flower.getPrice());

        System.out.print("введите название цветка который хотите добавить: ");
        String nameFlower = new Scanner(System.in).nextLine();//in.nextLine();
        Flower flower = checkFlowers(nameFlower);
        if (flower == null)
            return null;

        int numberFlower = addNumberFlowers();

        for (int i = 0; i < numberFlower; i++) {
            flowers.add(flower);
        }
        return flower;
    }

    public Packaging /*typePackaging*/choicePackaging() {
        System.out.println("имеются следующие виды упаковки: ");
        for (Packaging packaging : getFlowerPackagings())
            System.out.println("тип упаковки: " + packaging + " и её цена: " + packaging.getPrice());

        System.out.print("введиете тип упаковки который вы хотите: ");
        String packagingName = new Scanner(System.in).nextLine();//in.nextLine();
        return checkPackaging(packagingName);
    }

    public void addFlower() {
        Flower flower = choiceFlower();
        while (flower == null) {
            flower = choiceFlower();
        }
    }

    public void addPackaging() {
        packaging = choicePackaging();
        while (packaging == null) {
            packaging = choicePackaging();
        }
    }

    public void create() {
        packaging=null;
        flowers = new ArrayList<>();
        bouquet = new Bouquet(flowers, packaging);

        for (; ; ) {
            System.out.println("1-добавить цветок\n2-добавить упаковку\n3-просмотр цветочной композиции\n0-выход");
            int numb = new Scanner(System.in).nextInt();//in.nextInt();
            if (numb >= 0 && numb <= 3) {
                switch (numb) {
                    case 1:////////
                        addFlower();
                        break;

                    case 2:
                        addPackaging();
                        break;

                    case 3:
                        System.out.println(bouquet);
                        break;

                }
                bouquet = new Bouquet(flowers, packaging);
                if (numb == 0) break;
            } else System.out.println("Некорректный ввод,введите ещё раз");
        }
    }

}
