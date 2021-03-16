package task5.bean;

import java.util.Objects;

public class TravelVoucher {

    private int numbTravel;
    private String typeTravel;
    private String typeTransport;
    private int day;
    private boolean food = false;

    public TravelVoucher() {

    }

    public TravelVoucher(int numbTravel, String typeTravel) {
        this.numbTravel = numbTravel;
        this.typeTravel = typeTravel;
    }

    public TravelVoucher(int numbTravel, String typeTravel, String typeTransport, int day, boolean food) {
        this.numbTravel = numbTravel;
        this.typeTravel = typeTravel;
        this.typeTransport = typeTransport;
        this.day = day;
        this.food = food;
    }

    public int getNumbTravel() {
        return numbTravel;
    }

    public void setNumbTravel(int numbTravel) {
        this.numbTravel = numbTravel;
    }

    public String getTypeTravel() {
        return typeTravel;
    }

    public void setTypeTravel(String typeTravel) {
        this.typeTravel = typeTravel;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public int getDay() {
        return day;
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

    @Override
    public String toString() {
        return "TravelVoucher{" +
                "numbTravel=" + numbTravel +
                ", typeTravel='" + typeTravel + '\'' +
                ", typeTransport='" + typeTransport + '\'' +
                ", day=" + day +
                ", food=" + food +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelVoucher that = (TravelVoucher) o;
        return numbTravel == that.numbTravel &&
                day == that.day &&
                food == that.food &&
                typeTravel.equals(that.typeTravel) &&
                typeTransport.equals(that.typeTransport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbTravel, typeTravel, typeTransport, day, food);
    }
}
