package com.upgrad.sarang.DSA.Sorting.QuickSort;
import java.util.*;
public class QuickSortByStringLength {
    public static void quickSort(String array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }
    }

    public static int partition(String[] ar, int start, int end) {
        String pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j].length() <= pivot.length()) {
                String temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        String temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;
        return i;
    }

    static void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountStrings = scan.nextInt();
        String[] arr = new String[amountStrings];
        for (int i = 0; i < amountStrings; i++) {
            arr[i] = scan.next();
        }
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

}
