package com.upgrad.sarang.FundamentalsOfProgramming.Conditional;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        String name;
        int marks;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        marks = input.nextInt();
        if(marks > 100) {
            System.out.println("The grade scored by "+ name + " is A");
        }
        else if(marks > 80 && marks <=100) {
            System.out.println("The grade scored by "+ name + " is B");
        }
        else if(marks > 60 && marks <=80) {
            System.out.println("The grade scored by "+ name + " is C");
        }
        else if(marks >40 && marks <=60) {
            System.out.println("The grade scored by "+ name + " is D");
        }
        else if(marks <= 40) {
            System.out.println("The grade scored by "+ name + " is E");
        }
        else {
            System.out.println("Invalid marks for Aishwarya");
        }

    }
}
