package com.rajat.day3;

public class TernaryOperator {
    public static void main(String[] args) {
        /*
        We have 3 operands in ternary operator
        - First operator is the condition we are testing , result : true/false
        - Second Operand : what to do if the condition is true
        - Third Operand : What to do if the condition is false
         */

        boolean isNumber = true;

        boolean wasNumber = isNumber ? true : false;

        System.out.println("was number : " + wasNumber);
        System.out.println("is number : " + wasNumber);

        /*
        Another example
         */
        int negativeNumber = -320;
        int positiveNumber = 320;

        String result = (negativeNumber > 0) ? "Number is positive" : "Number is negative";
        System.out.println("The result to check negative number is : " + result);
        result = (positiveNumber > 0) ? "Number is positive" : "Number is negative";
        System.out.println("The result to check negative number is : " + result);
    }
}
