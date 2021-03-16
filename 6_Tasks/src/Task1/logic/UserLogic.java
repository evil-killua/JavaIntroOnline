package Task1.logic;

import Task1.DAO.UserDAO;
import Task1.bean.User.User;

import java.util.ArrayList;
import java.util.List;

public class UserLogic {

    public List<User> getUser(){
        UserDAO userDAO = new UserDAO();
        List<User> users = new ArrayList<>();

        users.addAll(userDAO.readUser());

        return users;
    }
}
