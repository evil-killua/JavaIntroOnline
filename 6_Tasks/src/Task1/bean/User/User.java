package Task1.bean.User;

import java.util.Objects;

public class User {

    private String login;
    private String password;
    private String userType;

    public User(){}

    public User(String login, String password, String userType) {
        this.login = login;
        this.password = password;
        this.userType = userType;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String toString() {

        return login + "\n" +
                password + "\n" +
                userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login) &&
                password.equals(user.password) &&
                userType.equals(user.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, userType);
    }
}
