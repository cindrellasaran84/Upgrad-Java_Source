package com.upgrad.sarang.DSA.Stack.Examples;
import java.util.*;
public class ReverseElementsFromMiddle {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();
        int mid = stack.size()/2;
        for(int i = 0; i < mid; i++) {
            left.push(stack.pop());
        }
        while(!left.isEmpty()) {
            right.push(left.pop());
        }
        while(!right.isEmpty()) {
            stack.push(right.pop());
        }
        System.out.println(stack);
    }

}
