package com.javabasicprograms;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        /*System.out.print("Please Enter A Number: ");
        Scanner sc = new Scanner(System.in);*/
       /* int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Even Number");
        if (!(n % 2 == 0))
            System.out.println("Odd Number");*/
        /*if (sc.nextInt() % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }*/

        for (int i = 0; i < 10; ++i) {
            if (i % 2 == 0)
                System.out.println(i+" : is a Even Number");
            else
                System.out.println(i+" : is a Odd Number");
        }
    }
}
