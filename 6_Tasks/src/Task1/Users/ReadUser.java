package Task1.Users;

import java.io.*;
import java.util.ArrayList;

public class ReadUser {

  /*  public static final String path1 = "F:\\un\\Курсы\\6 этап\\src\\Task1\\Administrator\\nameAdmin.txt";
    public static final String path2 = "F:\\un\\Курсы\\6 этап\\src\\Task1\\Administrator\\passwordAdmin.txt";
    public static final String path3 = "F:\\un\\Курсы\\6 этап\\src\\Task1\\Login\\nameClient.txt";
    public static final String path4 = "F:\\un\\Курсы\\6 этап\\src\\Task1\\Login\\passClient.txt";

    public ArrayList<String> readName(int numb) {

        ArrayList<String> nameList = new ArrayList();

        try {
            File file = null;
            if (numb == 1)
                file = new File(path1);
            else if (numb == 2)
                file = new File(path3);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();

            while (line != null) {
                nameList.add(line);
                line = reader.readLine();
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return nameList;
    }

    public ArrayList<String> readPass(int numb) {

        ArrayList passList = new ArrayList();

        try {
            File file = null;
            if (numb == 1)
                file = new File(path2);
            else if (numb == 2)
                file = new File(path4);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();

            while (line != null) {
                passList.add(line);
                line = reader.readLine();
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return passList;
    }*/
  public static final String path = "F:\\un\\Курсы\\6 этап\\src\\Task1\\Users\\user.txt";
User user;

    String login;
    String password;
    String userType;

    public ReadUser() throws IOException {

        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        while (line != null) {
            login = line;
            password = reader.readLine();
            userType = reader.readLine();

            user = new User(login, password, userType);
            ArrayUser.users.add(user);

            line = reader.readLine();

            if (line.equals("///")) {
                line = reader.readLine();
            }

        }
    }

}
