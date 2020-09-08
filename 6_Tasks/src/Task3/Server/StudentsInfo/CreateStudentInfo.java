package Task3.Server.StudentsInfo;

import Task3.Server.readWriteXML.WriteStudentInfo;

import java.io.IOException;

public class CreateStudentInfo {
    public void createStudentInfo(String firstName, String lastName, String city, int course, String birthday) throws IOException {
    ArrayStudentsInfo.info.add(new StudentInfo(firstName,lastName,city,course,birthday));

        WriteStudentInfo writeStudentInfo = new WriteStudentInfo();
    }
}
