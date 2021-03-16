package task7.logic;

import task7.bean.Triangle;

public class Task7Logic {

    public int perimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    public double area(Triangle triangle) {
        return Math.sqrt((perimeter(triangle) / 2) * ((perimeter(triangle) / 2) - triangle.getA()) *
                ((perimeter(triangle) / 2) - triangle.getB()) * ((perimeter(triangle) / 2) - triangle.getC()));
    }

    public boolean Check(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        } else {
            return false;
        }
    }
}
