//Take name as input and print a greeting message for that name.
package com.rishabh;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = input.nextLine();
        System.out.println("Welcome Back! Mr." + name);
    }
}
