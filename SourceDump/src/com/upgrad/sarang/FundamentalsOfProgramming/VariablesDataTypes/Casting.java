package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {

        float x;
        int y;
        float z;

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        float f = input.nextFloat();
        double d = input.nextDouble();
        x = (float) a;
        y = (int) f;
        z = (float) d;
        System.out.print("x="+x+" ");
        System.out.print("y="+y+" ");
        System.out.print("z="+z);

    }
}
