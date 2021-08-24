//Write a function to find if a number if palindrome or not. Take number as parameter.
package com.rishabh;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(palindrome(n));

    }
    static boolean palindrome(int a){
        int original = a;
        int palin = 0;
        while (original!=0){
            int x = original % 10;
            palin = palin * 10 + x;
            original = original/10;
        }
        return palin == a;
    }
}
