package Task3.Client;

import java.io.*;

public class ClientFunc {

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

//    public ClientFunc(BufferedReader keyboard,DataOutputStream out,DataInputStream in) throws IOException {
//
//        System.out.println("вы зашли как клиент.");
//        for (; ; ) {
//            System.out.println("1-добавить нового\n2-выйти");
//            int choice = Integer.parseInt(keyboard.readLine());
//            out.writeUTF(String.valueOf(choice));
//
//            if (choice == 1) {
//                System.out.print("введите firstName: ");
//                String firstName=keyboard.readLine();
//                out.writeUTF(firstName);
//
//                System.out.print("введите lastName: ");
//                String lastName=keyboard.readLine();
//                out.writeUTF(lastName);
//
//                System.out.print("введите city: ");
//                String city=keyboard.readLine();
//                out.writeUTF(city);
//
//                System.out.print("введите course: ");
//                int course= Integer.parseInt(keyboard.readLine());
//                out.writeUTF(String.valueOf(course));
//
//                System.out.print("формат даты: дд месяц гггг\nвведите birthday: ");
//                String birthday= keyboard.readLine();
//                out.writeUTF(birthday);
//
//                String mes=in.readUTF();
//                System.out.println(mes);
//
//            } else if (choice == 2){
//                break;
//            } else {
//                System.out.println("не корректный ввод,повторите");
//                continue;
//            }
//
//        }
//
//    }
}
