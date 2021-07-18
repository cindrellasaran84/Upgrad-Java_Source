package com.upgrad.sarang.DSA.Stack.Examples;
import java.util.*;
public class SortInStack {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!stack.isEmpty())        {

            int tmp = stack.pop();

            while(!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp)
            {
                stack.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        System.out.println(tmpStack);
    }
}
