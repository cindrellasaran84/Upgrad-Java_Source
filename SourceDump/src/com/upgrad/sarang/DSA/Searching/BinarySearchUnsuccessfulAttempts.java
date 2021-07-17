package com.upgrad.sarang.DSA.Searching;
import java.util.*;

public class BinarySearchUnsuccessfulAttempts {
    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        int unsuccessfulCount = 0;
        for(int x : inputArr) {
            if(x==key) {
                return unsuccessfulCount;
            }
            unsuccessfulCount++;
        }
        return unsuccessfulCount;
    }

    public static void main(String args[] ) throws Exception {
        BinarySearchUnsuccessfulAttempts bs = new BinarySearchUnsuccessfulAttempts();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getLinearSearchUnsuccessfulComparisonCount(array, key));
    }
}
