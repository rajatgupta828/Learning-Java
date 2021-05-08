package com.rajat.ListAndArrays.ArraySorting;

public class SelectionSort {
    public static void main(String[] args) {
        // Create a new array with random numbers
        int[] simpleArray = new int[5];
        for(int i  = 0 ; i < simpleArray.length; i++){
            simpleArray[i] = (int) (Math.random()*(10000-100+1))+100;
        }
        //Print Unsorted array :
        System.out.println("Unsorted Array");
        printArray(simpleArray);
        //Sort the array
        int[] sortedArray = sort(simpleArray);
        System.out.println("Sorted Array");
        // Print the sorted array
        printArray(sortedArray);
    }


    /*
    Selection Sort java code
     */
    public static int[] sort(int[] unsortedArray){
        for(int i = 0; i < unsortedArray.length; i++){
            // Assign a minimum number
            int minNumber = i;

            // Find the minimum number in the unsorted array
            for(int j = i + 1; j < unsortedArray.length; j ++){
                if(unsortedArray[j] < unsortedArray[minNumber]){
                    minNumber = j;
                }
            }

            // Swap the element with the element of lower index
            int temporary = unsortedArray[minNumber];
            unsortedArray[minNumber] = unsortedArray[i];
            unsortedArray[i] = temporary;
        }
        return unsortedArray;
    }

    //Print the array
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
