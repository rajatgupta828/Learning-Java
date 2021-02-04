package com.rajat.Inheritance;

/*
This is the parent Class which is can be extended and it's properties can be used
 */
public class TeacherClass {
    String designation;
    String collegeName;
    void does(){
        System.out.println("teaching");
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public TeacherClass(String designation, String collegeName){
        this.collegeName = collegeName;
        this.designation = designation;
    }
}
