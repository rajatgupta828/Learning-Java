package com.rajat.InterfacesAndInnerClasses.AbstractClasses;

public class Runner {

    public static void main(String[] args) {
        Dog dog = new Dog("Ronny");

        dog.eat();
        dog.breathe();

        Fish fish = new Fish("Dory");
        fish.breathe();
        fish.eat();
        fish.swim();

    }
}
