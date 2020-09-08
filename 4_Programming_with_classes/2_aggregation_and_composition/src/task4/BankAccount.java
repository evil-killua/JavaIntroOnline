package task4;

public class BankAccount {
    double money=0;
    boolean block = false;
    int numberAccount;

    public BankAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getMoney() {
        if (!block)
            return money;
        else return -1;
    }

    public void putMoney(double money) {
        if (!block)
            this.money += money;
        else
            System.out.println("Операция невозможна, счет заблокирован");

    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public boolean getBlock() {
        return block;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String toString() {
        if (!block)
            return "Счет " + numberAccount + "; Балланс = " + money;
        else
            return "Счет " + numberAccount + " заблокирован";
    }
}
