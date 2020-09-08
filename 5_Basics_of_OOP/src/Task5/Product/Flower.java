package Task5.Product;

public class Flower implements Product {

    String flowerType;
    int price;

    public Flower(String flowerType,int price){
        this.flowerType=flowerType;
        this.price=price;
    }

    @Override
    public String getTypeFlower() {
        return flowerType;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String toString(){
        return flowerType;
    }

}
