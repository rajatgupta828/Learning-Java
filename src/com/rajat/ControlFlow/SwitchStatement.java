package com.rajat.ControlFlow;

public class SwitchStatement {
    /*
    We use Switch Keyword
    Syntax is below, its a matter of choice what are we going to use...
    We can use this instead of If-Else statements
    Break statement will get out of the loop as soon as the code is true
     */
    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3,4,5");
                break;
            case 10:
                System.out.println("Value is 10");
                break;
            default:
                System.out.println("Some other value given");
        }

    }
}
