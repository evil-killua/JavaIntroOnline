package task8.bean;

import java.util.Objects;
import java.util.UUID;

public class Customer {

    private UUID id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private int numbCreditCard;
    private int numbBankAccount;

    public Customer() {

    }

    public Customer(String lastName, String firstName, String middleName, String address
            , int numbCreditCard, int numbBankAccount) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.numbCreditCard = numbCreditCard;
        this.numbBankAccount = numbBankAccount;
        id = UUID.randomUUID();
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

    public long getNumbCreditCard() {
        return numbCreditCard;
    }

    public void setNumbCreditCard(int creditCard) {
        this.numbCreditCard = creditCard;
    }

    public long getNumbBankAccount() {
        return numbBankAccount;
    }

    public void setNumbBankAccount(int bankAccount) {
        this.numbBankAccount = bankAccount;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String toString() {
        return lastName + " " + firstName + " " + middleName + "; адрес - " + address +
                "; Кредитная карта - " + numbCreditCard + "; Банковсчий счет - " + numbBankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return numbCreditCard == customer.numbCreditCard &&
                numbBankAccount == customer.numbBankAccount &&
                id.equals(customer.id) &&
                lastName.equals(customer.lastName) &&
                firstName.equals(customer.firstName) &&
                middleName.equals(customer.middleName) &&
                address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, middleName, address, numbCreditCard, numbBankAccount);
    }
}
