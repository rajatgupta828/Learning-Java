package com.rajat.oopsConcepts.Composition;

public class Dimension {
    private int height;
    private int length;
    private int weight;
    private int width;

    public Dimension(int height, int length, int weight, int width) {
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
