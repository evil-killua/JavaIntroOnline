package Task1.bean.User;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    private List<User> users ;

    {
        users= new ArrayList<>();
    }

    public ListUser(){

    }

    public ListUser(List<User> userList){
        this.users.addAll(userList);
    }

    public void addUser(List<User> user){

        users.addAll(user);
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "ListUser{" +
                "users=" + users +
                '}';
    }
}
