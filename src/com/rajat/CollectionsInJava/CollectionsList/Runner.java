package com.rajat.CollectionsInJava.CollectionsList;

public class Runner {

    public static void main(String[] args) {
        Theatre inox = new Theatre("INOX",5,2);

        inox.getSeats();
        if (inox.reserveSeat("A02")){
            System.out.println("Please Pay");
        }else {
            System.out.println("Seat Taken !!");
        }
        if (inox.reserveSeat("A02")){
            System.out.println("Please Pay");
        }else {
            System.out.println("Seat Taken !!");
        }
    }
}
