package com.javabasics.Collections.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

//  Map interface represents a collection of key-value pairs. It contains values on the basis of "key"
//  Each key-value pair is know as "entry"
//  Map contains unique keys (no duplicate keys) but different keys can have same value associated with them
//  Map is useful when we need to search, update, delete elements on the basis of key
//  Map implementations provide efficient lookup operations. Given a key, we can quickly retrieve the associated value

//  LinkedHashMap is a HashTable and LinkedList implementation of Map interface
//  LinkedHashMap is more efficient compared to other map implementations, when order is important
//  It may have one null key and multiple null values
//  Unlike HashMap, LinkedHashMap maintains insertion order

public class Books {

    public static void main(String[] args) {

        // LinkedHashMap to store book details
        Map<String,Integer> books = new LinkedHashMap<>();

        // adding key-value pairs to the map
        books.put("Lord of the Rings", 2001);
        books.put("The Witcher", 2005);
        books.put("Harry Potter", 2003);
        books.put("Chronicles of Narnia", 2004);
        books.put("The Hunger Games", 2005);

        // accessing values using keys
        int yearOfHarryPotter = books.get("Harry Potter");
        System.out.println("Year of Harry Potter: " + yearOfHarryPotter);

        // iterating over the map
        System.out.println("Books Details:");
        for (Map.Entry<String,Integer> book : books.entrySet()) {
            String title = book.getKey();
            int year = book.getValue();
            System.out.println(title + ": " + year);
        }
    }
}
