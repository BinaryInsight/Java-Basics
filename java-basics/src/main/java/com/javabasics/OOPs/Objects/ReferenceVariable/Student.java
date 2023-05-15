package com.javabasics.OOPs.Objects.ReferenceVariable;

// PersonDetails method within the Class
// Initializing through a Reference Variable (student)

public class Student {

    int id=123;
    String name="abc";

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }

}
