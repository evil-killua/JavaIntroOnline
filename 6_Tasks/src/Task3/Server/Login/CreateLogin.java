package Task3.Server.Login;

import Task3.Server.readWriteXML.WriteLoginXML;

import java.io.IOException;

public class CreateLogin {
    public void createLogin(String name,String password) throws IOException {
        ArrayLogin.logins.add(new Login(name,password,"client"));

        WriteLoginXML writeLoginXML = new WriteLoginXML();
    }
}
