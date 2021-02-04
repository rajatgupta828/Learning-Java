package com.rajat.day4;

public class MethodsInJava {
    public static void main(String[] args) {
        /*
        To make code re-usable, easily readable
        we can not put method in another method
        Do not put it outside the class
         */
        int numberPrinted = 100;

        printNumbers(numberPrinted);

    }

    public static void printNumbers(int number){
        for(int i = 0; i < number ; i++){
            System.out.println("Current number in method : " + i);
        }
    }
}
