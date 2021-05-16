package com.rajat.InterfacesAndInnerClasses.Interfaces;

public class MobilePhone implements Itelephone,IRingtone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber, boolean isRinging, boolean isOn) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
        this.isOn = isOn;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public boolean isRinging() {
        return isRinging;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
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
    public void ringRing() {
        System.out.println("Tring Tring...");
    }
}
