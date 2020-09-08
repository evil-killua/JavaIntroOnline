package task2;

public class Wheel {
    public static int numb = 0;
     final int wheelNumb;
     String model;

    private boolean rotating = false;

    public Wheel(String model) {
        this.model = model;
        wheelNumb = numb++;
    }

    public boolean rotating(boolean rotating) {
        this.rotating = rotating;
        return this.rotating;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return model + " " + wheelNumb;
    }
}
