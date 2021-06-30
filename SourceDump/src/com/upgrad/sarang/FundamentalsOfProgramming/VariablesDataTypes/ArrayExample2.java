package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;

import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {

        int marks[] = new int[5];
        int index;
        Scanner input= new Scanner(System.in);
        marks[0] = Integer.parseInt(input.nextLine());
        marks[1] = Integer.parseInt(input.nextLine());
        marks[2] = Integer.parseInt(input.nextLine());
        marks[3] = Integer.parseInt(input.nextLine());
        marks[4] = Integer.parseInt(input.nextLine());
        index = Integer.parseInt(input.nextLine());
        System.out.println("The student with roll number "+index+" has scored "+marks[index]+" marks");
    }
}
