package by.epam.Customer;

import java.util.*;

public class CustomerStore {
    private ArrayList<Customer> customers;

    public CustomerStore() {
        customers = new ArrayList<Customer>();
    }

    public CustomerStore(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public Customer findById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }

        throw new RuntimeException("This customer doesn't exist id=" + id);
    }

    public ArrayList<Customer> getCustomerByFirstName(String firstName) {
        ArrayList<Customer> res = new ArrayList<Customer>();
        for (Customer customer : customers) {
            if (customer.getFirstName().equals(firstName)) {
                res.add(customer);

            }
        }
        return res;
    }

    public ArrayList<Customer> getCustomerByLastName(String lastName) {
        ArrayList<Customer> res = new ArrayList<Customer>();
        for (Customer customer : customers) {
            if (customer.getLastName().equals(lastName)) {
                res.add(customer);
            }
        }

        return res;
    }

    public ArrayList<Customer> sortCustomerByLastName() {
        Collections.sort(customers, Comparator.comparing(Customer::getLastName).thenComparing(Customer::getFirstName));
        return customers;
    }

    public ArrayList<Customer> sortCustomerByFirstName() {
        Collections.sort(customers, Comparator.comparing(Customer::getFirstName).thenComparing(Customer::getLastName));
        return customers;
    }

    public ArrayList<Customer> getCustomersByCreditCardInRange(int from, int to) {
        ArrayList<Customer> res = new ArrayList<Customer>();
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() >= from && customer.getCreditCardNumber() <= to) {
                res.add(customer);
            }
        }
        return res;
    }
}
