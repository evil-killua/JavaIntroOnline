package Task5.Product;

public class Packaging implements ProductPackaging {

    String packagingType;
    int price;

    public Packaging(String packagingType,int price){
        this.packagingType=packagingType;
        this.price=price;
    }

    @Override
    public String getTypePackaging() {
        return packagingType;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String toString(){
        return packagingType;
    }
}
