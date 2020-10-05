package com.rajat.day2;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        /*
        Following are the 8 data types in Java: int(32 bits), long(64 bits), float(32 bits),
        double(64 bits), short(16 Bits)
        char(16 bits), byte(8 Bits), boolean (true or false)
        If we are trying to store too large number or too small number , it will overflow/Underflow,
        i.e. +ve number will convert to -ve number and -ve number will transform to +ve number
         */
        /*
        Integer - Assigning a value, Getting max and min value using below
        Here Integer is a wrapper class, Wrapper class allows us to perform any operations on the main class
        For example here Integer is a wrapper class for int.
         */
        int intValue = 10000;
        int intMinValue  = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;

        System.out.println("Assigned Integer value : " + intValue);
        System.out.println("Max Integer value : " + intMaxValue);
        System.out.println("Min Integer value : " + intMinValue);

        /*
        Byte - It is same as Integer, below methods can be used to get the MAX and MIN values.
        Byte is the wrapper class that can be used for byte
         */
        byte byteValue = 28;
        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;

        System.out.println("Assigned Byte value : " + byteValue);
        System.out.println("Max Byte value : " + byteMinValue);
        System.out.println("Min Byte value : " + byteMaxValue);

        /*
        short - It is same as Integer, below methods can be used to get the MAX and MIN values.
        Short is the wrapper class that can be used for short
         */
        short shortValue = 28;
        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;

        System.out.println("Assigned short value : " + shortValue);
        System.out.println("Max short value : " + shortMinValue);
        System.out.println("Min short value : " + shortMaxValue);

        /*
        long - It is same as Integer, below methods can be used to get the MAX and MIN values.
        Long is the wrapper class that can be used for long
         */
        long longValue = 100L;
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;

        System.out.println("Assigned long value : " + longValue);
        System.out.println("Max long value : " + longMinValue);
        System.out.println("Min long value : " + longMaxValue);

        /*
        float - It is same as Integer - Stores decimal Values, below methods can be used to get the MAX and MIN values.
        float is the wrapper class that can be used for float
         */
        float floatValue = 103f;
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;

        System.out.println("Assigned float value : " + floatValue);
        System.out.println("Max float value : " + floatMinValue);
        System.out.println("Min float value : " + floatMaxValue);

        /*
        double - It is same as float, It stores decimal values, below methods can be used to get the MAX and MIN values.
        double is the wrapper class that can be used for double
         */
        double doubleValue = 28d;
        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;

        System.out.println("Assigned double value : " + doubleValue);
        System.out.println("Max double value : " + doubleMinValue);
        System.out.println("Min double value : " + doubleMaxValue);

        /*
        1. Char - It can store characters , it is displayed in single quotes
        2. Char is different from a String as String is in double quotes and Char is in single quotes
         */
        char charValue  = 'c';
        char charMinValue = Character.MIN_VALUE;
        char charMaxValue = Character.MAX_VALUE;

        System.out.println("Assigned char value : " + charValue);
        System.out.println("Max char value : " + charMinValue);
        System.out.println("Min char value : " + charMaxValue);

        /*
        Boolean - IT CAN BE Either true or False
         */
        boolean booleanTrueValue = true;
        boolean booleanFalseValue = false;
        System.out.println("Boolean True value : " + booleanTrueValue);
        System.out.println("Boolean False value : " + booleanFalseValue);

        /*
        1. String - It can store characters , it is displayed in double quotes
        2. There is no minimum / Maximum values
         */
        String stringValue  = "Rajat String";
        System.out.println("Assigned string value : " + stringValue);
    }
}
