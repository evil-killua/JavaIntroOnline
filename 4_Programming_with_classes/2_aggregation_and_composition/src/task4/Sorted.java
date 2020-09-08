package task4;

import java.util.ArrayList;

public interface Sorted {

    BankAccount searchBankAccount(ArrayList<BankAccount> bankAccounts);

    void blockAccount(ArrayList<BankAccount> bankAccounts);

    void unBlockAccount(ArrayList<BankAccount> bankAccounts);

    void sortAccount(ArrayList<BankAccount> bankAccounts);

    void sumMoney(ArrayList<BankAccount> bankAccounts);

    void addBankAccount(BankAccount bankAccount, ArrayList<BankAccount> bankAccounts);

    void addCashSystem(int bankAccount, ArrayList<BankAccount> bankAccounts, double sum);

}
