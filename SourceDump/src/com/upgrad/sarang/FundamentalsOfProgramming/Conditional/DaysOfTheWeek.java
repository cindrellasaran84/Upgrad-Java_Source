package com.upgrad.sarang.FundamentalsOfProgramming.Conditional;

import java.util.Arrays;
import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int totalNumOfDays = 0;
        int dayNumber = 0;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Enter month
        String month = scan.next();
        // Enter date
        int date = scan.nextInt();
        int index = Arrays.asList(months).indexOf(month) - 1;
        if(index >= 0) {
            for (int i = 0; i <= index; i++) {
                totalNumOfDays = totalNumOfDays + daysInMonths[i];
            }
            totalNumOfDays = totalNumOfDays + date;
            dayNumber = totalNumOfDays % days.length;
            dayNumber = dayNumber == 0 ? 6 : (dayNumber - 1);
        }
        else {
            dayNumber = date - 1;
        }

        String currentDay = days[dayNumber];
        if(currentDay.equals(days[5]) || currentDay.equals(days[6])) {
            System.out.print("Hurray!");
        }
        else {
            System.out.print("Ohhh! It's a work day :|");
        }
        scan.close();


    }
}
