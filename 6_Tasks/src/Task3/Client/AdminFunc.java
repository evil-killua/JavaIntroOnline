package Task3.Client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class AdminFunc {

    public void addNewPerson(BufferedReader keyboard, DataOutputStream out, DataInputStream in) {
        String firstName = null;
        String lastName = null;
        String city = null;
        int course = 0;
        String birthday = null;
        String mes = null;
        try {
            System.out.print("введите firstName: ");

            firstName = keyboard.readLine();

            out.writeUTF(firstName);

            System.out.print("введите lastName: ");
            lastName = keyboard.readLine();
            out.writeUTF(lastName);

            System.out.print("введите city: ");
            city = keyboard.readLine();
            out.writeUTF(city);

            System.out.print("введите course: ");
            course = Integer.parseInt(keyboard.readLine());
            out.writeUTF(String.valueOf(course));

            System.out.print("формат даты: дд месяц гггг\nвведите birthday: ");
            birthday = keyboard.readLine();
            out.writeUTF(birthday);

            mes = in.readUTF();
            System.out.println(mes);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void changePerson(BufferedReader keyboard, DataOutputStream out, DataInputStream in) {
        int size = 0;
        int numb = 0;
        int numbChoice = 0;
        String word = null;
        String serverMessage = null;
        try {
            size = Integer.parseInt(in.readUTF());
            System.out.println("введите номер дела в котором хотите внести изменения\n" +
                    "всего дел: " + size);
            numb = Integer.parseInt(keyboard.readLine());
            out.writeUTF(String.valueOf(numb));

            System.out.println("1-firstName\n2-lastName\n3-city\n4-course\n5-birthday\nвеберете что изменить: ");
            numbChoice = Integer.parseInt(keyboard.readLine());
            out.writeUTF(String.valueOf(numbChoice));

            System.out.println("введиете на что изменить: ");
            word = keyboard.readLine();
            out.writeUTF(word);

            serverMessage = in.readUTF();
            System.out.println(serverMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    public AdminFunc(BufferedReader keyboard, DataOutputStream out, DataInputStream in) throws IOException {
//
//        System.out.println("вы зашли как админ");
//        for (; ; ) {
//            System.out.println("1-добавить нового\n2-изменить\n3-выйти");
//            int choice = Integer.parseInt(keyboard.readLine());
//            out.writeUTF(String.valueOf(choice));
//            if (choice == 1) {
//                System.out.print("введите firstName: ");
//                String firstName = keyboard.readLine();
//                out.writeUTF(firstName);
//
//                System.out.print("введите lastName: ");
//                String lastName = keyboard.readLine();
//                out.writeUTF(lastName);
//
//                System.out.print("введите city: ");
//                String city = keyboard.readLine();
//                out.writeUTF(city);
//
//                System.out.print("введите course: ");
//                int course = Integer.parseInt(keyboard.readLine());
//                out.writeUTF(String.valueOf(course));
//
//                System.out.print("формат даты: дд месяц гггг\nвведите birthday: ");
//                String birthday = keyboard.readLine();
//                out.writeUTF(birthday);
//
//                String mes = in.readUTF();
//                System.out.println(mes);
//
//            } else if (choice == 2) {
//                int size = Integer.parseInt(in.readUTF());
//
//                System.out.println("введите номер дела в котором хотите внести изменения\n" +
//                        "всего дел: " + size);
//                int numb = Integer.parseInt(keyboard.readLine());
//                out.writeUTF(String.valueOf(numb));
//
//                System.out.println("1-firstName\n2-lastName\n3-city\n4-course\n5-birthday\nвеберете что изменить: ");
//                int numbChoice = Integer.parseInt(keyboard.readLine());
//                out.writeUTF(String.valueOf(numbChoice));
//
//                System.out.println("введиете на что изменить: ");
//                String word = keyboard.readLine();
//                out.writeUTF(word);
//
//                String serverMessage = in.readUTF();
//                System.out.println(serverMessage);
//            } else if (choice == 3) break;
//            else {
//                System.out.println("не корректный ввод,повторите");
//                continue;
//            }
//
//
//        }
//    }
}
