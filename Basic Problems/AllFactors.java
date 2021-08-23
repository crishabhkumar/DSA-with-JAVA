//Input a number and print all the factors of that number (use loops).
package com.rishabh;

import java.util.Scanner;

public class AllFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            if(x%i == 0){
                System.out.println(i);
            }
        }
    }
}
