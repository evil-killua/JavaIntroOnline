package task5;

import java.util.HashMap;

public class TravelVoucher {

    static final int eatPrice = 5;
    String travel;
    String transport;
    int price;
    int day;
    boolean food = false;

    HashMap<String, Integer> typeTravels = new HashMap<String, Integer>();
    HashMap<String, Integer> typeTransports = new HashMap<String, Integer>();

    public TravelVoucher(String travel, String transport, int day, boolean food) {
        this.travel = travel;
        this.transport = transport;
        this.day = day;
        this.food = food;

        typeTravels.put("отдых", 100);
        typeTravels.put("экскурсия", 200);
        typeTravels.put("лечение", 1000);
        typeTravels.put("шопинг", 50);
        typeTravels.put("круиз", 500);

        typeTransports.put("автобус", 100);
        typeTransports.put("самолёт", 300);
        typeTransports.put("поезд", 50);
        typeTransports.put("корабль",200);

        if (food == true)
            price = eatPrice * day * (typeTransports.get(transport) + typeTravels.get(travel));
        else
            price = day * (typeTransports.get(transport) + typeTravels.get(travel));

    }

    public HashMap<String, Integer> getTypeTransports() {
        return typeTransports;
    }

    public HashMap<String, Integer> getTypeTravels() {
        return typeTravels;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDay() {
        return day;
    }

    public int getPrice() {
        return price;
    }

    public String getTransport() {
        return transport;
    }

    public String getTravel() {
        return travel;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setTravelType(String travel) {
        this.travel = travel;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setTypeTransports(HashMap<String, Integer> typeTransports) {
        this.typeTransports = typeTransports;
    }

    public void setTypeTravels(HashMap<String, Integer> typeTravels) {
        this.typeTravels = typeTravels;
    }

    public String toString() {
        if (food == true)
            return "путёвка: " + travel + "\nтранспорт: " + transport + "\nдней: " + day + "\nцена: " + price + "\nеда включена.\n";
        else
            return "путёвка: " + travel + "\nтранспорт: " + transport + "\nдней: " + day + "\nцена: " + price + "\nеда не включена.\n";
    }
}
