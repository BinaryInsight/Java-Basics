package com.javabasics.OOPs.Interface.defaultMethods;

//  Interface in java is a blueprint of a class. It has abstract methods
//  Interface in java is used to achieve abstraction.
//  Interface can have only abstract methods, not method body
//  Multiple inheritance can be achieved using interfaces

public class Main {

    public static void main(String[] args) {

        Painting painting = new Oil();
        painting.paint();       // paint() method is implemented from Oil class

        Painting painting1 = new Canvas();
        painting1.paint();      // paint() method is implemented from Canvas class

        Painting painting2 = new Ink();
        painting2.ink();        // ink() method is implemented from ink class
    }
}
