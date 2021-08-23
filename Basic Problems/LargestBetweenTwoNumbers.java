//Take 2 numbers as input and print the largest number.
package com.rishabh;

import java.util.Scanner;

public class LargestBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a>b){
            System.out.print(a + " is the largest.");
        }else{
            System.out.print(b + " is the largest.");
        }
    }
}
