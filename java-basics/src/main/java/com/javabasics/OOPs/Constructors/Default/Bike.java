package com.javabasics.OOPs.Constructors.Default;

//  Constructor is a block of code similar to method. It is called when an instance of the class is created
//  It is a special type of method used to initialize the object
//  Every time an object is created using the new() keyword, at least one constructor is called
//  Default constructor is created, when there is no constructor is available in the class

public class Bike {

    Bike() {        // creating default constructor
        System.out.println("Bike is created");
    }

    public static void main(String[] args) {

        Bike bike = new Bike();         // calling default constructor
    }
}
