package com.rajat.ListAndArrays.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // Declaring a Linked List - Similar to Array list
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addinOrder("Goa",placesToVisit);
        addinOrder("Alwar",placesToVisit);
        addinOrder("Chennai",placesToVisit);
        addinOrder("Pune",placesToVisit);
        addinOrder("Kochi",placesToVisit);
        addinOrder("Lucknow",placesToVisit);

        printList(placesToVisit);

        //Adding a element at index position 1
        placesToVisit.add(1,"Himachal");

        printList(placesToVisit);

        //Removing a element at position 1
        placesToVisit.remove(1);
        printList(placesToVisit);

        visit(placesToVisit);
    }

    // Method to Iterate through Link List
    private static void printList(LinkedList<String> listToBePrinted){
        // We are going to use Iterator, this is another way to go through all the elements of ArrayList,
        // Linked List, Array etc

        Iterator<String> i = listToBePrinted.iterator();

        while (i.hasNext()){
            System.out.println("Currently Visiting : " + i.next());
        }

        System.out.println("==========Visited all cities============");

    }

    /*
    To show advantages of Linked list over  a array list, below method is what we are going to create
    this will add the Cities in Alphabetical order
     */
    private static boolean addinOrder(String newCity, LinkedList<String> listToBeAdded){
        // We are going to use List Iterator

        ListIterator<String> stringListIterator = listToBeAdded.listIterator();

        while (stringListIterator.hasNext()){
            // Check if city is already added
            int alreadyPresent = stringListIterator.next().compareTo(newCity);
            // Already Present
            if(alreadyPresent == 0){
                System.out.println("City " + newCity + " is already added..ignoring");
                return false;
            }else if (alreadyPresent > 0){
                    // Alphabetically smaller
                    stringListIterator.previous(); // Move one entry previous because next() has moved it forward
                    stringListIterator.add(newCity); //Add new city at current position
                    return true;
                }else if (alreadyPresent < 0) {

                    }

                }
        stringListIterator.add(newCity);
        return true;
    }
    /*
    Java actually represents a double linked list and below will be example for that where we will move both
    forward and backward in the list
     */
    public static void visit(LinkedList<String> cities){

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        // Iterator for list to traverse
        ListIterator<String> citiesIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities to Travel");
        }else{
            System.out.println("Currently Travesing to next city : " + citiesIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            boolean goingForward = true;

            switch (action){
                case 0:
                    quit = true;
                    System.out.println("Holiday Over, exiting....");
                    break;
                case 1:
                    if(!goingForward){
                        if(citiesIterator.hasNext()){
                            citiesIterator.next();
                        }
                        goingForward = true;
                    }
                    if(citiesIterator.hasNext()){
                        System.out.println("Now visiting next city " + citiesIterator.next());
                        printMenu();
                        break;
                    }else{
                        System.out.println("No more cities to visit...");
                        goingForward = false;
                        break;
                    }
                case 2:
                    if(goingForward) {
                        if(citiesIterator.hasPrevious()) {
                            citiesIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(citiesIterator.hasPrevious()){
                        System.out.println("Now visiting previous city again : " + citiesIterator.previous());
                        printMenu();
                        break;
                    }else{
                        System.out.println("Start the tour first....");
                        goingForward = true;
                        break;
                    }
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Please select 1...");
        System.out.println("0 - Quit \n" +
                "1 - Visit New city \n" +
                "2 - Vitis Previous City \n" +
                "3 - Print Menu");
    }


}
