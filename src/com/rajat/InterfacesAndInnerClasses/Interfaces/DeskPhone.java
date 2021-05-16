package com.rajat.InterfacesAndInnerClasses.Interfaces;

public class DeskPhone implements Itelephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    @Override
    public void powerOn() {
        System.out.println("Powering On...");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching Off...");
    }

    @Override
    public void dialPhone(int phoneNumber) {
        System.out.println("Dialing " + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering your phone...");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
