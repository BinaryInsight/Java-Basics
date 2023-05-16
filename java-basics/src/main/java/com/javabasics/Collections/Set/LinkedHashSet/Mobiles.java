package com.javabasics.Collections.Set.LinkedHashSet;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

//  Set interface represents an unordered collection of unique elements
//  It does not allow duplicate elements, and does not maintain the insertion order of elements

//  LinkedHashSet is a class in java that represents the LinkedList implementation of Set interface
//  It extends the HashSet class and implements Set interface
//  It maintains insertion order and permits null elements unlike HashSet

public class Mobiles {

    public static void main(String[] args) {

        // LinkedHashSet to store strings
        Set<String> mobiles = new LinkedHashSet<>();

        mobiles.add("Iphone");
        mobiles.add("Samsung");
        mobiles.add("Oneplus");
        mobiles.add("Huawei");
        mobiles.add("HTC");

        // adding a duplicate element
        boolean duplicateElement = mobiles.add("Oneplus");
        System.out.println(duplicateElement);

        // accessing elements
        System.out.println("Set elements: ");
        for (String mobile : mobiles) {
            System.out.println(mobile);
        }

        // removing element from set
        boolean removedElement = mobiles.remove("HTC");
        System.out.println("Removed element: " + removedElement);

        // checking the size of set
        System.out.println("Size of set: " + mobiles.size());

        // adding null values to set
        mobiles.add(null);
        System.out.println("Updated elements: " + mobiles);


        // clearing the set
        mobiles.clear();
        System.out.println("Set after clearing: " + mobiles);

        // checking if set is empty
        System.out.println("Is the set empty? " + mobiles.isEmpty());

    }
}
