package task2;

public class Test2 {
    int a;
    int b;

    public Test2(){

    }

    public Test2(int a, int b){
        this.a=a;
        this.b=b;
    }

    void displayInfo() {
        System.out.printf("a: %s \tb: %d\n", a, b);
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
}
