package com.rajat.oopsConcepts.Classes;

public class CarExecutor {

    public static void main(String[] args) {
        Car verna = new Car();
        Car ecoSport = new Car();
        Car baleno = new Car();

        verna.setColor("Black");
        verna.setCompany("Hyundai");
        verna.setDoors(5);
        verna.setEngineCc(1500);
        verna.setModelName("sx");
        ecoSport.setColor("White");
        ecoSport.setCompany("Ford");
        ecoSport.setDoors(5);
        ecoSport.setEngineCc(1500);
        ecoSport.setModelName("Titanium");
        baleno.setColor("Blue");
        baleno.setCompany("Maruti");
        baleno.setDoors(5);
        baleno.setEngineCc(1200);
        baleno.setModelName("zeta");

        baleno.printData("Baleno");
        ecoSport.printData("Eco Sport");
        verna.printData("Verna");


    }
}
