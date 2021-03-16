package Task3.Server.readWriteXML;

import Task3.Server.Login.ListLogin;
import Task3.Server.Login.Login;
import Task3.Server.File.PathFiles;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLoginXML {

    public List<Login> readLoginXML() {
        List<Login> logins = new ArrayList<>();

        Document document = null;
        try {
            document = SAXParser(PathFiles.pathLoginsFile);
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element element = document.getRootElement();
        List<Element> logList = element.getChildren("Login");

        for (Element el : logList) {
            Login login = new Login();

            login.setName(el.getChildText("name"));
            login.setPassword(el.getChildText("password"));
            login.setStatus(el.getChildText("status"));

            logins.add(login);
        }
        return logins;
    }

    private Document SAXParser(String pathFile) throws JDOMException, IOException {
        SAXBuilder saxBuilder = new SAXBuilder();
        return saxBuilder.build(new File(pathFile));
    }

}
