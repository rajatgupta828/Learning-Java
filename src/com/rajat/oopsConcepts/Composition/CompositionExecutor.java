package com.rajat.oopsConcepts.Composition;

public class CompositionExecutor {

    public static void main(String[] args) {
        /*
        Composing a new PC

         */
        Dimension caseDimension = new Dimension(10,10,13,15);
        Casing dellCasing = new Casing("A525", "Dell",caseDimension);
        Resolution dellResolution = new Resolution(1380,720);
        Monitor dellMonitor = new Monitor("Dell 1525", "Dell",dellResolution);

        MotherBoard motherBoard = new MotherBoard("Intel 889", "Intel", 6, 20);

        PC myPc = new PC(dellCasing,dellMonitor,motherBoard);

        myPc.getMonitor().showImage(1500,1200,"Red");
        myPc.getMotherBoard().loadProgram("My PProgram...");

    }



}
