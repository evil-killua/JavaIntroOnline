package Task3.Server.Menu;

import Task3.Server.File.PathFiles;
import Task3.Server.Students.Student;
import Task3.Server.readWriteXML.WriteStudentInfo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;


public class ClientFuncServer {

    public Student addNewPerson(DataOutputStream out, DataInputStream in) {
        String firstName = null;
        String lastName = null;
        String city = null;
        int course = 0;
        String birthday = null;

        try {
            firstName = in.readUTF();
            lastName = in.readUTF();
            city = in.readUTF();
            course = Integer.parseInt(in.readUTF());
            birthday = in.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Student student = new Student(firstName, lastName, city, course, birthday);

        WriteStudentInfo wsi = new WriteStudentInfo();
        try {
            wsi.write(student, PathFiles.pathPersonInfoFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.writeUTF("новое дело создано");
        } catch (IOException e) {
            e.printStackTrace();
        }


        return student;
    }
    
}
