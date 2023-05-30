package com.javabasics.OOPs.Interface.MultipleInheritanceWithInterface;

public class Company implements Electrical,Mechanical,Software {

    @Override
    public void typeA() {
        System.out.println("This is a Mechanical Company");
    }

    @Override
    public void typeB() {
        System.out.println("This is an Electrical Company");
    }

    @Override
    public void typeC() {
        System.out.println("This is a Software Company");
    }
}
