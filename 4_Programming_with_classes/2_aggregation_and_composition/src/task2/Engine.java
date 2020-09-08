package task2;

public class Engine {

     boolean performance;
     final String volume;

    public Engine(String volume) {
        this.volume = volume;
    }

    public boolean performance(boolean performance) {

        this.performance = performance;
        return this.performance;
    }

    public String getVolume() {
        return volume;
    }

}
