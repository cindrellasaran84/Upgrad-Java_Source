package com.upgrad.sarang.FundamentalsOfProgramming.Conditional;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        if(n%2 == 0) {
            System.out.println("The number entered is even");
        }
        else {
            System.out.println("The number entered is odd");
        }
    }
}
