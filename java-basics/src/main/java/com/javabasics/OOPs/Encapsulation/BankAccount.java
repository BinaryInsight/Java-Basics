package com.javabasics.OOPs.Encapsulation;

public class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;          // Compound assignment i.e., balance = balance + amount
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;      // Compound assignment i.e., balance = balance - amount
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
