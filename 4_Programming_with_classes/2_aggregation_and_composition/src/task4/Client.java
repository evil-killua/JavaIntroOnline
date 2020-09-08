package task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Client implements Sorted {

    static int count = 0;
    int clientCount = 0;

    Scanner in = new Scanner(System.in);

    String name;
    BankAccount bankAccount;
    ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

    public Client(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.clientCount = count++;
        bankAccounts.add(bankAccount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccount(ArrayList<BankAccount> bankAccounts) {
        this.bankAccount = bankAccount;
    }


    @Override
    public BankAccount searchBankAccount(ArrayList<BankAccount> bankAccounts) {

        System.out.print("введите номер аккаунта: ");
        int numb = in.nextInt();
        for (BankAccount bankAccount : bankAccounts) {
            if (numb == bankAccount.getNumberAccount())
                return bankAccount;
        }
        System.out.println("Лицевой счет не найден");
        return null;
    }

    @Override
    public void blockAccount(ArrayList<BankAccount> bankAccounts) {
        System.out.print("введите номер аккаунта: ");
        int numb = in.nextInt();

        for (BankAccount bankAccount : bankAccounts) {
            if (numb == bankAccount.getNumberAccount())
                bankAccount.setBlock(true);
        }
        System.out.println("Счет заблокирован");
    }

    @Override
    public void unBlockAccount(ArrayList<BankAccount> bankAccounts) {
        System.out.print("\nвведите номер аккаунта: ");
        int numb = in.nextInt();

        for (BankAccount bankAccount : bankAccounts) {
            if (numb == bankAccount.getNumberAccount())
                bankAccount.setBlock(false);
        }
        System.out.println("Счет разблокирован");
    }

    @Override
    public void sortAccount(ArrayList<BankAccount> bankAccounts) {
        bankAccounts.sort(Comparator.comparing(BankAccount::getNumberAccount));

        for (BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount);
        }

    }

    @Override
    public void sumMoney(ArrayList<BankAccount> bankAccounts) {

        double positiveSum = 0, negativeSum = 0;

        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getMoney() >= 0)
                positiveSum += bankAccount.getMoney();
            else
                negativeSum += bankAccount.getMoney();
        }

        System.out.print("сумма положительных счетов:" + positiveSum);
        System.out.print("\nсумма отрицательных счетов:" + negativeSum);
        System.out.print("\nобщая сумма: " + (positiveSum + negativeSum));
    }

    @Override
    public void addBankAccount(BankAccount bankAccount, ArrayList<BankAccount> bankAccounts) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public void addCashSystem(int bankAccount, ArrayList<BankAccount> bankAccounts, double sum) {
        for (BankAccount account : bankAccounts) {
                if(account.getNumberAccount()==bankAccount)
                account.putMoney(sum);
        }
    }

}
