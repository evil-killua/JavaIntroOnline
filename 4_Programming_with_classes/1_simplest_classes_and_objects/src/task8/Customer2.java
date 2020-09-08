package task8;

import java.util.Arrays;
import java.util.Comparator;

public class Customer2 {
    Customer[] customers;

    public Customer2() {
        customers = new Customer[]{
                new Customer("A", "A", "A", "A", 1234, 5678),
                new Customer("B", "B", "B", "B", 4321, 8765),
                new Customer("C", "C", "C", "C", 2343, 5654),
                new Customer("D", "D", "D", "D", 4353, 7334),
                new Customer("E", "E", "E", "E", 3453, 3453)};

    }

    public void sort_by_LastName() {
        Arrays.sort(customers, Comparator.comparing(Customer::getLastName));
        for (Customer customer : customers) System.out.println(customer);
    }

    public void Between_Numbers(int start, int end) {
        System.out.println("список кредитных карт из диапазона");
        for (Customer customer : customers) {
        if(customer.getCreditCard()>=start && customer.getCreditCard()<=end)
            System.out.println(customer);
        }
    }

}
