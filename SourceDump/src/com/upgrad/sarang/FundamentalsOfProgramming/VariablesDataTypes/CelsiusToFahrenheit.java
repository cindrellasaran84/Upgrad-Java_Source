package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c, f;
        System.out.println("Enter the value of Celsius ");
        c = input.nextInt();
        f = (c * 9/5) + 32;
        System.out.println(f);
    }
}
