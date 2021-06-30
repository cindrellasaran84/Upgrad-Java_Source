package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;
import java.util.Scanner;
public class UserInputVariable {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a = input.nextInt();
        System.out.println("Enter the value of b ");
        b = input.nextInt();
        System.out.println("Enter the value of c ");
        c = input.nextInt();
        System.out.println(a * b + c);
    }
}
