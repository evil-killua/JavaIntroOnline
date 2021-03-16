package task8.bean;

import task8.bean.Customer;

import java.util.*;

public class Customer2 {

    private List<Customer> customers;

    {
        customers = new ArrayList<Customer>();
    }

    public Customer2() {

    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public String toString() {
        return "Customer2{" +
                "customers=" + customers +
                '}';
    }

}
