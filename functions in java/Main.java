package com.rishabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Q1 take input of two numbers ad print the sum
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1:");
        int num1 = input.nextInt();
        System.out.print("Enter number 2:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum:" + sum);


    }
}
