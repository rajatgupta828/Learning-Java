package com.rajat.InterfacesAndInnerClasses.Interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {

        Itelephone deskPhone = new DeskPhone(99406,true);

        deskPhone.callPhone(99406);
        deskPhone.dialPhone(12345);
        deskPhone.answer();
        deskPhone.powerOn();
        deskPhone.switchOff();
        boolean checkIfRinging = deskPhone.isRinging();
        System.out.println("Checking if Phone is ringing : " + checkIfRinging);


    }
}
