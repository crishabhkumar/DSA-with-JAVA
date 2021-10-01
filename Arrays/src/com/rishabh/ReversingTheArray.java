package com.rishabh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversingTheArray {
    public static void main(String[] args) {
        int[] arr = {1,3,555,40,890};
        System.out.println(Arrays.toString(arr));
        revarr(arr);
        System.out.println(Arrays.toString(arr));
    }

//    static void revarr(int[] arr) {
//        int temp = 0;
//        for (int i = 0; i < arr.length / 2; i++) {
//            temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//    }
//

    //Another way
    static void revarr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            swap (arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}