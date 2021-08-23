//Define a program to find out whether a given number is even or odd.
package com.rishabh;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("1.To Check Even\n2.To Check Odd");
        System.out.print("Choose 1 or 2:");
        int b = input.nextInt();
        System.out.print("Enter number:");
        int a = input.nextInt();
        switch (b) {
            case 1 -> System.out.println(Even(a));
            case 2 -> System.out.println(Odd(a));
            default -> System.out.println("Please Choose Correct one.");
        }
    }
    static boolean Even(int a){
        return a % 2 == 0;
    }
    static boolean Odd(int a){
        return a % 2 == 1;
    }

}
