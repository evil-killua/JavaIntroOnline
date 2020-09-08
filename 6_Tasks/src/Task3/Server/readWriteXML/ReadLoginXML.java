package Task3.Server.readWriteXML;

import Task3.Server.Login.ArrayLogin;
import Task3.Server.Login.Login;
import Task3.Server.File.PathFiles;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadLoginXML {

    public ReadLoginXML() throws JDOMException, IOException {
        ArrayLogin.logins.clear();

        Document document = SAXParser(PathFiles.pathLoginsFile);

        Element element = document.getRootElement();
        List<Element> logList = element.getChildren("Login");

        for (Element el : logList) {
            Login login = new Login();

            login.setName(el.getChildText("name"));
            login.setPassword(el.getChildText("password"));
            login.setStatus(el.getChildText("status"));

            ArrayLogin.logins.add(login);
        }

    }

    private Document SAXParser(String pathFile) throws JDOMException, IOException {
        SAXBuilder saxBuilder = new SAXBuilder();
        return saxBuilder.build(new File(pathFile));
    }

}
