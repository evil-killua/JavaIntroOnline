import task1.Test1;
import task10.Airline2;
import task2.Test2;
import task3.Student;
import task4.Train;
import task5.Counter;
import task6.Time;
import task7.Triangle;
import task8.Customer2;
import task9.Book2;

import java.util.Arrays;
import java.util.Comparator;
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
        Test1 test1 = new Test1(1, 2);
        test1.displayInfo();
        System.out.println("наибольшее " + test1.greatest());
        test1.setA(5);
        test1.setB(6);
        test1.displayInfo();
        test1.Sum();

        //2
        /*
          Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
          Добавьте конструктор, инициализирующий члены класса по умолчанию.
          Добавьте set- и get- методы для полей экземпляра класса.
         */
        Test2 test2 = new Test2();

        System.out.println(test2.getA());
        System.out.println(test2.getB());

        test2 = new Test2(1, 2);

        System.out.println(test2.getA());
        System.out.println(test2.getB());

        test2.setA(2);
        test2.setB(3);

        System.out.println(test2.getA());
        System.out.println(test2.getB());

        //3
        /*
          Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
          номер группы, успеваемость (массив из пяти элементов).
          Создайте массив из десяти элементов такого типа.
          Добавьте возможность вывода фамилий и номеров групп студентов,
          имеющих оценки, равные только 9 или 10.
         */
        Student[] students = new Student[10];
        students[0] = new Student("А А. А.", 1, new int[]{10, 9, 8, 7, 6});
        students[1] = new Student("Б Б. Б.", 2, new int[]{10, 10, 10, 10, 10});
        students[2] = new Student("В В. В.", 3, new int[]{9, 9, 9, 9, 9});
        students[3] = new Student("Г Г. Г.", 2, new int[]{8, 8, 8, 8, 8});
        students[4] = new Student("Д Д. Д..", 2, new int[]{7, 7, 7, 7, 7});
        students[5] = new Student("Е Е. Е.", 4, new int[]{6, 6, 6, 6, 6});
        students[6] = new Student("Ё Ё.Ё.", 2, new int[]{5, 5, 5, 5, 5});
        students[7] = new Student("Ж Ж.Ж.", 3, new int[]{10, 10, 10, 10, 10});
        students[8] = new Student("З З.З.", 1, new int[]{9, 9, 9, 9, 9});
        students[9] = new Student("И И.И.", 2, new int[]{9, 10, 9, 10, 9});

        sort(students);

        //4
        /*
          Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
          Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
          массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
          пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
          одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
         */
        Train[] train = {new Train("Grodno", 1, "11:00"),
                new Train("Grodno", 3, "12:00"),
                new Train("Brest", 5, "13:00"),
                new Train("Minsk", 2, "14:00"),
                new Train("Vitebsk", 4, "15:00")};

        Print_info(train, in);

        sort_by_number(train);

        sort_by_stopping(train);

        //5
        /*
          Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
          свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями
          по-умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
          и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все
          возможности класса.
         */
        Counter counter = new Counter();
        System.out.println(counter.GetValue());
        counter.GetReduced();
        System.out.println(counter.GetValue());
        counter.GetIncreased();
        System.out.println(counter.GetValue());

        //6
        /*
          Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
          изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
          В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
          времени на заданное количество часов, минут и секунд.
         */
        Time time = new Time(24, 61, 61);
        System.out.println(time.hour + ":" + time.minute + ":" + time.second);
        time.setHour(12);
        time.setMinute(33);
        time.setSecond(12);
        System.out.println(time.hour + ":" + time.minute + ":" + time.second);

        //7
        /*
          Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
          вычисления площади, периметра и точки пересечения медиан.
         */
        Triangle triangle;
        do {
            System.out.print("введиете a: ");
            int a = in.nextInt();
            System.out.print("введиете b: ");
            int b = in.nextInt();
            System.out.print("введиете c: ");
            int c = in.nextInt();
            triangle = new Triangle(a, b, c);
        } while (!triangle.Check());

        System.out.println(triangle.Perimeter());
        System.out.println(triangle.Area());

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
        Customer2 customer2 = new Customer2();
        customer2.Between_Numbers(4000, 6000);
        System.out.println();
        customer2.sort_by_LastName();

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
        Book2 book2 = new Book2();

        book2.searchAuthor("A");
        System.out.println();

        book2.searchPublishing("A");
        System.out.println();

        book2.searchYear(2000);

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
        Airline2 airline2 = new Airline2();

        airline2.day_search("вторник");
        System.out.println();

        airline2.destination_search("A");
        System.out.println();

        airline2.day_time_search("понедельник", "12:00");


    }

    public static void sort_by_number(Train[] trains) {
        System.out.println();
        Arrays.sort(trains, Comparator.comparing(Train::getNumb));
        for (Train a : trains) System.out.println(a);
        System.out.println();
    }

    public static void sort_by_stopping(Train[] trains) {
        Arrays.sort(trains, Comparator.comparing(Train::getStopping).thenComparing(Train::getDepartureTime));
        for (Train train : trains) System.out.println(train);
        System.out.println();
    }

    public static void Print_info(Train[] trains, Scanner in) {
        System.out.print("Имеются следующие поезда : ");
        for (Train train : trains) {
            System.out.print(train.getNumb() + ", ");
        }
        System.out.println();


        System.out.print("введиет номер поезда: ");
        int n = in.nextInt();

        for (Train train : trains) {
            if (train.getNumb() == n) {
                System.out.println(train.toString());

                break;
            }
        }
    }

    public static void sort(Student[] student) {

        for (Student ab : student) {
            int count = 0;
            for (int a : ab.getMarks()) {
                if (a == 9 || a == 10) {
                    count++;
                }
            }

            if (count == 5) {
                System.out.println("Name - " + ab.getName() + " Group - " + ab.getGroup_number());
            }
            count = 0;
        }
    }

}
