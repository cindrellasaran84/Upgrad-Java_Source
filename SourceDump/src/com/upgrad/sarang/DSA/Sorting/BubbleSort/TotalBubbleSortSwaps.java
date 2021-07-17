package com.upgrad.sarang.DSA.Sorting.BubbleSort;
import java.util.*;
public class TotalBubbleSortSwaps {
    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;
        //Write your code here
        for (int i = 0; i < size; i++) {
            if(i == M) {
                return totalSwaps;
            }
            // setting the initial value of swap to zero.
            int swap = 0;
            for (int j = 1; j < size - i; j++) {
                if (array[j - 1] < array[j]) {
                    //swapping when element at position j-1 is greater than element at j position.
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swap = 1;
                    totalSwaps++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
        return totalSwaps;
    }

    public static void main(String args[] ) throws Exception {
        TotalBubbleSortSwaps bs = new TotalBubbleSortSwaps();
        Scanner scanner = new Scanner(System.in);
        int iteration = scanner.nextInt();
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(totalBubbleSortSwaps(array, iteration));
    }
}
