package com.javabasics.Polymorphism.MethodOverriding.Bank;

public class Test {

/*     Here Polymorphism occurs because all the classes (SBI,AXIS,ICICI) inherits from "Bank" class
     and each class calls it's own "getRateOfInterest" method*/

    public static void main(String[] args) {

        Bank bank;

        bank = new SBI();
        System.out.println("SBI Rate of Interest is: " + bank.getRateOfInterest());

        bank = new AXIS();
        System.out.println("AXIS Rate of Interest is: " + bank.getRateOfInterest());

        bank = new ICICI();
        System.out.println("ICICI Rate of Interest is: " + bank.getRateOfInterest());

    }
}
