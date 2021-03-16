package Task3.Server.Login;

import java.util.Objects;

public class Login {
    private String name;
    private String password;
    private String status;

    public Login(){}

    public Login(String name, String password, String status) {
        this.name = name;
        this.password = password;
        this.status = status;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return name.equals(login.name) &&
                password.equals(login.password) &&
                status.equals(login.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, status);
    }
}
