package com.javabasics.OOPs.Methods.Static;

//  Static methods are associated with class itself i.e., they can be called using "class name"
//  Static methods does not require to create an instance of a class

public class Company {

    public static String name(String name) {
        return name;
    }

    public static void main(String[] args) {

        String companyName = Company.name("Apple Inc.");
        System.out.println(companyName);
    }
}
