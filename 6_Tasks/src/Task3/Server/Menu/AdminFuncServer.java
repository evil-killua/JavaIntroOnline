package Task3.Server.Menu;

import Task3.Server.File.PathFiles;
import Task3.Server.Students.Student;
import Task3.Server.readWriteXML.WriteStudentInfo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public class AdminFuncServer {

    public List<Student> changePerson(List<Student> students, DataOutputStream out, DataInputStream in) {

        int size = students.size();

        int numbChoice = 0;
        int numb = 0;
        String word = null;
        try {
            out.writeUTF(String.valueOf(size));
            numbChoice = Integer.parseInt(in.readUTF());
            numb = Integer.parseInt(in.readUTF());
            word = in.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (numbChoice == 1)
            students.get(numb).setFirstName(word);
        else if (numbChoice == 2)
            students.get(numb).setLastName(word);
        else if (numbChoice == 3)
            students.get(numb).setCity(word);
        else if (numbChoice == 4)
            students.get(numb).setCourse(Integer.parseInt(word));
        else if (numbChoice == 5)
            students.get(numb).setBirthday(word);

        WriteStudentInfo wsi = new WriteStudentInfo();
        try {
            wsi.writeAll(students, PathFiles.pathPersonInfoFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.writeUTF("изменение внесено");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }

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
