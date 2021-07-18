package com.upgrad.sarang.DSA.Queue.Examples;
import java.util.*;
public class PrintFromEndUsingQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        printFifthElementFromEnd(queue);
    }

    // Method to print the fifth element from the tail of the queue
    static void printFifthElementFromEnd(Queue<Integer> queue) {
        if(queue.size() < 5) {
            System.out.println("There are not enough elements in the queue");
        } else {
            while(queue.size() > 5) {
                queue.remove();
            }
            System.out.println(queue.peek());
        }
    }
}
