package com.javabasics.ExceptionHandling;

//  In java, we can create our own custom exceptions by extending the built-in exception class or its subclasses
//  Custom Exceptions allows us to define exception types that are specific to our applications

public class CustomException {

    public static void withdrawMoney(int balance, int amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("Insufficient Funds. Available balance: " + balance);
        } else {
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        try {
            withdrawMoney(100,200);
        } catch (InsufficientFundsException ex) {
            System.out.println("Withdraw failed: " + ex.getMessage());
        }
    }
}
