package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {
        Utility utility = new Utility();
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("\n1. To push in stack");
            System.out.println("2. To print stack");
            System.out.println("3. To pop from stack");
            System.out.println("4. To check if stack is empty");
            System.out.println("5. To peak in stack");
            System.out.println("6. To search from stack");
            System.out.println("7. To exit");
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("\nEnter the data: ");
                    int data = sc.nextInt();
                    utility.push(String.valueOf(data));
                    break;
                case 2:
                    utility.printStack();;
                    break;
                case 3:
                    System.out.println("poped ele--> "+ utility.pop());
                    break;
                case 4:
                    System.out.println("\nis stack empty: "+ utility.isEmpty());
                    break;
                case 5:
                    System.out.println("peak in stack "+ utility.peek());
                    break;
                case 6:
                    System.out.print("\nEnter the data: ");
                    data = sc.nextInt();
                    System.out.println("is "+data+" present in stack: "+utility.searchStack(String.valueOf(data)));
                    break;
                default:
                    flag = false;
            }
        }while(flag);
    }
    }
