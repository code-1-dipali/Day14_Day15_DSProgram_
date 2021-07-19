package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class SimpleBalanceParenthesis {
    public static void main(String args []) {
        Utility utility = new Utility();
        Scanner sc = new Scanner(System.in);

        System.out.println("input is like ---->(5+6)(7+8)/(4+3)(5+6)(7+8)/(4+3) ");
        System.out.print("Enter arithmetic Operation with brackets: ");
        String arithmeticsOperation = sc.next();
        System.out.println(utility.checkBalancedParenthesis(arithmeticsOperation));
    }
}
