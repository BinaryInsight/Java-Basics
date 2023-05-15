package com.javabasics.OOPs.Methods.NonStatic;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void personDetails() {
        System.out.println("Name: " + name  + "\n" + "Age: " + age);
    }
}
