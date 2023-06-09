package com.javabasics.ExceptionHandling;

/*  Finally block in exception handling defines a piece of code that will always execute
    regardless of whether an exception occurs or not    */
/*  It ensures that a cleanup operations are performed, ensuring the execution of code
    that should always run regardless of outcome   */
/*  Finally block contains all the necessary statement that needs to be printed
    regardless of the exception occurs or not   */

public class Finally {

    public static int divide(int num1, int num2) {
        return num1/num2;
    }

    public static int multiply(int num1, int num2) {
        return num1*num2;
    }

    public static void main(String[] args) {

        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());     //  exception occurs
        } finally {
            System.out.println("Division is completed");    //  finally block executes
        }
        try {
            int result = multiply(2,5);
            System.out.println(result);
        } finally {
            System.out.println("Multiplication is completed");
        }
    }
}
