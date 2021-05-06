package com.rajat.oopsConcepts.Encapsulation;


public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int health){
        this.health = this.health -health;
        if(this.health < 0){
            System.out.println("Player died....");
        }
    }
    public int halthRemaining(){
        return this.health;
    }


}
