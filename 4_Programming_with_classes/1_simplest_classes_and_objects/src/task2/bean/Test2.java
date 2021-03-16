package task2.bean;

public class Test2 {
    private int a;
    private int b;

    public Test2() {

    }

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "a=" + a +
                ", b=" + b ;
    }
}
