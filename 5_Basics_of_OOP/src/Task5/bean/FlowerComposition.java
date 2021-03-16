package Task5.bean;

import Task5.bean.Flower.Flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerComposition {

    private List<Flower> flowers;
    private Packaging packaging;

    {
        flowers = new ArrayList<Flower>();
    }

    public FlowerComposition() {

    }

    public FlowerComposition(List<Flower> flowers, Packaging packaging) {
        this.flowers.addAll(flowers);
        this.packaging = packaging;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "flowers=" + flowers +
                ", packaging=" + packaging +
                '}';
    }


}
