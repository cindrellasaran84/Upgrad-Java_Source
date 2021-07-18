package com.upgrad.sarang.DSA.PriorityQueueAndHeap;
import java.util.*;
public class MaximumSumPairs {

    public static void main(String args[]) {
        //below two ArrayList are used to store the given input
        ArrayList<Integer> ArrayL1 = new ArrayList<Integer>();
        ArrayList<Integer> ArrayL2 = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        int n, i;

        // size of ArrayL1 = size of ArrayL2 = n
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            ArrayL1.add(in.nextInt());
        }
        for (i = 0; i < n; i++) {
            ArrayL2.add(in.nextInt());
        }

        FindMaximumPair(ArrayL1, ArrayL2);

    }
    static void FindMaximumPair(ArrayList<Integer> ArrayL1,
                                ArrayList<Integer> ArrayL2) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
                Collections.reverseOrder());
        int size = ArrayL1.size();

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                pq.add(ArrayL1.get(i) + ArrayL2.get(j));

        int count = 0;

        while (count < size) {
            System.out.println(pq.peek());
            pq.remove();
            count++;
        }

    }
}
