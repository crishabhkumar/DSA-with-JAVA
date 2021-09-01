//[Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
package com.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element arr[" + i + "]:");
            arr[i] = input.nextInt();
        }
        System.out.print("Array before permutation:");
        System.out.println(Arrays.toString(arr));
        permu(arr);
        System.out.print("Array After permutation:");
        System.out.println(Arrays.toString(arr));

    }

    static void permu(int[] arr){
        int[] arrr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrr[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrr[arrr[i]];
        }

    }
}
