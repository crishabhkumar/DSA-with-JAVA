package com.rishabh;

import java.util.Arrays;

public class Change_value_examp {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 2, 3, 4, 6};
        change(arr);
        arr[3] = 85;
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[0] = 99; //if you make a change to the object via this ref variable
    }
}

