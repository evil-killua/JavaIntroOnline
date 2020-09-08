package task3;

public class Main {

    public static void main(String[] args) {
        /*
         Создать объект класса Государство, используя классы Область, Район, Город.
         Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
        */
        State state =
                new State("Беларусь",
                        new Region("A", 1000, new District("Aa", new City("Aaa",true))),
                new Region("Б", 1001, new District("Бб", new City("Ббб"))),
                new Region("В", 1002, new District("Вв", new City("Ввв"))),
                new Region("Г", 1003, new District("Гг", new City("Ггг"))),
                new Region("Д", 1004, new District("Дд", new City("Ддд"))),
                new Region("Е", 1005, new District("Ее", new City("Еее"))));

        state.printCapital();
        state.printNumberRegion();
        state.printStateArea();
        state.printRegionalCenter();

    }
}
