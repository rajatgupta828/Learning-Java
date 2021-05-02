package com.rajat.oopsConcepts.Classes;

public class Car {
    private String company;
    private String modelName;
    private int doors;
    private int engineCc;
    private String color;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getEngineCc() {
        return engineCc;
    }

    public void setEngineCc(int engineCc) {
        this.engineCc = engineCc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printData(String mycar){
        System.out.println("Mycar : " + mycar + " Car Name : " + this.company + " " + this.modelName);
        System.out.println("Car Color : " + this.color);
        System.out.println("Engine : "  + this.engineCc);
        System.out.println("Number of doors : " + this.doors);
    }
}
