package com.rishabh.questions;

import java.util.Arrays;

public class Q4StartAndEndIndex {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};

        int target = 6;
      //  System.out.println(Arrays.toString(startend(arr,target)));
    }

    public int[] startend(int[] arr, int target) {
        int[] retarray = {-1, -1};

        //check for first occurrence if target first
        int start = search(arr,target,true);
        int end = search(arr,target,false);

        retarray[0] = start;
        retarray[1] = end;
        return retarray;
    }

    //this function just returns the index value of target
    int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //int mid = (start + end)/2;  //might be possible the start + end exceeds the range of int
            //hence it may give to error
            //best way to code is
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
