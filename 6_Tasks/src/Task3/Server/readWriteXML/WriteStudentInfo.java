package Task3.Server.readWriteXML;

import Task3.Server.File.PathFiles;
import Task3.Server.StudentsInfo.ArrayStudentsInfo;
import Task3.Server.StudentsInfo.StudentInfo;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class WriteStudentInfo {
    public WriteStudentInfo() throws IOException {
        write(ArrayStudentsInfo.info, PathFiles.pathPersonInfoFile);
    }

    private static void write(ArrayList<StudentInfo> info,String filePath) throws IOException {
        Document document = new Document();
        document.setRootElement(new Element("Students"));

        for (StudentInfo studentInfo:info) {
            Element element = new Element("Student");

            element.addContent(new Element("firstName").setText(studentInfo.getFirstName()));
            element.addContent(new Element("lastName").setText(studentInfo.getLastName()));
            element.addContent(new Element("city").setText(studentInfo.getCity()));
            element.addContent(new Element("course").setText(String.valueOf(studentInfo.getCourse())));
            element.addContent(new Element("birthday").setText(studentInfo.getBirthday()));

            document.getRootElement().addContent(element);
        }

        XMLOutputter writer = new XMLOutputter(Format.getPrettyFormat());
        writer.output(document,new FileOutputStream(filePath));

    }
}
