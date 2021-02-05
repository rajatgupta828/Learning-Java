/*
Assocation Happens when we are establishing the relation between the objects of 2 or more classes.
Relationship can be one to one, one to many or many to many
 */

package com.rajat.JavaAggregationAndAssociation;

class Association1Class{
    String classname;
    String classSection;

    Association1Class(String classname, String classSection){
        this.classname = classname;
        this.classSection = classSection;
    }
}

class AssociationStudent extends Association1Class{
    String studentName;

    AssociationStudent(String studentName, String className, String classSection){
        super(className, classSection);
        this.studentName = studentName;
    }

}

public class AssociationTutorial {
    public static void main(String[] args) {
        AssociationStudent associationStudent = new AssociationStudent("Rajat", "Association",
                "B");
        System.out.println("Association Student Name : " + associationStudent.studentName);
        System.out.println("Association Class Name : " + associationStudent.classname);
        System.out.println("Association Section Name : " + associationStudent.classSection);
    }
}
