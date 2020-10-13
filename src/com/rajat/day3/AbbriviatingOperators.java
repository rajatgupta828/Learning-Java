package com.rajat.day3;

public class AbbriviatingOperators {
    public static void main(String[] args) {
        /*
        We can also have short forms of the operators, which we call as abbreviating
        For example a = a + 1; can be written as a++;
         */
        int a = 0;

        a = a + 1;
        System.out.println("Value of a with regural operators is : " + a);

        a = 0;
        a++;
        System.out.println("Value of a with abbreviated operators : " + a);

        /*
        Similarly , a = a + 1 can also be written as a+= 1;
         */

    }
}
