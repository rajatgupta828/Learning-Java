package com.rajat.InterfacesAndInnerClasses.AbstractClasses;

public class Fish extends Animal{


    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " Eating seafood...");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " gills are working...");
    }
}
