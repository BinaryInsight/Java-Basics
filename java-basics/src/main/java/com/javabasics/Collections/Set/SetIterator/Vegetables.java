package com.javabasics.Collections.Set.SetIterator;


import java.util.HashSet;
import java.util.Set;

public class Vegetables {

    String name;
    int quantity;

    public Vegetables(String name, int quantity) {
        this.name=name;
        this.quantity=quantity;
    }

    public static void main(String[] args) {

        Set<Vegetables> vegetables = new HashSet<>();
        Vegetables v1 = new Vegetables("Potato", 2);
        Vegetables v2 = new Vegetables("Beetroot", 1);
        Vegetables v3 = new Vegetables("Cauliflower", 2);
        Vegetables v4 = new Vegetables("Brinjal", 3);
        Vegetables v5 = new Vegetables("Carrot", 5);

        vegetables.add(v1);
        vegetables.add(v2);
        vegetables.add(v3);
        vegetables.add(v4);
        vegetables.add(v5);

        for(Vegetables v : vegetables) {            // Iterating Set using for-each
            System.out.println(v.name + " " + v.quantity);
        }

        vegetables.stream().forEach(vegetables1 -> {        // Iterating Set using stream api
            System.out.println(vegetables1.name + " " + vegetables1.quantity);
        });
    }
}



