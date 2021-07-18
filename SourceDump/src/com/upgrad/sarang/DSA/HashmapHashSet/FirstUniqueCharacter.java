package com.upgrad.sarang.DSA.HashmapHashSet;
import java.util.*;
public class FirstUniqueCharacter {

    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);

        //storing the input string to String variable "str"
        String str = in.nextLine();
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (linkedHashMap.containsKey(ch) == false) {
                linkedHashMap.put(ch, 1);
            } else {
                linkedHashMap.put(ch, linkedHashMap.get(ch) + 1);
            }
        }
        String isFound = "-1";
        for (Character ch : linkedHashMap.keySet()) {
            if (linkedHashMap.get(ch) == 1) {
                isFound = ch.toString();
                break;
            }
        }
        System.out.println(isFound);
    }
}
