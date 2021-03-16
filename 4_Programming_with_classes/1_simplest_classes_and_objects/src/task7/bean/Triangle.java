package task7.bean;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle() {

    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void setA(int a) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            this.a = a;
        } else {
            System.out.println("с такими сторонами треугольника не существует");
        }
    }

    public void setB(int b) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            this.b = b;
        } else {
            System.out.println("с такими сторонами треугольника не существует");
        }
    }

    public void setC(int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            this.c = c;
        } else {
            System.out.println("с такими сторонами треугольника не существует");
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
