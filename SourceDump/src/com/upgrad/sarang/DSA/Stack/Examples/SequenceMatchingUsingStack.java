package com.upgrad.sarang.DSA.Stack.Examples;
import java.util.*;
public class SequenceMatchingUsingStack {

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> tempStack2 = new Stack<>();
        while(!sequence2.isEmpty()) {
            if(sequence1.contains(sequence2.peek())) {
                tempStack.add(sequence2.pop());
            } else {
                sequence2.pop();
            }
        }
        while(!tempStack.isEmpty()) {
            tempStack2.push(tempStack.pop());
        }
        if(sequence1.size() != tempStack2.size()) {
            return false;
        }
        while(!tempStack2.isEmpty()) {
            if(tempStack2.peek().equals(sequence1.peek())) {
                tempStack2.pop();
                sequence1.pop();
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }
}
