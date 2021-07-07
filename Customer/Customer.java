package by.epam.Customer;

import java.util.Comparator;
import java.util.Objects;

//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
public class Customer {

    int Id;
    String lastName;
    String firstName;
    String middleName;
    String address;
    int creditCardNumber;
    int bankAccountNumber;

    public Customer(String firstName){

    }

    public Customer(int Id, String lastName, String firstName, String middleName) {
        this.Id = Id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Customer(int Id, int creditCardNumber, int bankAccountNumber) {
        this.Id = Id;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer(int Id, String lastName, String firstName, String middleName, String address, int creditCardNumber, int bankAccountNumber) {
        this.Id = Id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
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

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Id == customer.Id && creditCardNumber == customer.creditCardNumber && bankAccountNumber == customer.bankAccountNumber && lastName.equals(customer.lastName) && firstName.equals(customer.firstName) && middleName.equals(customer.middleName) && address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, lastName, firstName, middleName, address, creditCardNumber, bankAccountNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + Id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }
}
