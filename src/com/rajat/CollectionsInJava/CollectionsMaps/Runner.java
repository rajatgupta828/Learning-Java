package com.rajat.CollectionsInJava.CollectionsMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        UserMaps myLanguages = new UserMaps();

        myLanguages.addLanguages("Java", "I would rate myslef 8/10");
        myLanguages.addLanguages("Python", "I would rate myself 6/10");
        myLanguages.addLanguages("C","I learned it long back, I don't remember it now");
        myLanguages.addLanguages("C","I have already added it, I am just checking it using contains method.");
        myLanguages.addLanguages("Removal","Adding to check removal");
        myLanguages.addLanguages("Replace","This text will be replaced");
        // To get the values from map
        System.out.println(myLanguages.getLanguages().get("Java"));

        printMap(myLanguages.getLanguages());

        // to remove on Key value pair
        if(myLanguages.getLanguages().remove("Removal","Let's see if this get's removed")){
            System.out.println("Removal removed");
        }else{
            System.out.println("Key Value pair not matched");
        }
        // To remove based on key
        myLanguages.getLanguages().remove("Removal");

        System.out.println("------------------Printing after Removal----------------------------------");
        printMap(myLanguages.getLanguages());

        // Checking Replace() method based on key and value
        myLanguages.getLanguages().replace("Replace","This text will be replaced",
                "This text will be replaced again");

        System.out.println("------------------Printing after Replacing(K/V)----------------------------------");
        printMap(myLanguages.getLanguages());

        // Replace based on Key
        myLanguages.getLanguages().replace("Replace","This is the replaced value");
        System.out.println("------------------Printing after Replacing(K)----------------------------------");
        printMap(myLanguages.getLanguages());

    }

    public static void printMap(Map<String,String> myMap){
        // To get all the keys
        Set<String> keys = myMap.keySet();
        for(String key : keys){
            System.out.println("Key : " + key + " Value : " + myMap.get(key));
        }
    }
}
