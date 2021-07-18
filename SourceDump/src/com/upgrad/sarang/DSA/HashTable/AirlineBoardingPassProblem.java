package com.upgrad.sarang.DSA.HashTable;
import java.util.*;
public class AirlineBoardingPassProblem {
    public static void main(String[] args)
    {
        Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i:arr)
        {
            if(boardingPass.containsKey(i)) {
                System.out.println(i);
            } else {
                boardingPass.put(i, String.valueOf(i));
            }
        }
    }
}


//    The Airline Boarding-Pass Problem
//        Description
//        In an airline ticketing system, they issue unique boarding passes to each of the passengers of a particular flight. Each boarding pass is scanned at the gate to verify that it has not already been used. The system looks into the database and checks whether any boarding pass is already in use. It assumes that the person who checked in first has the original ticket. So, any time a duplicate boarding pass is encountered, the system sends a message: “This is a duplicate boarding pass.”
//
//        Now, the already running system makes use of the conventional method of searching an array for a boarding pass, which obviously takes up time.
//
//        So, you are assigned the task of redesigning the system in such a manner that the overall add and retrieval times get improved or, in other words, you get a constant time.
//
//        Note: For the purpose of simplicity, let’s assume the boarding pass numbers are integers; the HashMap values can be strings that say “Checked”.
//
//        Hint: While adding a number to the hash table, check if it already exists or not.
//
//        Input:
//        1. The first input is 'n', boarding pass numbers.
//        2. The input in next is 'n' boarding pass numbers (space-separated).
//
//        Output:
//        Display the boarding pass number that is a duplicate
//
//        Sample Input-1:
//        8
//        20 17 28 15 24 22 17 21 34
//
//        Expected Output-1:
//        17
//        The input 8 here represents the number of boarding passes scanned. The next input is 8 boarding pass numbers space-separated. The output here is the pass number that is duplicate, 17.
//
//        Sample Input-2:
//        5
//        3 9 34 1 3
//
//        Expected Output-2:
//        3
//        The input 5 here represents the number of boarding passes scanned. The next input is 5 boarding pass numbers space-separated. The output here is the pass number that is duplicate, 3.
