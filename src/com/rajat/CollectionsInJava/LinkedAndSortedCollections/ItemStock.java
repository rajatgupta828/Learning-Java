package com.rajat.CollectionsInJava.LinkedAndSortedCollections;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Objects;

public class ItemStock implements Comparable<ItemStock>{

    private final String name;
    private double price;
    private int quantityStock = 0;

    public ItemStock(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public ItemStock(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(this.price > 0.0){
            this.price = price;
        }
    }

    public void adjustStock(int quantityStock) {
        int newQuantity = this.quantityStock + quantityStock;
        if(newQuantity > 0){
            this.quantityStock = quantityStock;
        }
    }

    @Override
    public int compareTo(ItemStock o) {
        System.out.println("Entering StockItem Compareto");
        if(this == o){
            return 0;
        }
        if(o != null){
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        ItemStock itemStock = (ItemStock) o;
        return this.name.equals(itemStock.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.name + " : Price - " + this.price + " , Quantity in Stock : " + this.getQuantityStock();
    }
}
