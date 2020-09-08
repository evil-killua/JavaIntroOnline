package task7;

public class Triangle {

    int a;
    int b;
    int c;


    public Triangle(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public boolean Check(){
        if ((a + b > c) && (a + c > b) && (b + c > a))
            return true;
        else return false;
    }

    public void setA(int a) {
        if ((a + b > c) && (a + c > b) && (b + c > a))
            this.a = a;
        else System.out.println("с такими сторонами треугольника не существует");
    }

    public void setB(int b) {
        if ((a + b > c) && (a + c > b) && (b + c > a))
            this.b = b;
        else System.out.println("с такими сторонами треугольника не существует");
    }

    public void setC(int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a))
            this.c = c;
        else System.out.println("с такими сторонами треугольника не существует");
    }

    public int Perimeter() {
        return this.a + this.b + this.c;
    }

    public double Area(/*int a, int b, int c*/) {
        return Math.sqrt((this.Perimeter() / 2) * ((this.Perimeter() / 2) - this.a) *((this.Perimeter() / 2) - this.b)
        *((this.Perimeter() / 2) - this.c));
    }


}
