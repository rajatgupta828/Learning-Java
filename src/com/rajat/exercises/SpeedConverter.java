package com.rajat.exercises;

public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(5.0);

    }

    public static long toMilesPerHour(double kilometersPerHour){
        long returnValue = 0;
        if(kilometersPerHour < 0){
            returnValue = -1;
        }else{
            returnValue = Math.round(kilometersPerHour);
        }
        return  returnValue;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            double milePerhour = kilometersPerHour / 1.609;
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(milePerhour) + " mi/h");
        }
    }
}
