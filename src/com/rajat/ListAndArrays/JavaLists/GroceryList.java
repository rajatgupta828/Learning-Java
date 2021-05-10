package com.rajat.ListAndArrays.JavaLists;

import java.util.ArrayList;

public class GroceryList {

    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        // Add Items
        addItems("Milk");
        addItems("Eggs");
        addItems("Veggies");
        addItems("Cheese");
        addItems("baby Items");

        printList(groceryList);

        updateList(3,"Butter");

        printList(groceryList);

        removeItem("baby Items");

        printList(groceryList);

        findItem("Butter");

        printList(groceryList);
    }

    public static void addItems(String itemname){
        groceryList.add(itemname);
    }

    public static void printList(ArrayList<String> myArrayList){
        for (int i = 0; i < myArrayList.size() ; i++){
            System.out.println("Item in your list : " + myArrayList.get(i));
        }
    }

    public static void updateList(int position, String item){
        groceryList.set(position,item);
        System.out.println("Grocery item : " + item + " has been modified at position " + position);
        printList(groceryList);
    }

    public static void removeItem(String item){
        int position = groceryList.indexOf(item);

        groceryList.remove(position);

        System.out.println("Item " + item + " has been removed");
        printList(groceryList);
    }

    public static boolean findItem(String searchItem){
        // To Check if element exists
        boolean doesContain = groceryList.contains(searchItem);

        // To find index of element
        int position = groceryList.indexOf(searchItem);
        System.out.println("Item is present at : " + position);

        // To get the item at a particular position
        if(position >= 0){
            System.out.println("Item found : " + groceryList.get(position));
        }else{
            System.out.println("Item not found....");
        }

        return doesContain;
    }
}
