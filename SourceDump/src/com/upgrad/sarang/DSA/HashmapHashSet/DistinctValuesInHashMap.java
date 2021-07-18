package com.upgrad.sarang.DSA.HashmapHashSet;
import java.util.*;
public class DistinctValuesInHashMap {
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
        Set<String> unique = new HashSet<>();
        for (Map.Entry me : map.entrySet()) {
            unique.add(me.getValue().toString());
        }
        StringBuilder sb = new StringBuilder();
        for(String s : unique) {
            sb.append(s);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
