//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package com.rishabh;
import java.util.Scanner;

public class TillEnterZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("Enter the number:");
            int x = input.nextInt();
            sum = sum + x;
            if(x == 0){
                break;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
