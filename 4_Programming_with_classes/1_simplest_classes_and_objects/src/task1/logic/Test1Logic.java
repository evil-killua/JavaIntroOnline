package task1.logic;

import task1.bean.Test1;

public class Test1Logic {
    public int Sum(Test1 test1) {
        return test1.getA() + test1.getB();
    }

    public int greatest(Test1 test1) {
        return Math.max(test1.getA(), test1.getB());
    }
}
