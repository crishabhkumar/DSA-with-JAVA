//Write a function that returns the sum of first n natural numbers.
package com.rishabh;

import java.util.Scanner;

public class sum_of_n_natural_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = input.nextInt();
        System.out.println("Sum of " + n + " natural number is:" + sum(n));


    }
    static int sum(int n){
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}
