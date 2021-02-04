package com.rajat.oopsConcepts;

public class StaticLearning {

    // Static Method
    static void myMethod(){
        System.out.println("Into myMethod");
    }

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
    }
}
