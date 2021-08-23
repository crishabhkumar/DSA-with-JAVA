package com.rishabh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle:");
        int l = input.nextInt();
        System.out.print("Enter the breadth of Rectangle:");
        int b = input.nextInt();

        float area = l * b;
        System.out.println("Area of Rectangle:" + area);
    }
}
