package Task1.Users;

public class User {

    String login;
    String password;
    String userType;

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
}
