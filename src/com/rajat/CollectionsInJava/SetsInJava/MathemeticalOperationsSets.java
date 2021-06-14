package com.rajat.CollectionsInJava.SetsInJava;

import java.util.HashSet;
import java.util.Set;

public class MathemeticalOperationsSets {

    static Set<Integer> squares = new HashSet<>();
    static Set<Integer> cubes = new HashSet<>();

    public static void main(String[] args) {

        for(int i = 1; i<=100; i ++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        // To check number of elements

        System.out.println("There are : " + squares.size() + " squares and " + cubes.size() + " cubes");

        // To perform Union
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Total number of Squares and Cubes : " + union.size());

        // Intersection
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection : Total number of Squares and Cubes : " + intersection.size());

    }
}
