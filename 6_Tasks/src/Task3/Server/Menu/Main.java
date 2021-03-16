package Task3.Server.Menu;

import Task3.Server.Login.ListLogin;
import Task3.Server.Login.Login;
import Task3.Server.Students.ListStudents;
import Task3.Server.readWriteXML.ReadLoginXML;
import Task3.Server.readWriteXML.ReadStudentInfo;
import org.jdom.JDOMException;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Main {
    public static final int PORT = 6666;
    public static LinkedList<ServerSomething> serverList = new LinkedList<ServerSomething>();

    public static void main(String[] args) throws IOException {
        /*
          Создайте киент-серверное приложение "Архив" .
          В архиве хранятся дела. Архив находится на сервере.
          Клиент, в зависимости от прав, может запросить дело на просмотр, внести в
          него изменения, или создать новое дело.
         */

        ServerSocket server = new ServerSocket(PORT);
        try {
            System.out.println("Waiting for a client...");
            while (true) {
                // Блокируется до возникновения нового соединения:
                Socket socket = server.accept();
                serverList.add(new ServerSomething(socket)); // добавить новое соединенние в список
            }
        } finally {
            server.close();
        }

    }
}


class ServerSomething extends Thread {

    private Socket socket;

    public ServerSomething(Socket socket) throws IOException {
        this.socket = socket;
        start();
    }

    @Override
    public void run() {
        InputStream sin = null;
        try {
            sin = socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream sout = null;
        try {
            sout = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataInputStream in = new DataInputStream(sin);
        DataOutputStream out = new DataOutputStream(sout);

        int line = 0;
        String log = null;
        String pass = null;

        ListLogin logins = new ListLogin();
        ListStudents students = new ListStudents();

        while (true) {
            System.out.println("1-залогиниться(добавить нового)\n2-выйти");
            try {
                line = Integer.parseInt(in.readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (line == 2) {

                try {
                    out.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            } else if (line == 1) {

                System.out.print("введите логин: ");

                try {
                    log = in.readUTF();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("введите пароль: ");

                try {
                    pass = in.readUTF();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                ReadLoginXML readLoginXML = new ReadLoginXML();
                logins.getLogins().addAll(readLoginXML.readLoginXML());

                ReadStudentInfo readStudentInfo = new ReadStudentInfo();

                ClientFuncServer clientFuncServer = new ClientFuncServer();
                AdminFuncServer adminFuncServer = new AdminFuncServer();

                boolean flag = false;
                for (Login login : logins.getLogins()) {
                    if (login.getName().equals(log)) {
                        if (login.getPassword().equals(pass)) {
                            flag = true;

                            try {
                                out.writeUTF(String.valueOf(true));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            System.out.println(login.getStatus());

                            try {
                                out.writeUTF(login.getStatus());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }


                            students.getStudents().addAll(readStudentInfo.readStudents());

                            System.out.println(students.getStudents().size());

                            if (login.getStatus().equals("client")) {

                                students.getStudents().add(clientFuncServer.addNewPerson(out, in));

                            } else if (login.getStatus().equals("admin")) {

                                students.getStudents().add(adminFuncServer.addNewPerson(out, in));
                                students.getStudents().clear();
                                students.getStudents().addAll(adminFuncServer.changePerson(students.getStudents(), out, in));

                            }

                        }
                    }
                }
                if (!flag) {
                    try {
                        out.writeUTF(String.valueOf(false));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    out.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("не корректный ввод");
                continue;
            }
        }
    }
}



