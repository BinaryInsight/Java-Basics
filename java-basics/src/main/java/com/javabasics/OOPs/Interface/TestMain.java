package com.javabasics.OOPs.Interface;

//  Interface in java is a blueprint of a class. It has abstract methods
//  Interface in java is used to achieve abstraction.
//  Interface can have only abstract methods, not method body
//  Multiple inheritance can be achieved using interfaces

public class TestMain {

    public static void main(String[] args) {

        Drawing drawing = new Circle();
        drawing.draw();

        Drawing drawing1 = new Rectangle();
        drawing1.draw();
    }
}
