package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;

import java.util.Scanner;

public class PlaceValues {
    public static void main(String[] args) {


        //Create new scanner
        Scanner input = new Scanner(System.in);

        //Values of each digit
        int tenThousands, thousands, hundreds, tens, ones;

        //Prompt user to input 5 digit number

        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("\nError! Number more than 5 digits.");
        }
        else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        }
        else if (10000<=number&&number<=99999){
            ones = number % 10;
            number = number / 10;
            tens = number % 10;
            number = number / 10;
            hundreds = number % 10;
            number = number / 10;
            thousands = number % 10;
            number = number / 10;
            tenThousands = number % 10;
            System.out.println(tenThousands);
            System.out.println(thousands);
            System.out.println(hundreds);
            System.out.println(tens);
            System.out.println(ones);
        }
    }
}
