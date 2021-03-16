package task4.view;

import task4.bean.BankAccount;

import java.util.List;

public class ClientView {
    public void printInfo(List<BankAccount> bankAccounts) {
        System.out.println(bankAccounts.toString());
    }

    public void printSum(double sum, String text) {
        System.out.println(text + " : " + sum);
    }
}
