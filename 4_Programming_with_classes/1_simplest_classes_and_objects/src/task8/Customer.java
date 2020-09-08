package task8;

public class Customer {
     static int count = 1;
     int id = 0;

     String lastName;
     String firstName;
     String middleName;
     String address;
     int creditCard;
     int bankAccount;

    public Customer(String lastName, String firstName, String middleName, String address, int creditCard, int bankAccount) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;

        id = count++;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String toString() {
        return lastName + " " + firstName + " " + middleName + "; адрес - " + address +
                "; Кредитная карта - " + creditCard + "; Банковсчий счет - " + bankAccount;
    }

}
