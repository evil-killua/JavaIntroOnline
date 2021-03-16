package task4.bean;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private List<BankAccount> bankAccounts;

    {
        bankAccounts = new ArrayList<BankAccount>();
    }

    public Client() {

    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccount(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "bankAccounts=" + bankAccounts +
                '}';
    }
}
