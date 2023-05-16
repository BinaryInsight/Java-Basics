package com.javabasics.Collections.Set.HashSet;

import java.util.Set;

//  Set interface represents an unordered collection of unique elements
//  It does not allow duplicate elements, and does not maintain the insertion order of elements

//  HashSet is a class in java that implements Set interface
//  It represents the collection that uses a hash table for storage

public class Fruits {

    public static void main(String[] args) {

        // Fruits to store strings
        Set<String> fruits = new java.util.HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Watermelon");

        // adding a duplicate element to the set
        boolean duplicateFruit = fruits.add("Apple");   // return false, as set does not allow duplicate elements
        System.out.println("Duplicate element added: " + duplicateFruit);

        // accessing elements of set
        System.out.println("Set elements: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // removing element from set
        boolean removedElement = fruits.remove("Watermelon");
        System.out.println("Removed element: " + removedElement);

        // checking if the set contains required element
        boolean containsMango = fruits.contains("Mango");
        System.out.println("Does the set contain Mango? " + containsMango);

        // checking if the set is empty
        System.out.println("Is the set empty?" + fruits.isEmpty());

    }
}
