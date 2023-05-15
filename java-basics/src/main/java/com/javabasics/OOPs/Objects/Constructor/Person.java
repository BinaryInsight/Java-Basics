package com.javabasics.OOPs.Objects.Constructor;

// Initialize Object through a Constructor
public class Person {

    String name;
    int age;
    String city;
    Long phone;

    public Person(String name, int age, String city, Long phone) {
        this.name=name;
        this.age=age;
        this.city=city;
        this.phone=phone;
    }

    void getPerson() {
        System.out.println(name+" "+age+" "+city+" "+phone);
    }
}
