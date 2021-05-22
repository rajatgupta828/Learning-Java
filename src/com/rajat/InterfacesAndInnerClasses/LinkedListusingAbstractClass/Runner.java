package com.rajat.InterfacesAndInnerClasses.LinkedListusingAbstractClass;

public class Runner {

    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation(null);

        System.out.println("Before inserting any data in the List...");
        list.traverse(list.getRoot());

        String strdata = "Delhi Chennai Bangalore Pune Noida Gurgaon Delhi";

        String[] data = strdata.split(" ");

        for(String s : data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());

    }
}
