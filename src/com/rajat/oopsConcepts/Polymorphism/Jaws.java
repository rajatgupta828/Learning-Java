package com.rajat.oopsConcepts.Polymorphism;

public class Jaws extends  Movie{

    public Jaws(String movieName, String genre) {
        super("Jaws", "action");
    }

    public String plot(){
        return "Sharks eat people";
    }

}
