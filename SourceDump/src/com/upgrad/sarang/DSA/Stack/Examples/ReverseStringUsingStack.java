package com.upgrad.sarang.DSA.Stack.Examples;
import java.util.*;
public class ReverseStringUsingStack {
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        for (int i = 0; i < data.length(); i++) {
            s.push(data.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!s.empty()) {
            stringBuilder.append(s.pop());
        }
        System.out.println(stringBuilder);

    }
}
