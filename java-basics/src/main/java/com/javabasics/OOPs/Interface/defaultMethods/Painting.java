package com.javabasics.OOPs.Interface.defaultMethods;


// default methods were introduced in java 8, before that interfaces could only have abstract methods
// default methods allow the interfaces to have methods with implementation without affecting the classes that implement the interface

public interface Painting {

    void ink();

    default void paint() {
        System.out.println("painting");
    }
}
