package com.javabasics.OOPs.Variables.Static;

//  Static Variables are shared among all instances of a class and belongs to the class itself
//  Static Variables are used to keep track of how many "instances" of a class have been created

public class Car {

    private static int numberOfCars = 0;

    public Car() {
        numberOfCars++;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        System.out.println(Car.getNumberOfCars());
    }
}
