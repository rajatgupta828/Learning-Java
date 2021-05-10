package com.rajat.exercises.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {

    public static void main(String[] args) {

        int[] unSortedArray = getIntegers(5);

        printArray(unSortedArray);

        int[] sortedArray = sortIntegers(unSortedArray);

        printArray(sortedArray);


    }
    public static  int[] getIntegers(int numberOfElement){

        Scanner arrayScanner = new Scanner(System.in);
        int[] inputArray = new int[numberOfElement];
        System.out.println("Enter " + numberOfElement + " elements...");
        for(int i = 0; i < numberOfElement; i++){
            inputArray[i] = arrayScanner.nextInt();
        }
        return inputArray;

    }

    public static void printArray(int[] inputArray){
        for (int i = 0; i< inputArray.length;i++){
            System.out.println("Element " + i + " contents " + inputArray[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray){
        Arrays.sort(unsortedArray);
        return unsortedArray;
    }

}
