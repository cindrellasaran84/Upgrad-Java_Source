package com.upgrad.sarang.FundamentalsOfProgramming.VariablesDataTypes;

public class VariableExample {
    public static void main(String[] args) {
        int a,b,c;
        a=1;
        b=2;
        c = b;
        b = a;
        a = c;
        //The following two lines will print values of a and b
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
