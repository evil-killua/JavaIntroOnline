package task8.logic;

import task8.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task8Logic {

    public List<Customer> sort_by_LastName(List<Customer> customer) {
        customer.sort(Comparator.comparing(Customer::getLastName));

        return customer;
    }

    public List<Customer> BetweenNumbCreditCard(List<Customer> customers, int start, int end) {
        List<Customer> customer2 = new ArrayList<Customer>();

        for (Customer customer : customers) {
            if (customer.getNumbCreditCard() >= start && customer.getNumbCreditCard() <= end)
                customer2.add(customer);
        }
        return customer2;
    }
}
