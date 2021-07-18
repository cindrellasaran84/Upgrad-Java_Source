package com.upgrad.sarang.DSA.Stack.Examples;
import java.util.*;
public class FindKthLargestElementStack {
    // This function returns the sorted stack
    public static Stack < Integer > sortStack(Stack < Integer > input) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            int tmp = input.pop();

            while(!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp)
            {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
        for(int i = 0; i < k-1; i++) {
            sortedStack.pop();
        }
        System.out.println(sortedStack.peek());
    }


    public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        // This is the temporary stack

        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);

    }
}
