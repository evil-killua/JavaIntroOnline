package Task5.Product;

import java.util.ArrayList;

public class Assortment {
    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Packaging> flowerPackagings = new ArrayList<>();

    public Assortment() {
        flowers.add(new Flower("роза",1));
        flowers.add(new Flower("тюльпан",2));
        flowers.add(new Flower("ирис",3));
        flowers.add(new Flower("василёк",4));
        flowers.add(new Flower("ромашка",5));

        flowerPackagings.add(new Packaging("красная",1));
        flowerPackagings.add(new Packaging("синяя",2));
        flowerPackagings.add(new Packaging("жёлтая",3));
        flowerPackagings.add(new Packaging("белая",4));
        flowerPackagings.add(new Packaging("чёрная",5));
    }

    public Flower checkFlowers(String nameFlower) {
        for (Flower flower : flowers) {
            if (flower.getTypeFlower().equals(nameFlower))
                return flower;
        }
        System.out.println("такого цветка нет!!!");
        return null;
    }

    public Packaging checkPackaging(String namePackaging){
        for (Packaging packaging:flowerPackagings){
            if(packaging.packagingType.equals(namePackaging))
                return packaging;
        }
        System.out.println("такой упаковки нет!!!");
        return null;
    }


    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public ArrayList<Packaging> getFlowerPackagings() {
        return flowerPackagings;
    }

}
