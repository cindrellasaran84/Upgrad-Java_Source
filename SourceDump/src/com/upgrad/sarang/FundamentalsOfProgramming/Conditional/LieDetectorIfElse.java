package com.upgrad.sarang.FundamentalsOfProgramming.Conditional;

import java.util.Scanner;

public class LieDetectorIfElse {
    public static void main(String[] args) {

        int X,Y,A,B,heartRate;
        Scanner input= new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextInt();
        A=input.nextInt();
        B=input.nextInt();
        heartRate=input.nextInt();
        if ((X + 5) > 30) {
            System.out.println("The person is telling the truth.");
        } else if ((A > 3) || (B < 6)) {
            System.out.println("The person is telling the truth.");
        } else if (heartRate == 70 && X > 3) {
            System.out.println("The person is telling the truth.");
        } else {
            System.out.println("The person is lying");
        }

    }
}
