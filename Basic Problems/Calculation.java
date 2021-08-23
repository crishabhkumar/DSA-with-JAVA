//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.rishabh;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number:");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a+b;
        int sub = a-b;
        int multi = a*b;
        int divi = a/b;
        System.out.println("Sum is:"+sum+"\nSubtration is:"+sub+"\nMultiplication is:"+multi+"\nDivision is:"+divi);
    }
}
