package Task3.Server.Login;

public class Login {
    private String name;
    private String password;
    private String status;

    public Login(String name, String password, String status) {
        this.name = name;
        this.password = password;
        this.status = status;
    }

    public Login(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return name + " " + password + " " + status;
    }
}
