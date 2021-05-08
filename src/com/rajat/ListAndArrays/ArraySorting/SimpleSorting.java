package com.rajat.ListAndArrays.ArraySorting;

import java.util.Arrays;

public class SimpleSorting {

    public static void main(String[] args) {
        int[] simpleArray = new int[100];

        for(int i  = 0 ; i < simpleArray.length; i++){
            simpleArray[i] = (int) (Math.random()*(10000-100+1))+100;
        }

        Arrays.sort(simpleArray);

        System.out.println("Sorted Array : ");
        for (int j = 0; j < simpleArray.length; j ++){
            System.out.println(simpleArray[j]);
        }

    }
}
