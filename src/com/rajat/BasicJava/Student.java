package com.rajat.BasicJava;

public class Student {
    public String nameOfStudent;
    public String rollNumberOfStudent;
    public String addrOfStudent;

    // No argument Constructor
    public Student(){
        nameOfStudent = "Rajat";
        rollNumberOfStudent = "27";
        addrOfStudent = "Raebareli";
    }

    // All argument Constructor
    public Student(String nameOfStudent, String rollNumberOfStudent, String addrOfStudent){
        this.nameOfStudent = nameOfStudent;
        this.addrOfStudent = addrOfStudent;
        this.rollNumberOfStudent = rollNumberOfStudent;
    }
}
