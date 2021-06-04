package com.rajat.Scope;

public class Runner {
    public static void main(String[] args) {

        String privateVar = "This is private to main method";

        ScopeCheck scopeCheck = new ScopeCheck();

        System.out.println("PrivateVar from scopecheck class is  : " + scopeCheck.getPrivateVar());

        System.out.println("Private var from main method is " + privateVar);

        scopeCheck.timesTwo();

        System.out.println("PrivateVar from scopecheck class is  : " + scopeCheck.getPrivateVar());

        ScopeCheck.InnerClass innerClass  = scopeCheck.new InnerClass();

        System.out.println("Private variable from Inner class : " + innerClass.getPrivateVar());

        innerClass.timesTwo();

    }
}
