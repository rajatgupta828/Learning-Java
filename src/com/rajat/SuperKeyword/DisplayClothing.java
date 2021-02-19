package com.rajat.SuperKeyword;

public class DisplayClothing {
    private static Shirts newShirt = new Shirts("shirt1","M","RalpLauren","1200",
            "mandarin","round");
    private static Trousers newTrouser = new Trousers("trouser1", "32","nike","2000","32",
            "tapered");

    public static void main(String[] args) {
        newShirt.display();
    }
}
