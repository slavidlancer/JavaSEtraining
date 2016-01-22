package com.tutorials.multithreading;

public class Bank {
    /* public static void deposit(Account account, double deposit) {
        double oldAmmount = account.getAmmount();
        double newAmmount = oldAmmount + deposit;
        
        account.setAmmount(newAmmount);
    }*/
    
    /*synchronized public static void deposit(Account account, double deposit) {
        double oldAmmount = account.getAmmount();
        double newAmmount = oldAmmount + deposit;
        
        account.setAmmount(newAmmount);
    }*/
    
    public static void deposit(Account account, double deposit) {
        synchronized (account) {
            double oldAmmount = account.getAmmount();
            double newAmmount = oldAmmount + deposit;
            
            account.setAmmount(newAmmount);
        }
    }
}
