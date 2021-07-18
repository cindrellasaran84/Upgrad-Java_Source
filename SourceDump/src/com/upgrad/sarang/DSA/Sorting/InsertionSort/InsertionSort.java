package com.upgrad.sarang.DSA.Sorting.InsertionSort;

public class InsertionSort {

    public static void insertSort(int[] arr){

        for( int i =1 ;i<arr.length;i++){
            int v = arr[i];
            int  j= i;

            while(j>=1 && arr[j-1]>v){
                arr[j]=arr[j-1];
                j--;
            }

            arr[j]=v;
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,1,0,9,5,13};
        insertSort(arr);
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
