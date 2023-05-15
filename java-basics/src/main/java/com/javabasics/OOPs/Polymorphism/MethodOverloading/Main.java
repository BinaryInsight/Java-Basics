package com.javabasics.OOPs.Polymorphism.MethodOverloading;

//  Method Overloading allows us to define multiple methods in a class with same name but different parameters

public class Main {

    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        System.out.println(calculate.add(15,20));
        System.out.println(calculate.add(100,200,300));

    }
}
