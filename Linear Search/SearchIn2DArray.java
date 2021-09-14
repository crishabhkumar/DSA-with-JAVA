package com.rishabh;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,45,9},
                {8,96},
                {47,69,41},
                {4,3,2},
        };
//        int[] ans = searchin2d(arr,69);
//        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);

    }

    static int max(int[][] arr){
        int max = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }


//    static int[] searchin2d(int[][] arr,int target){
//        if(arr.length == 0){
//            return new int[] {0,0};
//        }
//
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col] == target){
//                    return new int[] {row, col};
//                }
//            }
//        }
//
//        return new int[] {0,0};
//    }
}
