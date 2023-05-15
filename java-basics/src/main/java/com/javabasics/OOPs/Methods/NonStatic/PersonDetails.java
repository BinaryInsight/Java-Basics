package com.javabasics.OOPs.Methods.NonStatic;

//  Non-Static methods are associated with the "instance" of a class
//  Non-Static methods can only be called on an "object" created from the class

public class PersonDetails {

    public static void main(String[] args) {

        Person person = new Person("Mark",30);
        person.personDetails();

    }
}
