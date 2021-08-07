package com.upgrad.sarang.DSA.HashmapHashSet;

import java.util.*;
class AnagramKeyValuePair{
    //Method to check if two strings are anagram of each other or not
    public static boolean check(String str1, String str2){
        //Converts the characters in lowercase
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        //If the length of the two strings are not equal, the method will return false
        if(ch1.length == ch2.length){
            arrange(ch1);
            arrange(ch2);
            for(int i = 0; i < ch1.length; i++){
                if(ch1[i] != ch2[i])
                    return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    //Method to sort the character array
    public static void arrange(char[] ch){
        char temp;
        for(int i = 0; i < ch.length-1; i++){
            for(int j = 0; j < ch.length-1-i; j++){
                if(ch[j] > ch[j+1]){
                    temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] x){
        Map<String,String> map = new HashMap<>();


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
        }
        boolean flag = false;
        List<String> l = new ArrayList<String>();
        for(String s : map.keySet()){
            if(check(s,map.get(s))){
                l.add(s);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("false");
        }
        else{
            //This method sorts the elements present in the list
            Collections.sort(l);
            for(String s : l){
                System.out.println(s + " : " + map.get(s));
            }
        }
    }

    private void print(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int m : arr) {
            if(map.containsKey(m)) {
                int count = map.get(m);
                map.put(m, count + 1);
            } else {
                map.put(m, 1);
            }
        }

        for(int l : map.keySet()) {
            if(map.get(l) % 2 == 1) {
                System.out.println(l + " ");
            }
        }
    }
}


