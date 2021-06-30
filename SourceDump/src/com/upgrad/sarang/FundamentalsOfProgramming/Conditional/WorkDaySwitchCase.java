package com.upgrad.sarang.FundamentalsOfProgramming.Conditional;

public class WorkDaySwitchCase {
    public static void main(String args[]) {

        int day = 5;

        switch(day) {

            case 1:
                System.out.print("Work Day-Monday");
                break;
            case 2:
                System.out.print("Work Day-Tuesday");
                break;
            case 3:
                System.out.print("Work Day-Wednesday");
                break;
            case 4:
                System.out.print("Work Day-Thursday");
                break;
            case 5:
                System.out.print("Work Day-Friday");
                break;
            default:
                System.out.print("Yayy-Weekend");
                break;
        }
    }
}
