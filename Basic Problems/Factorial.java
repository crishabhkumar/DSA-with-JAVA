//Write a program to print factorial of a number, also take input.
package com.rishabh;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find the facctorial:");
        int x = input.nextInt();
        int ans = 1;
        while(x!=0){
            ans = ans * x;
            x--;
        }
        System.out.println("Factorial is: " + ans);
    }
}
