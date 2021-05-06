package com.rajat.oopsConcepts;

class NonStaticClass{
    /*
    This class will be used to define instance method and variables and will be accesed using only
    instance of this class

     */
    int instanceVariable = 5;
}

public class StaticLearning {

    // Static Method
    static void myMethod(){
        System.out.println("Into myMethod");
    }

    // Static variables
    static int staticNumber = 5;

    // Non-Static Method
    void myMethod2(){
        System.out.println("Into Mymethod 2");
    }

    public static void main(String[] args) {
        /*
        Calling the static method without creating a object
         */
        myMethod();

        /*
        Calling the non-static method without creating object will give error
         */
        StaticLearning st = new StaticLearning();
        st.myMethod2();

        /*
        Using variable
         */
        System.out.println("Printing the variable : " + staticNumber);

        /*
        Instance Variable :
         */
        NonStaticClass instance = new NonStaticClass();
        System.out.println("Printing the non-static variable (Instance Variable) : " + instance.instanceVariable);
    }
}
