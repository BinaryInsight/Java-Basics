package com.javabasics.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  List interface provides the facility to maintain the ordered collection
//  It contains index-based methods to insert,update,delete and search elements
//  It can have duplicate elements, and we can also store the null elements in the list

//  ArrayList is a class in java that implements the List interface
//  It uses an internal array to store elements and provides dynamic resizing (unlike Arrays)
//  ArrayList is part of the Collections Framework in java

public class EmployeeList {

    public static void main(String[] args) {

        // ArrayList to store employees
        List<String> names = new ArrayList<>();

        names.add("Mark");
        names.add("Steve");
        names.add("Bill");
        names.add("Elon");
        names.add("Larry");

        // size of the list
        System.out.println("Size of list: " + names.size());

        // accessing list of elements
        System.out.println("First element: " + names.get(0));
        System.out.println("Last element: " + names.get(4));

        // modifying list of elements
        names.set(4, "Phil");
        System.out.println("Modified list: " + names);
        System.out.println("Get Modified element: " + names.get(4));

        // removing elements from the list
        names.remove(4);
        System.out.println("Updated list after removal: " + names);

        // iterating over the list
        System.out.println("List of elements: ");
        for(String name: names) {
            System.out.println(name);
        }

        // sorting the list
        Collections.sort(names);
        System.out.println(names);

        // clearing the list
        names.clear();
        System.out.println("List after clearing: " + names);

        // checking if the list is empty
        System.out.println("Is list empty? " +names.isEmpty());

    }
}
