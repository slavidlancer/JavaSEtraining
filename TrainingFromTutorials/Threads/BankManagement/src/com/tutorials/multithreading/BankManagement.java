package com.tutorials.multithreading;

public class BankManagement {
    public static void main(String[] args) {
        Account accountOne = new Account();
        Account accountTwo = new Account();
        
        System.out.println(accountOne.getAmmount());
        System.out.println(accountTwo.getAmmount());
        
        Bank.deposit(accountOne, 100d);
        Bank.deposit(accountTwo, 500d);
        
        System.out.println(accountOne.getAmmount());
        System.out.println(accountTwo.getAmmount());
    }
}
