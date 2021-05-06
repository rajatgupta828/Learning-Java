package com.rajat.oopsConcepts.Encapsulation;

public class EncapsulatedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EncapsulatedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0  && health < 200){
            this.health = health;
        }
        this.weapon = weapon;

        System.out.println("initialized player : " + name + " health : " + this.health + " Weapon : " + this.weapon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    private void losehealth(int damage){
        this.health = this.health - damage;
        System.out.println("Losing Health .... Current is : " + this.health);
    }

    public void takeHit(String hitType){
        if(hitType.equalsIgnoreCase("Hand")) {
            losehealth(5);
        }else {
            losehealth(10);
        }
    }
}
