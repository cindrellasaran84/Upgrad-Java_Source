package com.upgrad.sarang.DSA.Sorting.InsertionSort;
import java.util.*;

public class FirstNameAscendingLastNameDescending {
    public static void sort_sub(String array[], int f, String order){
        String temp="";
        for(int i=0;i<f;i++){
            for(int j=i+1;j<f;j++){
                if(order.equals("asc")) {
                    if (array[i].compareToIgnoreCase(array[j]) > 0) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else {
                    if (array[i].compareToIgnoreCase(array[j]) < 0) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        for(String s : array){
            System.out.println(s);
        }
    }

    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }
        sort_sub(firstNames, firstNames.length, "asc");
        sort_sub(lastNames, lastNames.length, "desc");
    }
}
