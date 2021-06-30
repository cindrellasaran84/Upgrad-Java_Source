package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;

import java.util.Scanner;

public class CelsiusToFahrenheitCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;
        float f;

        c = input.nextInt();
        f = (float) (((float)c * 9/5) + 32.0);
        System.out.println(f);
    }
}
