package task4;

public class Main {

    public static void main(String[] args) {
        /*
          Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
          счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
          всем счетам, имеющим положительный и отрицательный балансы отдельно
         */

        Client client = new Client("A",  new BankAccount(12));
        client.addBankAccount(new BankAccount(22), client.getBankAccounts());
        client.addBankAccount(new BankAccount(4), client.getBankAccounts());

        client.addCashSystem(12, client.getBankAccounts(), 100);
        client.addCashSystem(22, client.getBankAccounts(), 20);
        client.addCashSystem(4, client.getBankAccounts(), -45);

        //Поиск счета
        System.out.println(client.searchBankAccount(client.getBankAccounts()));
        System.out.println();
        //сортировка счетов
        client.sortAccount(client.getBankAccounts());

        //общая сумма

        client.sumMoney(client.getBankAccounts());

        //разблокировать
        client.unBlockAccount(client.getBankAccounts());

        // заблокировать
        client.blockAccount(client.getBankAccounts());
    }
}
