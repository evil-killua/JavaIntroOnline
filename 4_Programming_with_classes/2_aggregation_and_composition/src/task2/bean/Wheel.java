package task2.bean;

public class Wheel {
    private final int size = 20;

    private String model;
    //     private boolean rotating = false;
    private String location_wheel;

    public Wheel() {

    }

    public Wheel(String model, String location_wheel) {
        this.model = model;
        this.location_wheel = location_wheel;
    }

//    public void rotating(boolean rotating) {//вращающийся
//        this.rotating = rotating;
//    }

    public String getLocation_wheel() {
        return location_wheel;
    }

    public void setLocation_wheel(String location_wheel, String model) {
        this.location_wheel = location_wheel;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", model='" + model + '\'' +
                /* ", rotating=" + rotating +*/
                ", location_wheel='" + location_wheel + '\'' +
                '}';
    }
}
