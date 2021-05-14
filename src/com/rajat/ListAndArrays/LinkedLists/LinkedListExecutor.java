package com.rajat.ListAndArrays.LinkedLists;

public class LinkedListExecutor {

    public static void main(String[] args) {

        /*
        Below code is to understand the memory allocation working in  Java
         */
        Customer customer = new Customer("Rajat",100.27);
        Customer  customer1;

        customer1 = customer;
        customer1.setBalance(200.00);

        System.out.println("Balance for Customer :" + customer.getName() + " is : " + customer.getBalance());

        /*
        Link list can be used instead of Arrays.
        manipulation of Arrays takes less time for small arrays, but for bigger arrays to fill the gap on
        insertion and deletion it takes a lot of time.
        - Linked list store the actual link to the next item and Actual data and hence it is called as Linked Lists.
        -
         */



    }
}
