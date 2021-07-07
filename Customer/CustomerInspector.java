package by.epam.Customer;

import java.util.*;

//Найти и вывести (критерии выбора):
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class CustomerInspector {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        CustomerStore customerStore = new CustomerStore();

        Customer customer1 = new Customer(1, "Jared", "Ely", "A", "47 MySakila Drive", 53561, 34418);
        Customer customer2 = new Customer(2, "Mary", "Smith", "S", "28 MySQL Boulevard", 42399, 37551);
        Customer customer3 = new Customer(3, "Patricia", "Johnson", "D", "23 Workhaven Lane", 18743, 7716);
        Customer customer4 = new Customer(4, "Linda", "Williams", "F", "1411 Lillydale Drive", 93896, 99865);
        Customer customer5 = new Customer(5, "Barbara", "Jones", "G", "1913 Hanoi Way", 77948, 99780);
        Customer customer6 = new Customer(6, "Elizabeth", "Brown", "H", "1121 Loja Avenue", 45844, 58327);
        Customer customer7 = new Customer(7, "Jennifer", "Davis", "J", "692 Joliet Street", 53628, 49521);
        Customer customer8 = new Customer(8, "Maria", "Miller", "C", "1566 Inegl Manor", 1027, 65599);
        Customer customer9 = new Customer(9, "Susan", "Wilson", "K", "53 Idfu Parkway", 10672, 65750);
        Customer customer10 = new Customer(10, "Margaret", "Moore", "K", "1795 Santiago de Compostela Way", 29610, 50199);
        Customer customer11 = new Customer(11, "Dorothy", "Taylor", "F", "900 Santiago de Compostela Parkway", 16266, 30348);
        Customer customer12 = new Customer(12, "Lisa", "Anderson", "L", "478 Joliet Way", 72878, 65213);
        Customer customer13 = new Customer(13, "Nancy", "Thomas", "G", "613 Korolev Drive", 54308, 79388);
        Customer customer14 = new Customer(14, "Karen", "Jackson", "J", "531 Sal Drive", 81766, 94065);
        Customer customer15 = new Customer(15, "Betty", "White", "J", "1542 Tarlac Parkway", 43331, 34021);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
        customers.add(customer7);
        customers.add(customer8);
        customers.add(customer9);
        customers.add(customer10);
        customers.add(customer11);
        customers.add(customer12);
        customers.add(customer13);
        customers.add(customer14);
        customers.add(customer15);

        customerStore.setCustomers(customers);

        customerStore.getCustomers().forEach(System.out::println);
        System.out.println("Sorted by LastName==============================");
        customerStore.sortCustomerByLastName().forEach(System.out::println);
        System.out.println("Sorted by FirstName==============================");
        customerStore.sortCustomerByFirstName().forEach(System.out::println);
        System.out.println("Get customers by credit card range==============================");
        customerStore.getCustomersByCreditCardInRange(43331,53561).forEach(System.out::println);

    }
}
