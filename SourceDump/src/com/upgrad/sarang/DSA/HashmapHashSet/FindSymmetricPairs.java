package com.upgrad.sarang.DSA.HashmapHashSet;
import java.util.*;
public class FindSymmetricPairs {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i][1])) {
                if(arr[i][0] == map.get(arr[i][1])) {
                    isFound = true;
                    System.out.println(arr[i][1] + " " + arr[i][0]);
                }
            } else {
                map.put(arr[i][0], arr[i][1]);
            }
        }
        if(!isFound) {
            System.out.println("No Symmetric pair");
        }
    }
}
