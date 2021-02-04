package com.rajat.day4;

public class IfThenElseCodeBlocks {
    public static void main(String[] args) {
        /*
        If then else code block is used to define conditional testing, see example below
         */
        int number1 = 1000;
        int number2 = 2000;
        int number3 = 3000;

        /*
        WHEN IF CONDITIONS ARE TRUE, IT WILL NOT GO INTO THE ELSE PARTS
         */
        if(number1 > 500){
            System.out.println("Number1 is greater than 500 but less than 100 ");
        }else if(number2 > 1000){
            System.out.println("Number 2 is greater than 1000 but less than 2000");
        }else {
            System.out.println("Number 3 is greater than 2000 and equal to 3000");
        }

        /*
        Variables created in code blocks are deleted automatically in Java
         */
        if(number3 == 3000){
            boolean true3000 = true;
            System.out.println("3000 truth : " + true3000);
        }
        /*
        This code will not work
        System.out.println("3000 truth : " + true3000);
         */
    }
}
