package com.rajat.SuperKeyword;

public class UsingInstanceOf {

    static Clothing garment1 = new Shirts("001","M",
            "main", "1000","stand","round");

    static Clothing garment2 = new Trousers("001","M","Blackberry","999",
            "32","tapered");

    public static void main(String[] args) {
        //******Casting Example ******************
        // cast garment1 to a shirt
        String collar = ((Shirts)garment1).getCollarType();
        System.out.println("Collar Type : " + collar);

        // ******* Instance of example
        if(garment2 instanceof Shirts){
            System.out.println("Item is shirt");
        }else{
            System.out.println("Item is trouser");
        }
    }
}
