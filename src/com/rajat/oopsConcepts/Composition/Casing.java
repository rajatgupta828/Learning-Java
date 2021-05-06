package com.rajat.oopsConcepts.Composition;

public class Casing {
    private String model;
    private String manufacturer;
    private Dimension dimension;

    public Casing(String model, String manufacturer, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimension = dimension;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public void powerOff(){
        System.out.println("Powering off....");

    }

    public void powerOn(){
        System.out.println("Powering on.....");
    }
}
