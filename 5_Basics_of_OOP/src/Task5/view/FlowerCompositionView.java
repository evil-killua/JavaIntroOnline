package Task5.view;

import Task5.bean.Flower.Flower;
import Task5.bean.FlowerComposition;

public class FlowerCompositionView {
    public void printInfo(FlowerComposition flowerComposition) {
        System.out.println("список цветов:");
        for (Flower flower : flowerComposition.getFlowers()) {
            System.out.println(flower.toString());
        }

        System.out.println("описание упаковки: ");
        System.out.println(flowerComposition.getPackaging().toString());
    }

}
