package com.upgrad.sarang.DSA.Queue.Examples;
import java.util.*;
public class CheckPalindromeUsingQueue {

    public void checkPalindrome(String input) {

        Queue queue = new LinkedList();
        for (int i = input.length()-1; i >=0; i--) {
            queue.add(input.charAt(i));
        }

        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (input.equals(reverseString))
            System.out.println("The given input is a palindrome.");
        else
            System.out.println("The given input is not a palindrome.");
    }
    public static void main(String[] args) {
        CheckPalindromeUsingQueue obj = new CheckPalindromeUsingQueue();
        Scanner in = new Scanner(System.in);
        String inputString = in .nextLine();
        obj.checkPalindrome(inputString);

    }
}
