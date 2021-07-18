package com.upgrad.sarang.DSA.Queue.Examples;
import java.util.*;
public class ReverseAQueue {
    static Queue<Integer> q = new LinkedList<Integer>();

    public static void func() {
        Queue<Integer> q1 = new LinkedList<>();

    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            q.add(in.nextInt());
        }
        func();
        System.out.println(q);
    }
}
