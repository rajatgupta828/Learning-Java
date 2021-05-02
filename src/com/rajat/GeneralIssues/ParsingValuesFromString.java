package com.rajat.GeneralIssues;

public class ParsingValuesFromString {
    public static void main(String[] args) {
        String number = "2019";
        System.out.println("Number of year : " + number);
        
        /*
        To convert this into Number
         */
        int nextYear = 0;
        nextYear = Integer.parseInt(number) + 1;

        System.out.println("First next year : " + nextYear);
    }
}
