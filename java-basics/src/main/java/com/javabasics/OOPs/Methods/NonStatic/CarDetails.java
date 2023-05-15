package com.javabasics.OOPs.Methods.NonStatic;

//  Non-Static methods are associated with the "instance" of a class
//  Non-Static methods can only be called on an "object" created from the class

public class CarDetails {

    public static void main(String[] args) {

        Car car = new Car("Porsche",15000000L);
        car.getCarDetails();
    }
}
