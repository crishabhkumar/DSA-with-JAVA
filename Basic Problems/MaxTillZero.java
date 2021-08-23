//Take integer inputs till the user enters 0 and print the largest number from all.
package com.rishabh;

import java.util.Scanner;

public class MaxTillZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        while (true){
            System.out.print("Enter the number:");
            int x = input.nextInt();
            if(x > max){
                max = x;
            }
            if(x == 0){
                break;
            }
        }
        System.out.println("Largest number is:" + max);
    }
}
