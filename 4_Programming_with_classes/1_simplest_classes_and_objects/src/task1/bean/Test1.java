package task1.bean;

public class Test1 {
    private int a;
    private int b;

    public Test1() {

    }

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b;
    }
}
