package com.javabasics.ExceptionHandling;

//  A try block can be followed by one or more catch blocks
//  Each catch block must contain a different exception handler
//  At a time only one catch block is executed and must be in order
//  Inorder to print multiple exceptions you need to use multiple try-catch blocks

public class MultipleCatch {

    public static int divide(int num1, int num2) {
        return num1/num2;
    }

    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[5]);

            int result = divide(10, 0);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds ---> " + e.getMessage()); // only this is caught
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zero ---> " + e.getMessage());
        }

        // Use multiple try-catch to print each exception separately
    }
}
