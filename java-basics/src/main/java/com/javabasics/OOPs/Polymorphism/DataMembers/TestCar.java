package com.javabasics.OOPs.Polymorphism.DataMembers;

// Only "Methods" can be Overriden, not Data Memebers

public class TestCar {

    public static void main(String[] args) {
        Car car = new Porsche();
        System.out.println(car.speedlimit); // outputs "150" (Calculate) since Data Members cannot be Overridden
    }
}
