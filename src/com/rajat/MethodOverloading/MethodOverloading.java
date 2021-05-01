package com.rajat.MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        int score = calculateScore("Rajat", 50);
        double doubleScore = calculateScore("Rajat Double",50);
        System.out.println("Integer Calculated Score : " + score);
        System.out.println("Double Calculated Score :"+ String.format("%.5f",doubleScore));

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "  + playerName + " scored " + score + " points" );
        return score*1000;
    }

    /*
    Over loading the same method with a different parameters
     */
    public static double calculateScore(String playerName, double score){
        System.out.println("Player "  + playerName + " scored " + score + " points" );
        return score*10.1500;
    }
}
