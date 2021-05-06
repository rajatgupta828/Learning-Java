package com.rajat.oopsConcepts.Encapsulation;

public class EncapsulationExecutor {
    /*
    Encapsulation helps us giving control of what is accessible to which class
    Standard Example without encapsulation
    We need encapsulation to make sure
     - Initialization is done
     - We are exposing methods only required to the functionlity - Giving more control
     - We are making application make more prone to errors as we have to make change at multiple places and
     refactor won't work.
     */

    public static void main(String[] args) {
        Player player = new Player();

        player.health = 100;
        player.name = "rajat";
        player.weapon = "Axe";

        player.loseHealth(10);

        System.out.println("Health remaining : " + player.halthRemaining());

        player.loseHealth(91);
        System.out.println("Health remaining : " + player.halthRemaining());

        System.out.println("Encapsulation Begins....");

        EncapsulatedPlayer encapsulatedRajat = new EncapsulatedPlayer("Rajat",100,"Axe");

        encapsulatedRajat.takeHit("Hand");
        encapsulatedRajat.takeHit("Leg");
    }
}
