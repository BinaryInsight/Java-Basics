package com.javabasics.OOPs.Abstraction;

abstract class Bike{
    Bike(){
        System.out.println("bike is created");
    }
     abstract void run() ;      // abstract method
    void changeGear(){System.out.println("gear changed");}      // concrete method
}
