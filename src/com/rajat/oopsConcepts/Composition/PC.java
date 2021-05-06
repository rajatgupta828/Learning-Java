package com.rajat.oopsConcepts.Composition;

public class PC {

    /*
    Composition basically deals with the has a relation ship example below :
    We are not using Inheritence as we can only extend 1 class, in this case we have included all 3 classes
     */
    private Casing casing;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Casing casing, Monitor monitor, MotherBoard motherBoard) {
        this.casing = casing;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Casing getCasing() {
        return casing;
    }

    public void setCasing(Casing casing) {
        this.casing = casing;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
}
