//Write a program to print whether a number is even or odd, also take input.
package com.rishabh;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is Even.");
        }else{
            System.out.println("Number is odd.");
        }
    }
}
