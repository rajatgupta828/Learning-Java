package com.rajat.oopsConcepts.Abstraction;

public class Socks extends Clothing{

    int price;

    @Override
    protected int getPrice() {
        return this.price;
    }

    @Override
    protected void display() {
        System.out.println("I am a sock with price : " + this.price + " Id : " + this.id);
    }

    public Socks(int price, int id) {
        super(id);
        this.price = price;
    }
}
