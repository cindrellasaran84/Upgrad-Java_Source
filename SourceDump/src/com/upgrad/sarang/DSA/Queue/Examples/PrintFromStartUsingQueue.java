package com.upgrad.sarang.DSA.Queue.Examples;
import java.util.*;
public class PrintFromStartUsingQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        printFifthElementFromStart(queue);
    }

    // Method to print the fifth element from the head of the queue
    static void printFifthElementFromStart(Queue<Integer> queue) {
        if(queue.size() < 5) {
            System.out.println("There are not enough elements in the queue");
        } else {
            for (int i = 0; i < 4; i++) {
                queue.remove();
            }
            System.out.println(queue.peek());
        }
    }
}
