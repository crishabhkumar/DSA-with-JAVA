//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
//using function
package com.rishabh;

import java.util.Scanner;

public class EligibleforVote {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age:");
        int x = input.nextInt();
        boolean ans = eligible(x);
        if (ans){
            System.out.println("Yes you are eligible to vote.");
        }else {
            System.out.println("Sorry You are not eligible to vote.");
        }
    }

    static boolean eligible(int x){
        return x >= 18;
    }
}
