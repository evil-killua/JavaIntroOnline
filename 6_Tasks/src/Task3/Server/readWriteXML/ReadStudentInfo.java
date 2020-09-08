package Task3.Server.readWriteXML;

import Task3.Server.File.PathFiles;
import Task3.Server.StudentsInfo.ArrayStudentsInfo;
import Task3.Server.StudentsInfo.StudentInfo;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadStudentInfo {
    public ReadStudentInfo() throws JDOMException, IOException {
        ArrayStudentsInfo.info.clear();

        Document document=SAXParser(PathFiles.pathPersonInfoFile);
        Element element=document.getRootElement();

        List<Element> infoList=element.getChildren("Student");

        for (Element el: infoList) {
            StudentInfo studentInfo = new StudentInfo();

            studentInfo.setFirstName(el.getChildText("firstName"));
            studentInfo.setLastName(el.getChildText("lastName"));
            studentInfo.setCity(el.getChildText("city"));
            studentInfo.setCourse(Integer.parseInt(el.getChildText("course")));
            studentInfo.setBirthday(el.getChildText("birthday"));

            ArrayStudentsInfo.info.add(studentInfo);
        }

    }

    private Document SAXParser(String pathFile) throws JDOMException, IOException {
        SAXBuilder saxBuilder = new SAXBuilder();
        return saxBuilder.build(new File(pathFile));
    }

}
