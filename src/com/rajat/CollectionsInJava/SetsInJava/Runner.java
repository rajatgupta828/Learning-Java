package com.rajat.CollectionsInJava.SetsInJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Runner {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) {

        HeavenlyBody temp = new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupitar",399);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Jupitar Moon1", 27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Jupitar Moon2", 27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars",1099);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Mars Moon1", 27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Mars Moon2", 27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);



        System.out.println("Planets..");

        for(HeavenlyBody planet: planets){
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody earth = solarSystem.get("Earth");
        System.out.println("Moons of " + earth.getName());
        for (HeavenlyBody earthMoons : earth.getSatellites()){
            System.out.println("\t" + earthMoons.getName());
        }

        //Union using addAll
        Set<HeavenlyBody> allMooons = new HashSet<>();
        for (HeavenlyBody planet : planets){
            allMooons.addAll(planet.getSatellites());
        }

        System.out.println("Printing all moons");
        for (HeavenlyBody moon : allMooons){
            System.out.println("\t" + moon.getName());
        }

    }
}
