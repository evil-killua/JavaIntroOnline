package Task3.Server.Menu;

import Task3.Server.Login.ArrayLogin;
import Task3.Server.Login.Login;
import Task3.Server.StudentsInfo.ArrayStudentsInfo;
import Task3.Server.readWriteXML.ReadLoginXML;
import Task3.Server.readWriteXML.ReadStudentInfo;

import org.jdom.JDOMException;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Main {
    public static final int PORT = 6666;
    public static LinkedList<ServerSomthing> serverList = new LinkedList<ServerSomthing>();

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
                serverList.add(new ServerSomthing(socket)); // добавить новое соединенние в список
            }
        } finally {
            server.close();
        }

    }
}


class ServerSomthing extends Thread {

    private Socket socket;

    public ServerSomthing(Socket socket) throws IOException {
       this.socket=socket;

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

                try {
                    ReadLoginXML readLoginXML = new ReadLoginXML();
                } catch (JDOMException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                boolean flag = false;
                for (Login login : ArrayLogin.logins) {
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

                            try {
                                ReadStudentInfo readStudentInfo = new ReadStudentInfo();
                            } catch (JDOMException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            System.out.println(ArrayStudentsInfo.info.size());

                            if (login.getStatus().equals("client")) {

                                try {
                                    ClientFuncServer cfs = new ClientFuncServer(in, out);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            } else if (login.getStatus().equals("admin")) {

                            }
                            try {
                                AdminFuncServer adminFuncServer = new AdminFuncServer(out, in);
                            } catch (IOException e) {
                                e.printStackTrace();
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



