package com.javabasics.OOPs.Methods.Static;

//  Static methods are associated with class itself i.e., they can be called using "class name"
//  Static methods does not require to create an instance of a class

public class Addition {

    public static int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {

        int result = Addition.add(10,15);
        System.out.println(result);
    }
}
