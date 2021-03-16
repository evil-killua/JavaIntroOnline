package task5.bean;

public class Counter {

    private int min;
    private int max;
    private int value;

    public Counter() {
        min = 0;
        max = 10;
        value = 5;
    }

    public Counter(int min, int max, int value) {
        this.min = min;
        this.max = max;
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "min=" + min +
                ", max=" + max +
                ", value=" + value +
                '}';
    }
}
