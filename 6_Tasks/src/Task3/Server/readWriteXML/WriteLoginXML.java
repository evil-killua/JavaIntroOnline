package Task3.Server.readWriteXML;

import Task3.Server.Login.ListLogin;
import Task3.Server.Login.Login;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import Task3.Server.File.PathFiles;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;


public class WriteLoginXML {

    public void write(ArrayList<Login> logins,String filePath)  {
        Document document = new Document();
        document.setRootElement(new Element("Logins"));

        for (Login log:logins) {

            Element element = new Element("Login");

            element.addContent(new Element("name").setText(log.getName()));
            element.addContent(new Element("password").setText(log.getPassword()));
            element.addContent(new Element("status").setText(log.getStatus()));

            document.getRootElement().addContent(element);
        }

        XMLOutputter writer = new XMLOutputter(Format.getPrettyFormat());

        try {
            writer.output(document,new FileOutputStream(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
