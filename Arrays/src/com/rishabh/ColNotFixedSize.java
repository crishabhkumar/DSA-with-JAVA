package com.rishabh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ColNotFixedSize {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,4},
                {789,45}
        };

        Scanner input = new Scanner(System.in);
        System.out.println(arr.length); //gives no of rows
        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) { //we are taking arr[row].length coz 2d array can m*n  means n can be different
                System.out.println(Arrays.toString(arr[row]));

        }
    }
}
