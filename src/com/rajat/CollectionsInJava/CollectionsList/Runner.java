package com.rajat.CollectionsInJava.CollectionsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Theatre inox = new Theatre("INOX",8,12);

        //System.out.println(inox.getSeats());

        if (inox.reserveSeat("D12")){
            System.out.println("Please Pay");
        }else {
            System.out.println("Seat Taken !!");
        }

        if (inox.reserveSeat("G12")){
            System.out.println("Please Pay");
        }else {
            System.out.println("Seat Taken !!");
        }

        showList((List<Theatre.Seat>) inox.getSeats());

        // Checking the Comparator method
        List<Theatre.Seat> priceList = new ArrayList<>(inox.getSeats());

        // Add a new class in inner class
        priceList.add(inox.new Seat("V01",1299));
        priceList.add(inox.new Seat("V02",1299));

        Collections.sort(priceList,Theatre.PRICE_ORDER);
        showList(priceList);
    }

    public static void showList(List<Theatre.Seat> list ){
        for (Theatre.Seat seat : list){
            System.out.print("Seat Number : " + seat.getSeatNumber() + " ");
            System.out.print("Price : " + seat.getPrice() + "|");

        }
        System.out.println();
        System.out.println("==========================");
    }
}
