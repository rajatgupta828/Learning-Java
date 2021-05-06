package com.rajat.oopsConcepts.Composition;

public class Monitor {
    private String model;
    private String manufacturer;
    private Resolution resolution;

    public Monitor(String model, String manufacturer, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
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

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public void showImage(int x, int y, String color){
        System.out.println("Showing Image at :" + x + "," + "y" + " in color : " + color) ;
    }
}
