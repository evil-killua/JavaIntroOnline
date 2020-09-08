package Task3.Server.Menu;

import Task3.Server.StudentsInfo.ArrayStudentsInfo;
import Task3.Server.StudentsInfo.StudentInfo;
import Task3.Server.readWriteXML.WriteStudentInfo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class AdminFuncServer {
    public AdminFuncServer(DataOutputStream out, DataInputStream in) throws IOException {
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

            } else if (choice == 2) {

                int size = ArrayStudentsInfo.info.size();
                out.writeUTF(String.valueOf(size));
                int numbChoice = Integer.parseInt(in.readUTF());
                int numb = Integer.parseInt(in.readUTF());
                String word = in.readUTF();

                if (numbChoice == 1)
                    ArrayStudentsInfo.info.get(numb).setFirstName(word);
                else if (numbChoice == 2)
                    ArrayStudentsInfo.info.get(numb).setLastName(word);
                else if (numbChoice == 3)
                    ArrayStudentsInfo.info.get(numb).setCity(word);
                else if (numbChoice == 4)
                    ArrayStudentsInfo.info.get(numb).setCourse(Integer.parseInt(word));
                else if (numbChoice == 5)
                    ArrayStudentsInfo.info.get(numb).setBirthday(word);

                WriteStudentInfo wsi = new WriteStudentInfo();
                out.writeUTF("изменение внесено");

            } else if (choice == 3) break;
        }

        out.flush();
    }
}
