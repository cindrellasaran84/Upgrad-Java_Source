package com.upgrad.sarang.DSA.Stack.Examples;
import java.util.*;
public class ParenthesisMatching {
    public static boolean match(String parens) throws Exception {
        int count = 0;
        char[] chars = parens.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            } else {
                throw new Exception("Invalid character " + c);
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println(match(in.nextLine()));
    }
}
