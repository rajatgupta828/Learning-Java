package com.rajat.CollectionsInJava.CollectionsList;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Theatre inox = new Theatre("INOX",8,12);

        inox.getSeats();
        /*if (inox.reserveSeat("A02")){
            System.out.println("Please Pay");
        }else {
            System.out.println("Seat Taken !!");
        }
        if (inox.reserveSeat("A02")){
            System.out.println("Please Pay");
        }else {
            System.out.println("Seat Taken !!");
        }*/

        ArrayList<Theatre.Seat> seatsCopy;
        seatsCopy = new ArrayList<Theatre.Seat>(inox.getSeats());
        getSeats(seatsCopy);

        seatsCopy.get(1).reserve();
        if(inox.reserveSeat("A02")){
            System.out.println("Please pay for reserved seat");
        }else{
            System.out.println("Seat already Taken...");
        }

        // Using the reverse method
        Collections.reverse(seatsCopy);

        System.out.println("Printing the seats copy array");
        getSeats(seatsCopy);
        System.out.println("Printing the Inox seats");
        getSeats(inox.seats);

        // Using the Shuffle method
        System.out.println("Doing the Shuffle");
        Collections.shuffle(seatsCopy);
        getSeats(seatsCopy);

        // Using the min and max
        Theatre.Seat minSeat = Collections.min(seatsCopy);
        Theatre.Seat maxSeat = Collections.max(seatsCopy);

        System.out.println("Minumim Seat  Number : " + minSeat.getSeatNumber());
        System.out.println("Maximum Seat  Number : " + maxSeat.getSeatNumber());

        // Sorting using the bubble sort we have written
        sortList(seatsCopy);
        System.out.println("Printing the seats copy array after the bubble sort");
        getSeats(seatsCopy);

    }

    public static void getSeats(ArrayList<Theatre.Seat> seats){

        for(Theatre.Seat seat: seats){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
    }

    // Bubble sort
    public static void sortList(List<? extends  Theatre.Seat> incomingList){
        for(int i = 0; i < incomingList.size() - 1; i++){
            for(int j = i+1; j<incomingList.size();j++){
                if(incomingList.get(i).compareTo(incomingList.get(j)) > 0){
                    Collections.swap(incomingList,i,j);
                }
            }
        }
    }
}
