package com.upgrad.sarang.DSA.Searching;

import java.util.*;

public class LinearSearch {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {

            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        int inc = count-1;
        for(int j=0; j<count;j++) {
            if(array[inc] == key) {
                System.out.println(j);
                return;
            }
            inc--;
        }

    }
}

