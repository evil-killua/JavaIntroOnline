package task1;

public class Test1 {
    int a;
    int b;

    public Test1(int a, int b){
        this.a=a;
        this.b=b;
    }

    public void displayInfo() {
        System.out.printf("a: %s \tb: %d\n", a, b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void Sum() {
        System.out.println("sum= " + (a + b));
    }

    public int greatest() {
        return a > b ? a : b;
    }
}
