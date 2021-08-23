//Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
package com.rishabh;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal value:");
        int principal = input.nextInt();
        System.out.print("Enter the rate value:");
        float rate = input.nextFloat();
        System.out.print("Enter the time(in YEARS) value:");
        float time = input.nextFloat();

        float si = (principal * rate * time) / 100;
        System.out.println("SimpleIntrest is:" + si);
    }
}
