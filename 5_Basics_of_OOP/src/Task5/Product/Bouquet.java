package Task5.Product;

import Task5.CreateBouquet.Cost;

import java.util.ArrayList;

public class Bouquet extends Cost implements FinishedProduct {

    ArrayList<Product> flowers;
    Packaging packagingFlowers;

    public Bouquet(ArrayList<Product> flowers, Packaging packagingFlowers) {
        super(flowers, packagingFlowers);
        this.flowers = flowers;
        this.packagingFlowers = packagingFlowers;
    }

    @Override
    public String structureBouquet() {

        String structureBouquet = "";

        int countRose = 0;
        int countTulip = 0;
        int countIris = 0;
        int countCornflower = 0;
        int countDaisy = 0;

        for (Product flower : flowers) {
            switch (flower.getTypeFlower()) {
                case "роза":
                    countRose++;
                    break;
                case "тюльпан":
                    countTulip++;
                    break;
                case "ирис":
                    countIris++;
                    break;
                case "василёк":
                    countCornflower++;
                    break;
                case "ромашка":
                    countDaisy++;
                    break;
            }
        }

        if (countRose != 0) structureBouquet += "роз: " + countRose;

        if (countTulip != 0) structureBouquet += "тюльпанов: " + countTulip;

        if (countIris != 0) structureBouquet += "ириса: " + countIris;

        if (countCornflower != 0) structureBouquet += "васильков: " + countCornflower;

        if (countDaisy != 0) structureBouquet += "ромашек: " + countDaisy;

        return structureBouquet;
    }

    public String toString() {
        return " цветы: " + structureBouquet() + "; упаковка " + packagingFlowers + ";цена: " + getPrice();
    }

}
