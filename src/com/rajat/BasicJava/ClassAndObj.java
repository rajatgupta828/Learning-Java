package com.rajat.BasicJava;

public class ClassAndObj {

    static  String name = "Meenu";
    static  Integer roll = 24;
    static  Student rajatStudent = new Student();


    public static void main(String[] args) {

        Student meenuStudent = new Student("Meenu","29","Orai");

        System.out.println("Name is  : " + name);
        System.out.println("Roll number is  : " + roll);
        // no args constructor call
        System.out.println("Rajat Student Details....");
        System.out.println("Student name is  : " + rajatStudent.nameOfStudent);
        System.out.println("Addr of Student is  : " + rajatStudent.addrOfStudent);
        System.out.println("roll number of Student is  : " + rajatStudent.rollNumberOfStudent);
        // All args constructor
        System.out.println("Meenu student Details ....");
        System.out.println("Student name is  : " + meenuStudent.nameOfStudent);
        System.out.println("Addr of Student is  : " + meenuStudent.addrOfStudent);
        System.out.println("roll number of Student is  : " + meenuStudent.rollNumberOfStudent);
    }
}
