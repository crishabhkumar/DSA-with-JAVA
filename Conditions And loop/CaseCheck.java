package com.rishabh;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        //trim removes all extra space
        //char at zero provide char at index zero or where we want

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lower");
        }else {
            System.out.println("Upper");
        }
        System.out.println(ch);


    }

}
