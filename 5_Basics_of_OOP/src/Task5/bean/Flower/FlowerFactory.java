package Task5.bean.Flower;

public class FlowerFactory {
    public Flower getFlower(FlowerTypes types) {
        Flower toReturn = null;
        switch (types) {
            case Tulip:
                toReturn = new TulipFlower();
                break;
            case Rose:
                toReturn = new RoseFlower();
                break;
            case Chamomile:
                toReturn = new ChamomileFlower();
                break;
            default:
                break;
//                throw new IllegalAccessException("Неправильный тип цветка: " + types);
        }
        return toReturn;
    }
}
