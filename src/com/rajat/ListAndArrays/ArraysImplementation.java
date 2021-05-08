package com.rajat.ListAndArrays;

public class ArraysImplementation {
    public static void main(String[] args) {
        /*
        Arrays are used to hold data of same type for example array of Integers, Strings, Decimals and so on
         */

        //Declaring a Array
        int[] myArray;
        double[] myDoubleArray;

        //Initializing Array, we need to tell the size
        myArray = new int[10];
        myDoubleArray = new double[10];
        //We can also initialize while declaring
        int[] myInitializedArray  = {1,2,3,4,5,6,7,8,9,10};

        // Assigning and using array variables, index start from 6
        myArray[5] = 6;
        myDoubleArray[6] = 5.7;

        System.out.println("MyArray assigned Value : " + myArray[5]);
        System.out.println("My Double Array assigned Value : " + myDoubleArray[6]);
        System.out.println("My Initialized Array : " + myInitializedArray[0]);
    }
}
