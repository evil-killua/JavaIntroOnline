package task5;

public class Counter {

    int min;
    int max;
    int value;

    public Counter() {
        min = 0;
        max = 10;
        value = 5;
    }

    public Counter(int min, int max, int value) {
        if ((max < min) || (value > max || value < min)) System.out.println("ошибка в диапазоне");
        this.max = max;
        this.min = min;
        this.value = value;
    }

    public void GetIncreased() {
        value++;
        if (value > max) System.out.println("значение превысило диапазон");
    }

    public void GetReduced() {
        value--;
        if (value < min) System.out.println("значение превысило диапазон");
    }

    public int GetValue(){
        return value;
    }

}
