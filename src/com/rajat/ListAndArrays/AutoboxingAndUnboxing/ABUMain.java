package com.rajat.ListAndArrays.AutoboxingAndUnboxing;

import java.util.ArrayList;

public class ABUMain {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        String[] strArray = new String[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();

        stringArrayList.add("Rajat");

        /*
        We can not do below :
        ArrayList<int> intArrayList = new ArrayList<int>();
        Because this is primitive type as int is not class type
        We can define it as below using Autoboxing
         */
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);

    }
}
