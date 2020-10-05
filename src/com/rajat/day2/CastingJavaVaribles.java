package com.rajat.day2;

public class CastingJavaVaribles {
    public static void main(String[] args) {

        /*
        Casting is used to convert values of One datatype to other data type
        Example of Casting is below : Simply write the type in parentheses ahead of the variable
         */
        byte myMaxbyte = Byte.MAX_VALUE;
        byte castByte = (byte)(myMaxbyte/2);

        System.out.println("The casted byte is : " + castByte);

        /*
        String casting - We have to cast Strings differently
         */
        String numberString = "8";
        int numberInteger = Integer.parseInt(numberString);
        long numberLong = Long.parseLong(numberString);
        float numberFloat = Float.parseFloat(numberString);


        System.out.println("Casted Integer is : " + numberInteger);
        System.out.println("Casted Long is : " + numberLong);
        System.out.println("Casted float is : " + numberFloat);
    }
}
