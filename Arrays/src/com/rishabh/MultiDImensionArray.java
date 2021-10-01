package com.rishabh;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDImensionArray {
    public static void main(String[] args) {
        /*
            1 2 3
            4 6 5
            7 8 9
         */
//        int[][] arr = new int[3][]; //syntax = adding number of coulmns is not mandatory
//        int[][] arr2D = {
//                {1,2,3},      //0th index
//                {4,5,4,5},      //1st index
//                {7,8,9},      //2nd index  arr2D[2] = {7,8,9}
//        };
//        //
//        System.out.println(Arrays.toString(arr));


        Scanner input = new Scanner(System.in);
        //INPUT
        int[][] arr = new int[3][3];
        System.out.println(arr.length); //gives no of rows
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { //we are taking arr[row].length coz 2d array can m*n  means n can be different
                System.out.print("Enter arr ["+row+"]["+col+"]:");
                arr[row][col] = input.nextInt();
            }
        }

        //Output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); //for printing in matrix representation
        }

        //enchanced for loop
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println(); //for printing in matrix representation
        }




        //another way to print arrays
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));  //arr[row] is itself an array
        }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));  //arr[row] is itself an array
        }

    }
}
