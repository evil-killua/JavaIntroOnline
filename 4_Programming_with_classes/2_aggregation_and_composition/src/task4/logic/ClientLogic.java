package task4.logic;

import task4.bean.BankAccount;

import java.util.Comparator;
import java.util.List;

public class ClientLogic {

    public List<BankAccount> blockAccount(List<BankAccount> bankAccounts, int numberAccount) {
        for (BankAccount bankAccount : bankAccounts) {
            if (numberAccount == bankAccount.getNumberAccount())
                bankAccount.setBlock(true);
        }
        return bankAccounts;
    }


    public List<BankAccount> unBlockAccount(List<BankAccount> bankAccounts, int numberAccount) {
        for (BankAccount bankAccount : bankAccounts) {
            if (numberAccount == bankAccount.getNumberAccount())
                bankAccount.setBlock(false);
        }
        return bankAccounts;
    }


    public BankAccount searchBankAccount(List<BankAccount> bankAccounts, int numberAccount) {
        for (BankAccount bankAccount : bankAccounts) {
            if (numberAccount == bankAccount.getNumberAccount())
                return bankAccount;
        }
        return null;
    }

    public List<BankAccount> sortAccount(List<BankAccount> bankAccounts) {
        bankAccounts.sort(Comparator.comparing(BankAccount::getNumberAccount));

        return bankAccounts;
    }

    public double sumAllMoney(List<BankAccount> bankAccounts) {
        double sum = 0;

        for (BankAccount bankAccount : bankAccounts) {
            if (!bankAccount.isBlock()) {
                sum += bankAccount.getMoney();
            } else {
                continue;
            }
        }

        return sum;
    }

    public double sumMoneyPositiveBalance(List<BankAccount> bankAccounts) {
        double sum = 0;

        for (BankAccount bankAccount : bankAccounts) {
            if (!bankAccount.isBlock()) {
                if (bankAccount.getMoney() >= 0) {
                    sum += bankAccount.getMoney();
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }

        return sum;
    }

    public double sumMoneyNegativeBalance(List<BankAccount> bankAccounts) {
        double sum = 0;

        for (BankAccount bankAccount : bankAccounts) {
            if (!bankAccount.isBlock()) {
                if (bankAccount.getMoney() < 0) {
                    sum += bankAccount.getMoney();
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }

        return sum;
    }

}
