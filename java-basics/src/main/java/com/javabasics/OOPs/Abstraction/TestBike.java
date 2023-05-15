package com.javabasics.OOPs.Abstraction;

//  Abstraction is a process of hiding the implementation details/method body and showing only functionaly to the user
//  Abstraction does not provide complete (100%) of hiding the implementation, Interfaces does
//  Providing implementation to methdods in child class instead of parent class

public class TestBike {

    public static void main(String args[]){
        Bike bike = new Honda();
        bike.run();
        bike.changeGear();
    }
}
