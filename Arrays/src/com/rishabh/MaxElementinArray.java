package com.rishabh;

import java.util.Arrays;

public class MaxElementinArray {
    public static void main(String[] args) {
        int[] arr = {1,3,555,4,89};
        System.out.println(maxele(arr));
    }

    static int maxele(int[] arr) {
        if(arr.length == 0)
            return 0;

        int max = arr[0];//assuming array is non empty
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

//    static int maxerange(int[] arr,int start,int end) {
//        int max = arr[0];//assuming array is non empty
//        for (int i = start; i < end; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
}
