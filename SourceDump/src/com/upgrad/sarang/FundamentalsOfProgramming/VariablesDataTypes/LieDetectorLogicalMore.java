package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;

import java.util.Scanner;

public class LieDetectorLogicalMore {
    public static void main(String[] args) {

        int X,Y,A,B,heartRate;
        boolean result;
        Scanner input= new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextInt();
        A=input.nextInt();
        B=input.nextInt();
        heartRate=input.nextInt();
        result = ((X + Y) > 30) && (A > 3 || B < 6) && (heartRate == 70);
        System.out.println("The statement said by the person is "+result);

    }
}
