package com.javabasics.Collections.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

//  List interface provides the facility to maintain the ordered collection
//  It contains index-based methods to insert,update,delete and search elements
//  It can have duplicate elements, and we can also store the null elements in the list

//  LinkedList is a class in java that implements the List interface
//  It implements LinkedList data structure which is a linear data structure
//  In LinkedList elements are not stored in contiguous locations and every element is a seperate object with data part and address part
//  LinkedList is part of Collections Framework in java

public class Numbers {

    public static void main(String[] args) {

        // LinkedList to store numbers
        List<Integer> numbers = new LinkedList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // iterating over the list
        for (int number : numbers) {
            System.out.println(number);
        }

        // checking if list contains required element
        boolean contains = numbers.contains(20);
        System.out.println("Does list contain number 20? " + contains);

        // multiplying the ith (i.e., 3) element
            int thirdElement = numbers.get(2) * 10;
            System.out.println(thirdElement);
    }
}
