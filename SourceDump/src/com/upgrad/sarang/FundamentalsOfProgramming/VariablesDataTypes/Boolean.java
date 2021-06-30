package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int myAge;
        int ageOfBrother;
        boolean isEligibleForDiscount;
        myAge = input.nextInt();
        ageOfBrother = input.nextInt();
        isEligibleForDiscount = (myAge > 0 && ageOfBrother > 0 && myAge < 25 & ageOfBrother < 25);
        System.out.println(isEligibleForDiscount);
    }
}
