package com.rajat.Inheritance;

/*
This is the Child Class which inherits parent Class teacher
 */
public class Physicsteacher extends TeacherClass{
    String mainSubject = "Physics";

    public Physicsteacher(String designation, String collegeName) {
        super(designation, collegeName);
    }

    public static void main(String[] args) {
        Physicsteacher physicsteacher = new Physicsteacher("teacher", "IEC COLLEGE");
        System.out.println("main Subject of the teacher : " + physicsteacher.mainSubject);
        System.out.println("College Name of the teacher : " + physicsteacher.collegeName);
        System.out.println("Designation Name of the teacher : " + physicsteacher.designation);

        physicsteacher.does();

    }
}
