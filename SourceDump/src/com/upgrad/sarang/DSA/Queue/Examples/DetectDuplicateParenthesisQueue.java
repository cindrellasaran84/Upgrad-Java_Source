package com.upgrad.sarang.DSA.Queue.Examples;
import java.util.*;
public class DetectDuplicateParenthesisQueue {
    public static String findDuplicateParenthesis(String inputString) {
        Stack<Character> Stack = new Stack<>();
        char[] str = inputString.toCharArray();
        for (char ch : str) {
            if (ch == ')') {
                char top = Stack.peek();
                Stack.pop();
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return "Input string contains duplicate parenthesis";
                }
            }
            else {
                Stack.push(ch);
            }
        }
        return "Input string does not contain duplicate parenthesis";
    }


    public static void main(String[] args){
        DetectDuplicateParenthesisQueue obj = new DetectDuplicateParenthesisQueue();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));

    }

}
