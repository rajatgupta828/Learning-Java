package com.rajat.ControlFlow;

public class ForLoop {

    public static void main(String[] args) {
        /*
        simple For Loop
         */
        for(int i = 0; i < 100; i++){
            System.out.println("Value of Iteration : " + i);
        }
        /*
        For loop to Iterate an array :
         */
        int array[] = {1,2,3,4,5};
        for(int j = 0; j < array.length; j++){
            System.out.println("Values in array : " + array[j]);
        }

        /*
        Enhanced For loop
         */
        int newArray[] = {1,2,3,4,5,6,7,8,9};
        for(int numbers : newArray){
            System.out.println("Values in new Array : " + numbers);
        }

    }
}
