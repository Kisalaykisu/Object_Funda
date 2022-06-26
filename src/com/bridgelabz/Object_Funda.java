package com.bridgelabz; // package

import java.util.Scanner;  //Import Scanner
public class Object_Funda {
    static double accountBalance;
    public static void main(String[] args){ //Entry Point Of program
        Object_Funda obj = new Object_Funda();  //Obj creation
        Scanner sc = new Scanner(System.in);    // Make Scanner obj
        System.out.println("Enter the account balance: ");
        accountBalance = sc.nextDouble();  //Input Double
        obj.debit();
        System.out.println("Account Balance = " + accountBalance);
    }

    /**
     * debit method to debit amount from the account balance
     */
    public void debit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the debit amount: ");
        int debitAmount = sc.nextInt();
        if (debitAmount < accountBalance) {
            accountBalance -= debitAmount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }

    }
}