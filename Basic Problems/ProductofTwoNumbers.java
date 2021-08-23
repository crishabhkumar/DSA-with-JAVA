//Define a method that returns the product of two numbers entered by user.
//using function
package com.rishabh;

import java.util.Scanner;

public class ProductofTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Product is " + product(x,y));
    }

    static int product(int a,int b){
        return a*b;
    }
}
