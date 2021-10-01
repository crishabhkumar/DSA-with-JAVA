package com.rishabh;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 25;
//        arr[1] = 45;
//        arr[2] = 245;
//        arr[3] = 455;
//        arr[4] = 251;
//        //[25,45,245,455,251
//        System.out.println(arr[3]);
//
//        //input using for loops
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
////
//        System.out.println(Arrays.toString(arr)); //best way to print array

        //outut using loop

//        for (int j : arr) { //for every element in array ,print the element
//            System.out.println(j);  //here j represents element of the array
//        }
//
//
//        System.out.println(arr[5]); //out of size error

        //al above is array of primitve

        //Now
        //array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length ; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1] = "Rishabh";
        System.out.println(Arrays.toString(str));




    }

}
