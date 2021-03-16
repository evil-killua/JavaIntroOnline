package Task1.logic;

import Task1.bean.User.User;
import Task1.DAO.UserDAO;

import java.io.*;
import java.util.List;


public class Authentication {


    public Authentication() throws IOException {
    }

    public String login(String login, String password, List<User> users) throws IOException {
        UserDAO read = new UserDAO();

        String binPass = convert(password);
        System.out.println("binPass " + binPass);


        for (int i = 0; i < users.size(); i++) {
            if (login.equals(users.get(i).getLogin()) && binPass.equals(users.get(i).getPassword())
                    && users.get(i).getUserType().equals("admin")) {
                return "admin";
            } else if (login.equals(users.get(i).getLogin()) && binPass.equals(users.get(i).getPassword())
                    && users.get(i).getUserType().equals("client")) {
                return "client";
            }
        }
        return null;
    }

    public String convert(String password) {
        int d[] = new int[255];
        for (int i = 0; i < password.length(); i++) {
            d[i] = Integer.valueOf(password.charAt(i));
        }
        for (int i = 0; i < password.length(); i++) {
            System.out.println(d[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            sb.append(Integer.toBinaryString(d[i]));
        }
        String binPass = String.valueOf(sb);
        return binPass;
    }

}
