package com.javabasics.OOPs.Encapsulation;

//  Encapsulation allows us to hide the implementation details of a class (BankAccount)
//  Encapsulation also restricts access to its data members and methods

public class BankDetails {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(123,10000.0);

        System.out.println("Account number: " + bankAccount.getAccountNumber());
        System.out.println("Initial balance: " + bankAccount.getBalance());

        bankAccount.deposit(5000.0);
        System.out.println("Balance after deposit: " + bankAccount.getBalance());

        bankAccount.withdraw(2500.0);
        System.out.println("Balance after withdraw: " + bankAccount.getBalance());
    }
}
