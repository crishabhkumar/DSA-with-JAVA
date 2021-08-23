package com.rishabh;

import java.util.Scanner;

public class IsoscalesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lentgh of side:");
        int a = input.nextInt();
        float area = (1.732f * a * a)/4;
        System.out.println("Area is:" + Math.round(area*100)/100.0);

      //  String s = input.
    }
}
