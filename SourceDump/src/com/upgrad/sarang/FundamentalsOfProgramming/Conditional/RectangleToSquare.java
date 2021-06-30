package com.upgrad.sarang.FundamentalsOfProgramming.Conditional;

import java.util.Scanner;

public class RectangleToSquare {
    public static void main(String[] args) {

        int length,breadth;
        Scanner input = new Scanner(System.in);
        length=input.nextInt();
        breadth=input.nextInt();
        if(length < 1 || breadth < 1) {
            System.out.println("Not a quadrilateral");
        }
        else if(length == breadth) {
            System.out.println("Square");
        }
        else {
            System.out.println("Rectangle");
        }
    }
}
