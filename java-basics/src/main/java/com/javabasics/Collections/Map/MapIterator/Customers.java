package com.javabasics.Collections.Map.MapIterator;

import java.util.HashMap;
import java.util.Map;

public class Customers {

    int id;
    String name;

    public Customers(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {

        Map<Integer,String> customers = new HashMap<>();
        customers.put(1,"Kelly");
        customers.put(2,"Mitchell");
        customers.put(3,"Sandra");
        customers.put(4,"Veronica");
        customers.put(5,"Kiara");

        for(Map.Entry<Integer,String> entry : customers.entrySet()) {       // Iterating Map using for-each
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        customers.entrySet().stream().forEach(customer -> {     // Iterating Map using stream api
            System.out.println(customer.getKey() + " " + customer.getValue());
        });

    }
}
