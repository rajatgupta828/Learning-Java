package com.rajat.SuperKeyword;

public class Shirts extends Clothing {

    private String collarType;
    private String helm;

    public String getCollarType() {
        return collarType;
    }

    public void setCollarType(String collarType) {
        this.collarType = collarType;
    }

    public String getHelm() {
        return helm;
    }

    public void setHelm(String helm) {
        this.helm = helm;
    }

    /*
    here we are going to use Super Keyword to use the fields from the Super class - Clothing
     */

    public Shirts(String productId, String size, String designer, String price, String collarType, String helm) {
        super(productId, size, designer, price);
        this.collarType = collarType;
        this.helm = helm;
    }

    public void display(){
        System.out.println("Product Id : " + super.getProductId());
        System.out.println("Size: " + super.getSize());
        System.out.println("Designer: " + super.getDesigner());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Collar: " + this.collarType);
        System.out.println("Helm :" + this.helm);

    }
}
