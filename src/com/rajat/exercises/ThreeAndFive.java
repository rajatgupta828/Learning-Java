package com.rajat.exercises;

import java.sql.Array;

public class ThreeAndFive {
    public static void main(String[] args) {

        int numbersDevisible[] = new int[5];
        int arrayIndex = 0;
        int sum = 0;


        for(int i = 1; i <= 1000; i++){

            if(i%3 == 0 && i%5 == 0){
                numbersDevisible[arrayIndex] = i;
                arrayIndex += 1;
            }
            if(arrayIndex > 4){
                break;
            }
        }
        /*
        Sum of all numbers in the array :
         */
        for (int numbers: numbersDevisible){
            System.out.println("Numbers that are divisible by 3 nd 5 are  : " + numbers);
            sum = sum + numbers;
        }
        System.out.println("Sum of all the numbers : " + sum);
    }
}
