package com.rajat.CollectionsInJava.AdventureGameMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0,"Home, Learning Java"));
        locations.put(1, new Location(1,"You are in chennai"));
        locations.put(2, new Location(2,"You are in Delhi"));
        locations.put(3, new Location(3,"You are in Rajasthan"));
        locations.put(4, new Location(4,"You are in Jammu"));
        locations.put(5, new Location(5,"You are in Nepal"));


        // Add Exits
        locations.get(2).addExit("N",4);
        locations.get(2).addExit("W",3);
        locations.get(2).addExit("S",1);
        locations.get(2).addExit("E",5);
        locations.get(2).addExit("Q",0);
        locations.get(2).addExit("HOME",0);
        locations.get(1).addExit("Q",0);
        locations.get(1).addExit("N",2);
        locations.get(3).addExit("E",2);
        locations.get(3).addExit("Q",0);
        locations.get(4).addExit("S",2);
        locations.get(4).addExit("Q",0);
        locations.get(5).addExit("W",2);
        locations.get(5).addExit("Q",0);

        int loc = 1;
        while (true){
            if(loc == 0){
                break;
            }
            System.out.println(locations.get(loc).getDescription());
            System.out.print("Available Exits are  ");
            Map<String, Integer> exitsAvailable = locations.get(loc).getExits();
            for(String exit : exitsAvailable.keySet()){
                System.out.print(exit + " ");
            }
            System.out.println();

            Map<String, String> vocab = new HashMap<>();
            vocab.put("NORTH","N");
            vocab.put("SOUTH","S");
            vocab.put("WEST","W");
            vocab.put("EAST","E");
            vocab.put("QUIT","Q");
            vocab.put("N","N");
            vocab.put("S","S");
            vocab.put("W","W");
            vocab.put("E","E");
            vocab.put("Q","Q");

            String direction = scanner.nextLine().toUpperCase();
            String[] directionBreakdown = direction.split(" ");
            String directionSlected = "";
            for(String dir:directionBreakdown){
                if (vocab.containsKey(dir)){
                    directionSlected = vocab.get(dir);
                }
            }


            if(exitsAvailable.containsKey(directionSlected)){
                loc = exitsAvailable.get(directionSlected);
            }else{
                System.out.println("You can not go in that direction...");
            }
        }

    }
}
