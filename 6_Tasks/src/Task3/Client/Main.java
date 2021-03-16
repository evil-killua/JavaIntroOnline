package Task3.Client;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class Main {
    public static void main(String[] args) throws IOException {
        /*
          Создайте киент-серверное приложение "Архив" .
          В архиве хранятся дела. Архив находится на сервере.
          Клиент, в зависимости от прав, может запросить дело на просмотр, внести в
          него изменения, или создать новое дело.
         */
        int serverPort = 6666;
        String address = "127.0.0.1";

        try {
            InetAddress ipAddress = InetAddress.getByName(address);
            Socket socket = new Socket(ipAddress, serverPort);

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            AdminFunc adminFunc = new AdminFunc();
            ClientFunc clientFunc = new ClientFunc();

            int line = 0;
            String log = null;
            String pass = null;
            String status = null;

            while (true) {
                System.out.println("1-залогиниться\n2-выйти");
                line = Integer.parseInt(keyboard.readLine());

                out.writeUTF(String.valueOf(line));
                if (line == 1) {
                    System.out.print("введите логин: ");
                    log = keyboard.readLine();

                    out.writeUTF(log);
                    System.out.print("введите пароль: ");
                    pass = keyboard.readLine();

                    out.writeUTF(pass);

                    boolean checkLog = Boolean.parseBoolean(in.readUTF());

                    if (checkLog) {
                        status = in.readUTF();

                        if (status.equals("client")) {

                            clientFunc.addNewPerson(keyboard, out, in);
                        } else if (status.equals("admin")) {

                            adminFunc.addNewPerson(keyboard, out, in);
                            adminFunc.changePerson(keyboard, out, in);
                        }

                    } else System.out.println("error");
                } else if (line == 2) {
                    out.flush();

                    break;
                } else {
                    out.flush();

                    System.out.println("не корректный ввод");
                    continue;
                }
                out.flush();
            }
        } catch (Exception x) {
            x.printStackTrace();
        }

    }
}
