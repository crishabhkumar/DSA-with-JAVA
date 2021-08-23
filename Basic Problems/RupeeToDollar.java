//Input currency in rupee and output in dollar.
package com.rishabh;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rupee value:");
        float rupee = input.nextFloat();
        float dollar = (rupee * 0.013f);
        System.out.println("Dollar value is:" + dollar);

    }
}
