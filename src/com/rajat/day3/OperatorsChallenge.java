package com.rajat.day3;

public class OperatorsChallenge {

    public static void main(String[] args) {
        double step1 = 20;
        double step2 = 80;

        double step3 = (step1 + step2) * 100.00;

        double step4 = step3%40;

        boolean step5 = (step4 == 0) ? true : false;

        System.out.println("Step 6 : " + step5);

        if(!step5){
            System.out.println("got some remainder");
        }
    }
}
