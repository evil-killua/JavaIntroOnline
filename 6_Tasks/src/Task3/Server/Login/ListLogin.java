package Task3.Server.Login;

import java.util.ArrayList;
import java.util.List;

public class ListLogin {
    private List<Login> logins;

    {
        logins = new ArrayList<>();
    }

    public ListLogin(){}

    public ListLogin(List<Login> logins){
        this.logins=logins;
    }

    public void addLogins(List<Login> logins){
        logins.addAll(logins);
    }

    public List<Login> getLogins() {
        return logins;
    }

    public void setLogins(List<Login> logins) {
        this.logins = logins;
    }

    @Override
    public String toString() {
        return "ListLogin{" +
                "logins=" + logins +
                '}';
    }
}
