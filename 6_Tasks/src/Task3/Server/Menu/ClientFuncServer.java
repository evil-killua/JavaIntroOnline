package Task3.Server.Menu;

import Task3.Server.StudentsInfo.ArrayStudentsInfo;
import Task3.Server.StudentsInfo.StudentInfo;
import Task3.Server.readWriteXML.WriteStudentInfo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;


public class ClientFuncServer {
    public ClientFuncServer(DataInputStream in, DataOutputStream out) throws IOException {

        for (; ; ) {
            int choice = Integer.parseInt(in.readUTF());
            if (choice == 1) {
                String firstName = in.readUTF();
                String lastName = in.readUTF();
                String city = in.readUTF();
                int course = Integer.parseInt(in.readUTF());
                String birthday = in.readUTF();
                ArrayStudentsInfo.info.add(new StudentInfo(firstName, lastName, city, course, birthday));
                WriteStudentInfo wsi = new WriteStudentInfo();
                out.writeUTF("новое дело создано");

            } else if (choice == 2) break;

        }
    }
}
