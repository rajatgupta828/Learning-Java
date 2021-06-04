package com.rajat.Scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 0;


    public ScopeCheck() {
        System.out.println("Scope Check created with Variables, Public Var :  " + publicVar +
                " and  Private Var : " + privateVar);

    }

    public int getPublicVar() {
        return publicVar;
    }

    public int getPrivateVar() {
        return privateVar;
    }

    //Scope can be defined To only method as well
    public void timesTwo(){
        int privateVar = 2;
        for (int i = 0; i < 10; i++){
            System.out.println(i + " times 2 is  : " + i*privateVar);
        }
    }

    //Adding a inner class
    public class InnerClass{
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("Inner class created , value of privateVar is : " + privateVar);
        }

        public int getPrivateVar() {
            return privateVar;
        }

        public void timesTwo(){
            for (int i = 0; i < 10; i++){
                System.out.println(i + " times 2 is  : " + i*privateVar);
            }
        }
    }
}
