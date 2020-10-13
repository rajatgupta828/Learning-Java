package com.rajat.day3;

public class ComparisonAndLogicalOperators {
    public static void main(String[] args) {
        /*
        There are Comparison operators , (<,>,<=,>=,!=,==) for example
        < - less than operator
        > - greater Than operator
        <= -  Less than equal to
        >= - Greater than equal to
        != - not equal to
        == - Completely equal to
        - Examples are below
         */
        int currentScore = 100;
        int topScore = 200;

        currentScore = 200;
        if(currentScore == topScore){
            System.out.println("current Score : " + currentScore);
            System.out.println("you are a topper");
        }
        currentScore = 100;
        if(currentScore != topScore){
            System.out.println("current Score : " + currentScore);
            System.out.println("you are not a topper");
        }
        if(currentScore < topScore){
            System.out.println("Current score : " + currentScore);
            System.out.println("Your marks are less than top score");
        }
        currentScore = 203;
        if(currentScore > topScore){
            System.out.println("Current score : " + currentScore);
            System.out.println("Your marks are more than top score");
        }
        /*
        Similarly we can use greater than equal to and less than equal to as well
         */

        /*
        There are logical operators as well for example to check 2 or more conditions
        - Logical and Operator : represnted as &&
        - && operator will return true only if both the conditions are true and it will not validate further
        - if the first condition in false
         */
        int fail = 30;
        int maxScore = 100;
        int scoredMarks = 75;

        if(scoredMarks > fail && scoredMarks < maxScore){
            System.out.println("Your scored marks : " + scoredMarks);
            System.out.println("Marks are in valid range");
        }
        scoredMarks = 103;
        if(scoredMarks > fail && scoredMarks < maxScore){
            System.out.println("Your scored marks : " + scoredMarks);
            System.out.println("Marks are in valid range");
        }else{
            System.out.println("Your scored marks : " + scoredMarks);
            System.out.println("Your marks are in-valid in the range");
        }
        /*
        Logical Or operator
        - any one condition is true
        - will check all the conditions anyways
         */
        scoredMarks = 103;
        if(scoredMarks > fail || scoredMarks < maxScore){
            System.out.println("Your scored marks : " + scoredMarks);
            System.out.println("Marks are in valid range");
        }
    }
}
