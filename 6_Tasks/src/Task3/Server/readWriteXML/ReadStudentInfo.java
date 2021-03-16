package Task3.Server.readWriteXML;

import Task3.Server.File.PathFiles;
import Task3.Server.Students.ListStudents;
import Task3.Server.Students.Student;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadStudentInfo {
    public List<Student> readStudents() {
        List<Student> students = new ArrayList<>();

        Document document = null;
        try {
            document = SAXParser(PathFiles.pathPersonInfoFile);
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element element = document.getRootElement();

        List<Element> infoList = element.getChildren("Student");

        for (Element el : infoList) {
            Student studentInfo = new Student();

            studentInfo.setFirstName(el.getChildText("firstName"));
            studentInfo.setLastName(el.getChildText("lastName"));
            studentInfo.setCity(el.getChildText("city"));
            studentInfo.setCourse(Integer.parseInt(el.getChildText("course")));
            studentInfo.setBirthday(el.getChildText("birthday"));

            students.add(studentInfo);
        }
        return students;
    }

    private Document SAXParser(String pathFile) throws JDOMException, IOException {
        SAXBuilder saxBuilder = new SAXBuilder();
        return saxBuilder.build(new File(pathFile));
    }

}
