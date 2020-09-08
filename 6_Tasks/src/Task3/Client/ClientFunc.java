package Task3.Client;

import java.io.*;

public class ClientFunc {

    public ClientFunc(BufferedReader keyboard,DataOutputStream out,DataInputStream in) throws IOException {

        System.out.println("вы зашли как клиент.");
        for (; ; ) {
            System.out.println("1-добавить нового\n2-выйти");
            int choice = Integer.parseInt(keyboard.readLine());
            out.writeUTF(String.valueOf(choice));

            if (choice == 1) {
                System.out.print("введите firstName: ");
                String firstName=keyboard.readLine();
                out.writeUTF(firstName);

                System.out.print("введите lastName: ");
                String lastName=keyboard.readLine();
                out.writeUTF(lastName);

                System.out.print("введите city: ");
                String city=keyboard.readLine();
                out.writeUTF(city);

                System.out.print("введите course: ");
                int course= Integer.parseInt(keyboard.readLine());
                out.writeUTF(String.valueOf(course));

                System.out.print("формат даты: дд месяц гггг\nвведите birthday: ");
                String birthday= keyboard.readLine();
                out.writeUTF(birthday);

                String mes=in.readUTF();
                System.out.println(mes);

            } else if (choice == 2) break;
            else {
                System.out.println("не корректный ввод,повторите");
                continue;
            }

        }

    }
}
