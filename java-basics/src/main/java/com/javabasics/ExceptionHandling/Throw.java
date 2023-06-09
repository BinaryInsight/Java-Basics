package com.javabasics.ExceptionHandling;

//  Throw keyword is used to explicitly throw an exception
//  It allows you to create and throw custom exceptions to the caller
//  The throw statement in typically used within the try block to handle exceptional scenarios

public class Throw {

    public static void validate(int age) {
        if(age < 18) {
            throw new ArithmeticException("Person is not eligible to Vote");  //  prints custom exception message
        } else {
            System.out.println("Person is eligible to Vote");
        }
    }

    public static void main(String[] args)  {
        try {
            validate(13);                       // gives arithmetic exception
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        } finally {
            System.out.println("Validation completed");
        }
    }
}
