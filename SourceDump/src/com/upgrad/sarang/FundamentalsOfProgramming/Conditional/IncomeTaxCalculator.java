package com.upgrad.sarang.FundamentalsOfProgramming.Conditional;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();

        double tax = 0.0;
        if (income > 250000) {
            if (age < 60) {
                if(income > 250000 && income <= 500000) {
                    tax = tax + (income * 0.1);
                }
                if(income > 500000 && income <= 1000000) {
                    tax = (250000 * 0.1) + ((income - 500000) * 0.2);
                }
                if(income > 1000000) {
                    tax = (250000 * 0.1) + (500000 * 0.2) + ((income - 1000000) * 0.3);
                }

            }
            if (age >= 60 && age < 80) {
                if(income > 500000 && income <= 1000000) {
                    tax = ((income - 500000) * 0.2);
                }
                if(income > 1000000) {
                    tax = (500000 * 0.2) + ((income - 1000000) * 0.3);
                }
            }
            if (age >= 80) {
                if(income > 500000 && income <= 1000000) {
                    tax = ((income - 500000) * 0.2);
                }
                if(income > 1000000) {
                    tax = (500000 * 0.2) + ((income - 1000000) * 0.3);
                }
            }
        }
        System.out.print(tax);
        scan.close();
    }
}
