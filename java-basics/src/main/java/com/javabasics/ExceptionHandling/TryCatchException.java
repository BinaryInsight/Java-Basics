package com.javabasics.ExceptionHandling;

//  Exception Handling in java allows you to handle runtime errors, known as exceptions in controlled manner
//  It helps you to catch and deal with the exceptional situations that may occur during execution
//  The try-catch allows you to define a block of code to be tested for exceptions while executing

public class TryCatchException {

    public static void main(String[] args) {

        int number = 100;
        int divisor = 0;
        String name = null;

        try {
            int result = number / divisor;
        } catch (ArithmeticException e) {       // gives arithmetic exception
            System.out.println(e);
        }

        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {      // gives null pointer exception
            System.out.println(e);
        }
    }
}
