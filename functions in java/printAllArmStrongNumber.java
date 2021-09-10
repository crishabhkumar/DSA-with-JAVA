package com.rishabh;

import java.util.Scanner;

public class printAllArmStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ISarmstrong(n));

        for (int i = 100; i < 999; i++) {
            if (ISarmstrong(i) == true) {
                System.out.print(i + " ");
            }

        }


    }

    static boolean ISarmstrong(int a){
        int original = a;
        int sum = 0;
        while(a > 0){
            int n = a % 10;
            sum = sum + n*n*n;
            a = a/10;

        }
        return sum == original;
    }
}
