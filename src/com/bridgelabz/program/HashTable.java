package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class HashTable {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();
        utility.put(10, "hii");
        utility.put(20, "hii everyone");
        utility.put(40, "hello");
        utility.put(50, "hii Dipali");
        utility.put(60, "Kalpesh");

        utility.printHashTable();
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("frequency of" +" "+ str + " " + utility.getFrequency(str));
    }

}

