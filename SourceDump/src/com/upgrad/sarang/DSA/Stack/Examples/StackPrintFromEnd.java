package com.upgrad.sarang.DSA.Stack.Examples;
import java.util.*;
public class StackPrintFromEnd {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        int searchIndex = 5;
        int searchElement = 0;
        if(searchIndex > stack.size()) {
            System.out.println("There are not enough elements in the stack");
        } else {
            for(int i = 1; i <= searchIndex; i++) {
                searchElement = stack.pop();
            }
            System.out.println(searchElement);
        }
    }
}
