package com.javabasics.Objects.Constructor;

// Initialize Object through a Constructor
public class PersonDetails {

    public static void main(String[] args) {

        Person p1 = new Person("Tom",22,"Chicago",12345L);
        Person p2 = new Person("Dick",23,"Houston",67890L);
        Person p3 = new Person("Harry",24,"California",12890L);
        p1.getPerson();
        p2.getPerson();
        p3.getPerson();
    }
}
