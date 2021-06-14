package com.rajat.CollectionsInJava.LinkedAndSortedCollections;

public class Runner {

    private static StockList bigBazarList = new StockList();

    public static void main(String[] args) {
        ItemStock temp = new ItemStock("Bread",30.00,100);
        bigBazarList.addItem(temp);

        temp = new ItemStock("Eggs",180.00,30);
        bigBazarList.addItem(temp);

        temp = new ItemStock("Jam",60.00,100);
        bigBazarList.addItem(temp);

        System.out.println(bigBazarList);
    }
}
