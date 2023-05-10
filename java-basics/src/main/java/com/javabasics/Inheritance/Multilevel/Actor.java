package com.javabasics.Inheritance.Multilevel;

public class Actor extends Singer {

    public static void main(String[] args) {
        Actor actor = new Actor();
        System.out.println("Actor does: ");
        actor.sing();
        actor.dance();
    }
}
