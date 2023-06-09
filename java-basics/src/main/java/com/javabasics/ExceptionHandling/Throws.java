package com.javabasics.ExceptionHandling;

//  Throws keyword is used in method declaration to indicate that a method may throw one or more exceptions
//  It gives information to the programmer that there may occur an exception

public class Throws {

    public static void performDivision(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        System.out.println("Result: " + (num1/num2));
    }

    public static void main(String[] args) {

        try {
            performDivision(10,0);
        } catch (ArithmeticException a) {
            System.out.println("An error occurred: " + a.getMessage());
        }
    }
}
