package com.upgrad.sarang.DSA.Sorting.MergeSort;
import java.util.*;
public class MergeSortedArrays {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);
        int descendingMerge[] = mergeBothInDescendingOrder(sortedArray1, sortedArray2);
        reverse(descendingMerge, descendingMerge.length);

    }

    public static void reverse(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        for (k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }

    public static int[] mergeBothInDescendingOrder(int[] sortedArray1, int[] sortedArray2) {
        int merge[] = new int[sortedArray1.length + sortedArray2.length];
        int i = 0, j = 0, k = 0;
        while (i < sortedArray1.length && j < sortedArray2.length) {
            if (sortedArray1[i] < sortedArray2[j])
                merge[k++] = sortedArray1[i++];
            else
                merge[k++] = sortedArray2[j++];
        }
        while (i < sortedArray1.length) {
            merge[k++] = sortedArray1[i++];
        }
        while (j < sortedArray2.length) {
            merge[k++] = sortedArray2[j++];
        }
        return merge;
    }

    public static int[] getArrayInput(int sizeArray1, Scanner scanner) {
        int[] arr = new int[sizeArray1];
        for (int i = 0; i < sizeArray1; ++i) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
