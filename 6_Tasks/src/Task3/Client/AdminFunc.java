package Task3.Client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class AdminFunc {
    public AdminFunc(BufferedReader keyboard, DataOutputStream out, DataInputStream in) throws IOException {

        System.out.println("вы зашли как админ");
        for (; ; ) {
            System.out.println("1-добавить нового\n2-изменить\n3-выйти");
            int choice = Integer.parseInt(keyboard.readLine());
            out.writeUTF(String.valueOf(choice));
            if (choice == 1) {
                System.out.print("введите firstName: ");
                String firstName = keyboard.readLine();
                out.writeUTF(firstName);

                System.out.print("введите lastName: ");
                String lastName = keyboard.readLine();
                out.writeUTF(lastName);

                System.out.print("введите city: ");
                String city = keyboard.readLine();
                out.writeUTF(city);

                System.out.print("введите course: ");
                int course = Integer.parseInt(keyboard.readLine());
                out.writeUTF(String.valueOf(course));

                System.out.print("формат даты: дд месяц гггг\nвведите birthday: ");
                String birthday = keyboard.readLine();
                out.writeUTF(birthday);

                String mes = in.readUTF();
                System.out.println(mes);

            } else if (choice == 2) {
                int size = Integer.parseInt(in.readUTF());

                System.out.println("введите номер дела в котором хотите внести изменения\n" +
                        "всего дел: " + size);
                int numb = Integer.parseInt(keyboard.readLine());
                out.writeUTF(String.valueOf(numb));

                System.out.println("1-firstName\n2-lastName\n3-city\n4-course\n5-birthday\nвеберете что изменить: ");
                int numbChoice = Integer.parseInt(keyboard.readLine());
                out.writeUTF(String.valueOf(numbChoice));

                System.out.println("введиете на что изменить: ");
                String word = keyboard.readLine();
                out.writeUTF(word);

                String serverMessage = in.readUTF();
                System.out.println(serverMessage);
            } else if (choice == 3) break;
            else {
                System.out.println("не корректный ввод,повторите");
                continue;
            }


        }
    }
}
