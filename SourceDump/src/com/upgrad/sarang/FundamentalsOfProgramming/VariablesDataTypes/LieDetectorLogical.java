package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;

import java.util.Scanner;

public class LieDetectorLogical {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int X, Y;
        boolean result;
        X = Integer.parseInt(input.nextLine());
        Y = Integer.parseInt(input.nextLine());
        result = (X + Y) > 30;
        System.out.println("The statement said by the person is "+result);
    }
}
