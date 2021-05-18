package com.rajat.InterfacesAndInnerClasses.Innerclasses.nonStaticNestedClass;

public class Runner {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);

        /* If class was public
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
//        Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
        System.out.println(first.driveSpeed(1000));
        */

        mcLaren.addGear(1,18.2);
        mcLaren.addGear(2,36.2);
        mcLaren.addGear(3,72.2);
        mcLaren.operateClutch(true);

        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);

        double speed = mcLaren.wheelSpeed(3000);
        System.out.println(speed);

        mcLaren.changeGear(3);

    }
}
