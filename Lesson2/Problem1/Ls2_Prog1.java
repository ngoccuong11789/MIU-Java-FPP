package Lesson2.Problem1;

import java.util.Arrays;

public class Ls2_Prog1 {
    public static void main(String[] args) {
        Address address1 = new Address("123 Main St", "Chicago", "IL", "60601");
        Address address2 = new Address("456 Elm St", "New York", "NY", "10001");
        Address address3 = new Address("789 Oak St", "Chicago", "IL", "60602");
        Address address4 = new Address("101 Pine St", "Los Angeles", "CA", "90001");

        Customer c1 = new Customer("Joe", "Smith", "332-221-4444");
        c1.setBillingAddress(address1);
        c1.setShippingAddress(address2);
        Customer c2 = new Customer("Jane", "Doe", "123-456-7890");
        c2.setBillingAddress(address3);
        c2.setShippingAddress(address4);
        Customer c3 = new Customer("John", "Doe", "987-654-3210");
        c3.setBillingAddress(address2);
        c3.setShippingAddress(address4);

        Customer[] customers = new Customer[3];
        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;

        for(Customer customer : customers) {
            //System.out.println(customer.getBillingAddress().city);
            if(customer.getBillingAddress().city.equals("Chicago")) {
                System.out.println(customer);
            }

        }

    }
}
