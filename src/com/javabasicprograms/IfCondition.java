package com.javabasicprograms;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        System.out.println("This code is written by Bala: ");
        System.out.print("Please Enter A Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Even Number");
        if (!(n % 2 == 0))
            System.out.println("Odd Number");
    }
}
