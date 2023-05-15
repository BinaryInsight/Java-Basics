package com.javabasics.Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

//  Map interface represents a collection of key-value pairs. It contains values on the basis of "key"
//  Each key-value pair is know as "entry"
//  Map contains unique keys (no duplicate keys) but different keys can have same value associated with them
//  Map is useful when we need to search, update, delete elements on the basis of key
//  Map implementations provide efficient lookup operations. Given a key, we can quickly retrieve the associated value

//  HashMap is a collection class that implements the Map interface. It stores key-value pairs and provides efficient lookup operations
//  HashMap uses hash table data structure to store and retrieve elements based on their hash codes
//  HashMap allows null values and a single null key i.e., we can store a null value and use null as a key in the map
//  HashMap does not maintain insertion order

public class Students {

    public static void main(String[] args) {

        // HashMap to store students details with key-value pairs
        Map<String,Integer> students = new HashMap<>();

        students.put("Angus", 12);
        students.put("Jimmy", 14);
        students.put("David", 13);
        students.put("James", 10);
        students.put("Yuri", 15);

        // accessing values using keys
        int yuriAge = students.get("Yuri");
        System.out.println("Yuri's age: " + yuriAge);

        // checking if a key exists
        boolean containsJack = students.containsKey("Jack");
        System.out.println("Does the map contain Jack? " + containsJack);

        // updating a value
        students.put("David", 15);

        // removing key-value pair
        students.remove("James");

        // iterating over the map
        System.out.println("Students details:");
        for(Map.Entry<String, Integer> student : students.entrySet()) {
            String name = student.getKey();
            int age = student.getValue();
            System.out.println(name + ": " + age);
        }

        // checking the size of the map
        System.out.println("Size of the map: " + students.size());

        // clearing the map
        students.clear();
        System.out.println("Map after clearing: " + students);

        // checking if the map is empty
        System.out.println("Is the map empty? " + students.isEmpty());

    }
}
