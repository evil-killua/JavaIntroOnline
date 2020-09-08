package Task1.Administrator;

import Task1.Users.ArrayUser;
import Task1.Users.ReadUser;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Admin {
    ReadUser read = new ReadUser();

    public Admin() throws IOException {
    }

    public void login() throws IOException {
        Scanner in = new Scanner(System.in);
        //ArrayList<String> name = read.readName(1);
        //ArrayList<String> pass = read.readPass(1);
        // name.stream().forEach(x -> System.out.println("name: " + x));
        //pass.stream().forEach(x -> System.out.println("pass: " + x));

        FunctionalAdmin functionalAdmin = new FunctionalAdmin();
        boolean flag = false;
        for (; ; ) {
            System.out.print("введине логин: ");
            String login = in.nextLine();
            System.out.print("введите пароль: ");
            String password = in.nextLine();

            String binPass = convert(password);
            System.out.println("binPass " + binPass);
            // System.out.println("ArrayUser");
            // ArrayUser.users.stream().forEach(x-> System.out.println(x));
            String admin = "admin";
            int choice = 0;
            /*for (int i = 0; i < name.size(); i++) {
                if (login.equals(name.get(i))) {
                    if (binPass.equals(pass.get(i))) {
                        System.out.println("Добро пожаловать " + login);
                        functionalAdmin.menuFunctional();
                        break;
                    } else {
                        System.out.println("неправильный пароль!!!\nхотите попробовать ещё раз ввести пароль?1-да,2-нет");
                         choice = in.nextInt();
                        if (choice == 1)
                            continue;
                        else if (choice == 2) break;
                        else System.out.println("не корректный ввод!!!");
                    }
                } else {
                    System.out.println("такого имени нет!!!\nхотите попробовать ещё раз ввести имя?1-да\n2-нет");
                    choice = in.nextInt();
                    if (choice == 1)
                        continue;
                    else if (choice == 2) break;
                    else System.out.println("не корректный ввод!!!");
                }
            }*/
            for (int i = 0; i < ArrayUser.users.size(); i++) {
                if (login.equals(ArrayUser.users.get(i).getLogin()) && binPass.equals(ArrayUser.users.get(i).getPassword())
                        && admin.equals(ArrayUser.users.get(i).getUserType())) {
                    System.out.println("Добро пожаловать " + login);
                    flag = true;
                    functionalAdmin.menuFunctional();
                    break;
                }
            }
            if (flag) break;
            else {
                System.out.println("неправильно введены данные\nхотите ещё раз попробовать ввести данные?1-да,2-нет");
               // choice = in.nextInt();
                choice =parseInt(in.nextLine());
                if (choice == 1)
                    continue;
                else break;
            }

        }
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
