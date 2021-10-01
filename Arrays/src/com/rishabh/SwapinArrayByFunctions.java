package com.rishabh;

import java.util.Arrays;

public class SwapinArrayByFunctions {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,89};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

}
