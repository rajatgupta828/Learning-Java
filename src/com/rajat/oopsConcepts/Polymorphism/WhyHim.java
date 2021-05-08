package com.rajat.oopsConcepts.Polymorphism;

public class WhyHim extends Movie{

    public WhyHim(String movieName, String genre) {
        super("Why Him","Comedy");
    }

    @Override
    public String plot() {
        return "Comedy Movie Why Him";
    }
}
