package com.rishabh;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of Triangle:");
        int h = input.nextInt();
        System.out.print("Enter the length of base:");
        int b = input.nextInt();

        float area = 0.5f * b * h;
        System.out.println("Area of Triangle is:" + area);
    }
}
