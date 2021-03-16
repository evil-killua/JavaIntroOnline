package task4.bean;

import java.util.Objects;

public class BankAccount {

    private double money;
    private boolean block = false;
    private int numberAccount;

    public BankAccount() {

    }

    public BankAccount(int numberAccount, double money) {
        this.numberAccount = numberAccount;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public boolean isBlock() {
        return block;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.money, money) == 0 &&
                block == that.block &&
                numberAccount == that.numberAccount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money, block, numberAccount);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "money=" + money +
                ", block=" + block +
                ", numberAccount=" + numberAccount +
                '}';
    }
}
