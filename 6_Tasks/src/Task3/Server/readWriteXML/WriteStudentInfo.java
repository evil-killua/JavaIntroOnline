package Task3.Server.readWriteXML;

import Task3.Server.File.PathFiles;
import Task3.Server.Students.ListStudents;
import Task3.Server.Students.Student;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WriteStudentInfo {

    public void write(Student info, String filePath) throws IOException {
        Document document = new Document();
        document.setRootElement(new Element("Students"));


        Element element = new Element("Student");

        element.addContent(new Element("firstName").setText(info.getFirstName()));
        element.addContent(new Element("lastName").setText(info.getLastName()));
        element.addContent(new Element("city").setText(info.getCity()));
        element.addContent(new Element("course").setText(String.valueOf(info.getCourse())));
        element.addContent(new Element("birthday").setText(info.getBirthday()));

        document.getRootElement().addContent(element);


        XMLOutputter writer = new XMLOutputter(Format.getPrettyFormat());
        writer.output(document, new FileOutputStream(filePath));

    }

    public void writeAll(List<Student> info, String filePath) throws IOException {
        Document document = new Document();
        document.setRootElement(new Element("Students"));


        Element element = new Element("Student");

        for (Student student : info) {
            element.addContent(new Element("firstName").setText(student.getFirstName()));
            element.addContent(new Element("lastName").setText(student.getLastName()));
            element.addContent(new Element("city").setText(student.getCity()));
            element.addContent(new Element("course").setText(String.valueOf(student.getCourse())));
            element.addContent(new Element("birthday").setText(student.getBirthday()));

            document.getRootElement().addContent(element);
        }

        XMLOutputter writer = new XMLOutputter(Format.getPrettyFormat());
        writer.output(document, new FileOutputStream(filePath));

    }
}
