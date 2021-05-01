package com.rajat.ControlFlow;

public class WhileAndDoWhile {
    /*
    Don't know how many times to loop, but use a expression to control the loop
     */
    public static void main(String[] args) {
        int count = 0;
        /*
        Simple while loop
         */
        while (count != 5){
            System.out.println("Count value is  :" + count);
            count++;
        }
        /*
        Writing the same while loop in a different way
         */
        int count1 = 0;
        while(true){
            if(count1 == 5){
                break;
            }
            System.out.println("Count value is  :" + count1);
            count1++;

        }
        /*
        If the first statement is not true, while loop will not execute, hence we have do while loop
        Do-While loop will execute for atleast one time before the loop ends, example below
         */
        int count2 = 5;
        do {
            System.out.println("Count2 value is : " + count2);
            count2++;
        }while (count2 != 6);
    }
}
