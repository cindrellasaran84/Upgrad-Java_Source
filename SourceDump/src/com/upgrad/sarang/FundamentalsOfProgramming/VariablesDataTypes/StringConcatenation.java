package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {

        String name;
        int year;
        Scanner input= new Scanner(System.in);
        name=input.nextLine();
        year=input.nextInt();

        int yearOfGraduation;
        yearOfGraduation=year+4;
        System.out.println("Hello "+name);
        System.out.println("Free services till:"+yearOfGraduation);

    }
}


