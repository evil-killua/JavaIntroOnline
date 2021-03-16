import task1.bean.Test1;
import task1.logic.Test1Logic;
import task1.view.Test1ViewInfo;
import task10.bean.Airline;
import task10.bean.Airline2;
import task10.logic.Task10Logic;
import task10.view.Task10View;
import task2.bean.Test2;
import task2.view.Test2ViewInfo;
import task3.bean.Group;
import task3.bean.Student;
import task3.logic.Task3Logic;
import task3.view.Task3View;
import task4.bean.Depo;
import task4.logic.Task4Logic;
import task4.bean.Train;
import task4.view.Task4View;
import task5.bean.Counter;
import task5.logic.Task5Logic;
import task5.view.Task5View;
import task6.bean.Time;
import task6.logic.Task6Logic;
import task6.view.Task6View;
import task7.bean.Triangle;
import task7.logic.Task7Logic;
import task7.view.Task7View;
import task8.bean.Customer;
import task8.bean.Customer2;
import task8.logic.Task8Logic;
import task8.view.Task8View;
import task9.bean.Book;
import task9.bean.Book2;
import task9.logic.Task9Logic;
import task9.view.Task9View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1
        /*
          Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
          методы изменения этих переменных. Добавьте метод, который находит сумму
          значений этих переменных, и метод, который находит наибольшее значение
          из этих двух переменных.
         */
        System.out.println("TASK1\n///////////////");

        Test1Logic logic;
        Test1ViewInfo info;

        Test1 test1 = new Test1(1, 2);

        logic = new Test1Logic();
        info = new Test1ViewInfo();

        info.displayInfo(test1);

        System.out.println("наибольшее число: " + logic.greatest(test1));
        test1.setA(5);
        test1.setB(6);

        info.displayInfo(test1);
        System.out.println("сумма: " + logic.Sum(test1));

        //2
        /*
          Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
          Добавьте конструктор, инициализирующий члены класса по умолчанию.
          Добавьте set- и get- методы для полей экземпляра класса.
         */
        System.out.println("\nTASK2\n///////////////");

        Test2ViewInfo info2;
        Test2 test2;

        test2 = new Test2();
        info2 = new Test2ViewInfo();

        info2.displayInfo(test2);


        test2 = new Test2(1, 2);
        info2.displayInfo(test2);

        test2.setA(2);
        test2.setB(3);
        info2.displayInfo(test2);

        //3
        /*
          Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
          номер группы, успеваемость (массив из пяти элементов).
          Создайте массив из десяти элементов такого типа.
          Добавьте возможность вывода фамилий и номеров групп студентов,
          имеющих оценки, равные только 9 или 10.
         */
        System.out.println("\nTASK3\n///////////////");

        Group group = new Group();
        Task3Logic task3Logic = new Task3Logic();
        Task3View task3View = new Task3View();
        List<Student> listStud = new ArrayList<Student>();

        Student[] students = new Student[10];
        group.addStudent(new Student("А", " А. А.", 1, new int[]{10, 9, 8, 7, 6}));
        group.addStudent(new Student("Б", " Б. Б.", 2, new int[]{10, 10, 10, 10, 10}));
        group.addStudent(new Student("В", " В. В.", 3, new int[]{9, 9, 9, 9, 9}));
        group.addStudent(new Student("Г", " Г. Г.", 2, new int[]{8, 8, 8, 8, 8}));
        group.addStudent(new Student("Д", " Д. Д..", 2, new int[]{7, 7, 7, 7, 7}));
        group.addStudent(new Student("Е", " Е. Е.", 4, new int[]{6, 6, 6, 6, 6}));
        group.addStudent(new Student("Ё", " Ё.Ё.", 2, new int[]{5, 5, 5, 5, 5}));
        group.addStudent(new Student("Ж", " Ж.Ж.", 3, new int[]{10, 10, 10, 10, 10}));
        group.addStudent(new Student("З", " З.З.", 1, new int[]{9, 9, 9, 9, 9}));
        group.addStudent(new Student("И", " И.И.", 2, new int[]{9, 10, 9, 10, 9}));


        listStud = task3Logic.sort_by_marks(group.getStudents());
        task3View.printInfo(listStud);


        //4
        /*
          Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
          Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
          массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
          пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
          одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
         */
        System.out.println("\nTASK4\n///////////////");

        Depo depo = new Depo();
        Task4Logic task4Logic = new Task4Logic();
        Task4View task4View = new Task4View();


        depo.addTrain(new Train("Grodno", 1, "11:00"));
        depo.addTrain(new Train("Grodno", 3, "12:00"));
        depo.addTrain(new Train("Brest", 5, "13:00"));
        depo.addTrain(new Train("Minsk", 2, "14:00"));
        depo.addTrain(new Train("Vitebsk", 4, "15:00"));

        List<Train> sorted;
        sorted = task4Logic.sort_by_number(depo.getTrains());
        task4View.print(sorted);

        sorted = task4Logic.sort_by_stopping(depo.getTrains());
        task4View.print(sorted);

        Train train;
        train = task4Logic.findByNumber(depo.getTrains(), 2);
        task4View.print(train);

        //5
        /*
          Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
          свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями
          по-умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
          и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все
          возможности класса.
         */
        System.out.println("\nTASK5\n///////////////");

        Counter counter;
        Task5Logic task5Logic = new Task5Logic();
        Task5View task5View = new Task5View();

        counter = new Counter();
        task5View.currentState(counter);

        counter = task5Logic.GetIncreased(counter);
        task5View.currentState(counter);

        counter = new Counter(10, 20, 14);
        task5View.currentState(counter);

        counter = task5Logic.GetReduced(counter);
        task5View.currentState(counter);


        //6
        /*
          Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
          изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
          В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
          времени на заданное количество часов, минут и секунд.
         */
        System.out.println("\nTASK6\n///////////////");

        Task6Logic task6Logic = new Task6Logic();
        Task6View task6View = new Task6View();

        Time time = new Time(10, 16, 12);

        task6View.printInfo(time);

        task6Logic.changeHour(time, 12);
        task6Logic.changeMin(time, 12);
        task6Logic.changeSec(time, 12);

        task6View.printInfo(time);

        //7
        /*
          Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
          вычисления площади, периметра и точки пересечения медиан.
         */
        System.out.println("\nTASK7\n///////////////");

        Triangle triangle;
        Task7Logic task7Logic = new Task7Logic();
        Task7View task7view = new Task7View();

        if (task7Logic.Check(3, 4, 5)) {
            triangle = new Triangle(3, 4, 5);
        } else {
            triangle = new Triangle();
        }

        int perm;
        double area;

        perm = task7Logic.perimeter(triangle);
        area = task7Logic.area(triangle);

        System.out.println("периметр: " + perm);
        System.out.println("площадь: " + area);

        //8
        /*
          Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
          set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа
          Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и
          вывести эти данные на консоль.
          Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
          Найти и вывести:
          a) список покупателей в алфавитном порядке;
          b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
         */
        System.out.println("\nTASK8\n///////////////");

        Customer2 customer2 = new Customer2();
        Task8Logic task8Logic = new Task8Logic();
        Task8View task8View = new Task8View();

        customer2.addCustomer(new Customer("A", "A", "A", "A", 1234, 5678));
        customer2.addCustomer(new Customer("B", "B", "B", "B", 4321, 8765));
        customer2.addCustomer(new Customer("C", "C", "C", "C", 2343, 5654));
        customer2.addCustomer(new Customer("D", "D", "D", "D", 4353, 7334));
        customer2.addCustomer(new Customer("E", "E", "E", "E", 3453, 3453));

        List<Customer> sorted2;
        sorted2 = task8Logic.sort_by_LastName(customer2.getCustomers());
        task8View.printInfo(sorted2);

        List<Customer> sorted3;
        sorted3 = task8Logic.BetweenNumbCreditCard(customer2.getCustomers(), 1000, 2000);
        task8View.printInfo(sorted3);


        //9
        /*
          Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
         set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book,
          с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные
          на консоль.
          Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
          Найти и вывести:
          a) список книг заданного автора;
          b) список книг, выпущенных заданным издательством;
          c) список книг, выпущенных после заданного года.
         */
        System.out.println("\nTASK9\n///////////////");

        Book2 book2 = new Book2();
        Task9Logic task9Logic = new Task9Logic();
        Task9View task9View = new Task9View();

        book2.addBook(new Book("A", "A", "A", 1900, 400, 1241, "твёрдый"));
        book2.addBook(new Book("B", "B", "D", 2000, 200, 533, "мягкий"));
        book2.addBook(new Book("C", "A", "C", 1950, 700, 5333, "твёрдый"));
        book2.addBook(new Book("D", "C", "D", 2020, 40, 120, "мягкий"));
        book2.addBook(new Book("E", "C", "B", 1949, 1000, 1500, "твёрдый"));

        List<Book> sort;
        sort = task9Logic.searchAuthor(book2.getBooks(), "A");
        task9View.printInfo(sort);

        List<Book> sort2;
        sort2 = task9Logic.searchPublishing(book2.getBooks(), "A");
        task9View.printInfo(sort2);

        List<Book> sort3;
        sort3 = task9Logic.searchYear(book2.getBooks(), 2000);
        task9View.printInfo(sort3);

        //10
        /*
          Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
          и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
          методами. Задать критерии выбора данных и вывести эти данные на консоль.
          Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
          Найти и вывести:
          a) список рейсов для заданного пункта назначения;
          b) список рейсов для заданного дня недели;
          c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
         */
        System.out.println("\nTASK10\n///////////////");

        Airline2 airline2 = new Airline2();
        Task10Logic task10Logic = new Task10Logic();
        Task10View task10View = new Task10View();

        airline2.addAirline(new Airline("A", 2, "Аэробус", "12:10", "понедельник"));
        airline2.addAirline(new Airline("B", 3, "Боинг", "13:30", "вторник"));
        airline2.addAirline(new Airline("C", 7, "Аэробус", "15:20", "среда"));
        airline2.addAirline(new Airline("A", 10, "Боинг", "14:50", "вторник"));
        airline2.addAirline(new Airline("С", 20, "Боинг", "20:00", "пятница"));

        List<Airline> airlines;
        airlines = task10Logic.day_search(airline2.getAirlines(), "вторник");
        task10View.printInfo(airlines);

        List<Airline> airlines2;
        airlines2 = task10Logic.destination_search(airline2.getAirlines(), "A");
        task10View.printInfo(airlines2);

        List<Airline> airlines3;
        airlines3 = task10Logic.day_time_search(airline2.getAirlines(), "понедельник", "12:00");
        task10View.printInfo(airlines3);

    }

    public static int enterToConsoleIntNumb(String message) {
        Scanner in = new Scanner(System.in);

        int numb;
        String str;

        System.out.println(">>" + message + ": ");
        while (!in.hasNextInt()) {
            str = in.nextLine();
            System.out.println(">>" + message + ": ");
        }
        numb = in.nextInt();

        return numb;
    }

}
