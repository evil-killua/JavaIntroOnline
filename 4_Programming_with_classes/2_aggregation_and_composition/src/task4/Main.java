package task4;

import task4.bean.BankAccount;
import task4.bean.Client;
import task4.logic.ClientLogic;
import task4.view.ClientView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
          Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
          счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
          всем счетам, имеющим положительный и отрицательный балансы отдельно
         */

        ClientLogic clientLogic = new ClientLogic();
        ClientView clientView = new ClientView();
        Client client = new Client();

        client.addBankAccount(new BankAccount(3333, 150));
        client.addBankAccount(new BankAccount(1111, 20));
        client.addBankAccount(new BankAccount(4444, -2));
        client.addBankAccount(new BankAccount(2222, 200));

        clientView.printInfo(client.getBankAccounts());

        List<BankAccount> list = new ArrayList<BankAccount>();

        list = clientLogic.blockAccount(client.getBankAccounts(), 2222);
        client.setBankAccount(list);
        clientView.printInfo(client.getBankAccounts());

        list = clientLogic.sortAccount(client.getBankAccounts());
        client.setBankAccount(list);
        clientView.printInfo(client.getBankAccounts());

        double sum;
        sum = clientLogic.sumAllMoney(client.getBankAccounts());
        clientView.printSum(sum, "общая сумма");

        sum = clientLogic.sumMoneyNegativeBalance(client.getBankAccounts());
        clientView.printSum(sum, "отрицательный баланс");

        sum = clientLogic.sumMoneyPositiveBalance(client.getBankAccounts());
        clientView.printSum(sum, "положительный баланс");


    }
}
