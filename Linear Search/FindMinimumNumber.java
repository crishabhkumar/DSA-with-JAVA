package com.rishabh;

public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {4,5,4581,0,51};
        System.out.println(min(arr));
    }


    static int min(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < x){
                x = arr[i];
            }
        }
        return x;
    }
}
