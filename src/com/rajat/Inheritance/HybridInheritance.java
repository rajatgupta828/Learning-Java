package com.rajat.Inheritance;

class A extends C{
    public static void aprint(){
        System.out.println("Printing from A class...");
    }

    public void nonstaticaprint(){
        System.out.println("Printing from A - non static class...");
    }

}
class B extends A{
    public static void bprint(){
       System.out.println("Printing from A class...");
       cprint();
    }

}

class C{
    public static void cprint(){
        System.out.println("Printing from class C...");
    }
}

public class HybridInheritance extends B {

    public static void main(String[] args) {

        A obj = new A();
        obj.nonstaticaprint();
        aprint();
        bprint();
    }
}
