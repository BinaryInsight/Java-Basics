package com.javabasics.OOPs.Methods.NonStatic;

public class Car {

    private String name;
    private Long price;

    public Car(String name, Long price) {
        this.name=name;
        this.price=price;
    }

    public void getCarDetails() {
        System.out.println("Name: " + name + "\n" + "Price: " + price);
    }
}
