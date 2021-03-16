package task5.logic;

import task5.bean.Counter;

public class Task5Logic {
    public Counter GetIncreased(Counter counter) {
        if (counter.getValue() > counter.getMax()) {
            System.out.println("значение превысило диапазон");
        } else {
            counter.setValue(counter.getValue() + 1);
        }
        return counter;
    }

    public Counter GetReduced(Counter counter) {
        if (counter.getValue() < counter.getMin()) {
            System.out.println("значение вышло из диапазон");
        } else {
            counter.setValue(counter.getValue() - 1);
        }
        return counter;
    }
}
