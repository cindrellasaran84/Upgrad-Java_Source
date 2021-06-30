package com.upgrad.sarang.FundamentalsOfProgramming.Conditional;

import java.util.Scanner;

public class SignOfANumber {
    public static void main(String[] args) {

        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        if(n < 0) {
            System.out.println("The number entered is negative");
        }
        else {
            System.out.println("The number entered is positive");
        }
    }
}
