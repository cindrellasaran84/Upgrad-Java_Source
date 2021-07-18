package com.upgrad.sarang.DSA.Stack.Examples;
import java.util.*;
public class StackPrintFromStart {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromStart(stack);
    }

    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
        int searchIndex = stack.size() - 5;
        if(searchIndex <= 0) {
            System.out.println("There are not enough elements in the stack");
        } else {
            for(int i = 1; i <= searchIndex; i++) {
                stack.pop();
            }
            System.out.println(stack.peek());
        }
    }
}
