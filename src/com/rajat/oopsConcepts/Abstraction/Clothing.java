package com.rajat.oopsConcepts.Abstraction;

/*
1. Class can not be instantiated.
2. Class can have Concrete properties and characterstics, like concrete variables and methods.
3. It can have abstract methods which need to be defined at the implementation level.
 */

public abstract class Clothing {

    int id;

    public int getId() {
        return id;
    }

    public Clothing(int id) {
        this.id = id;
    }

    // Concrete Methods
    public void setId(int id) {
        this.id = id;
    }

    // Abstract methods
    protected abstract int getPrice();
    protected abstract void display();

}
