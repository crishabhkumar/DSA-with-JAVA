package com.rishabh;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius:");
        float r = input.nextFloat();
        float area = 3.14f * r * r;
        System.out.println("Area is:" + Math.round(area*100)/100.0);

    }
}
